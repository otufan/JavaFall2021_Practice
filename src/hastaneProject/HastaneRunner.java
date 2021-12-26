package hastaneProject;

import javaProjects.hastaneOtomasyon.Durum;

public class HastaneRunner {

	static VeriBankasi veri=new VeriBankasi();
		
	public static void main(String[] args) {
	
		
		String hastaDurumu="Allerji";
		String unvan=doktorUnvan(hastaDurumu);
		System.out.println("Hasta Sikayeti : " + hastaDurumu);
		if (hastaDurumuBul(hastaDurumu)) {
			System.out.println("Hasta acileyeti VAR");
			
		}else {
			System.out.println("Hasta acileyeti YOK");
			
		}
		System.out.println(" ");
		System.out.println("***Hasta Bilgileri***" + "\nHasta ismi : " + hastaBul(hastaDurumu).getIsim() + "\n" + "Hasta soyismi :" +
		hastaBul(hastaDurumu).getSoyIsim() +"\n" + "Hasta ID si : " + hastaBul(hastaDurumu).getHastaID());  ;
		System.out.println("****Tavsiye edilen Doktor Bilgileri**** " + " \n" + "Doktor Ismi : " + 
		doktorBul(unvan).getIsim()+"\n" + "Doktor Soyismi : " +
		doktorBul(unvan).getSoyIsim()+" \n" + "Doktor unvani :" + doktorBul(unvan).getUnvan());

	}

	public static String doktorUnvan(String aktuelDurum) {
		Doktor doktor=new Doktor();
		//VeriBankasi veri=new VeriBankasi();
		
		for (int i = 0; i < veri.durumlar.length; i++) {
			
			if (aktuelDurum.contains(veri.durumlar[i])) {
			doktor.setUnvan(veri.unvanlar[i]);
			
			} 
			
		}
		return doktor.getUnvan();
			
			}
	
	public static Doktor doktorBul(String unvan){
		
		Doktor doktor= new Doktor();
		//VeriBankasi veri=new VeriBankasi();
		
		for (int i = 0; i < veri.unvanlar.length; i++) {
			if (veri.unvanlar[i].contains(unvan)) {
		doktor.setIsim(veri.doctorIsimleri[i]);
		doktor.setSoyIsim(veri.doctorSoyIsimleri[i]);
		doktor.setUnvan(unvan);
			}
		
		}
		
		return doktor;
		
		}
	
	public static boolean hastaDurumuBul(String aktuelDurum) {
		Durum durum=new Durum();
		
		switch (aktuelDurum) {
		case "Allerji":
			durum.setAciliyet(false);
			break;
		case "Bas agrisi":
			durum.setAciliyet(false);
			break;
		case "Diabet":
			durum.setAciliyet(false);
			break;
		case "Soguk alginligi":
			durum.setAciliyet(false);
			break;
		case "Migren":
			durum.setAciliyet(true);
			break;
		case "Kalp hastaliklari":
			durum.setAciliyet(true);
			break;
		default:
			System.out.println("Gecerli bir durum degil");
			break;
		}
		
		return durum.isAciliyet();
		
	}
	
	public static Hasta hastaBul(String actualCase) {
		Hasta hasta=new Hasta();
		
		for (int i = 0; i < veri.durumlar.length; i++) {
			if (actualCase.contains(veri.durumlar[i])) {
				hasta.setIsim(veri.hastaIsimleri[i]);
				hasta.setSoyIsim(veri.hastaSoyIsimleri[i]);
				hasta.setHastaID(veri.hastaIDleri[i]);
				
			}
		}
		
		hastaDurumuBul(actualCase);
		return hasta;
		
	}
	
}
