package javaProjects.kitapYonetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class KitapMethod extends KitapDepo{
	
	protected void islem(int islemNo) {
		Scanner scan=new Scanner(System.in);
		switch (islemNo) {
		case 1:
			kitapEkleme();
			break;
		case 2:
			System.out.println(KitapDepo.KitapListe);
			System.out.print("Kac numarali kitabi sistemden silmek istediginizi giriniz :");
			this.kitapNo=scan.nextInt();
			kontrol(kitapNo);
			kitapSilme(kitapNo);
			break;
		case 3:
			kitapListeleme();
			break;
		case 4:
			cikis();
			break;
		default:
			break;
		}	
	}
	
	protected int kontrol(int kitapNo) {
		Scanner scan=new Scanner(System.in);
		int toplam=0;
		for (KitapDepo each : KitapListe) {
			if(each.kitapNo!=kitapNo) {
				continue;
			}else { toplam++; 
			}
			
			if (toplam>0) {
			System.out.println("Lutfen gecerli bir kitap numarasi giriniz!");
			kitapNo=scan.nextInt();
			kontrol(kitapNo);	
			} 
			else {break;
			}
		}
		return kitapNo;
	}

	protected List<KitapDepo> kitapEkleme() {
		Scanner scan=new Scanner(System.in);
			
		System.out.print("Lutfen kitap ismini giriniz :");
		String kitapIsmi=scan.nextLine();
		
		System.out.print("Lutfen kitabin yazarini giriniz :");
		String yazar=scan.nextLine();
		
		System.out.print("Lutfen kitabin numarasini giriniz :");
		int kitapNo=scan.nextInt();
		KitapDepo giris=new KitapDepo(kitapIsmi, yazar, kitapNo);
		
		KitapDepo.KitapListe.add(giris);
		return KitapDepo.KitapListe;
	
	}
	protected void kitapSilme(int kitapNo) {
		KitapDepo.KitapListe.remove(kitapNo);
		
	}
	protected void kitapListeleme() {
		
		for (int i = 0; i < KitapDepo.KitapListe.size(); i++) {
			System.out.println(KitapDepo.KitapListe.get(i).kitapIsmi);
		}
		
		
		System.out.println(KitapDepo.KitapListe);
		
	}
	protected void cikis() {
		System.out.println("Islemleriniz basari ile kaydedildi! \nCikis isleminiz gerceklestirildi!");
	}
}
