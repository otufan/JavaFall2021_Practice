package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q08 {
	
	public static void main(String[] args) {
		/*
		 * Problem tanimi : 
		 * 
		 * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
		 * musteri karti olup olmadigini sorun
		 * 
		 * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin 
		 * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
		 * alirsa %10 indirim yapin
		 */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Lutfen urun adedini giriniz :");
		
		int adet=scan.nextInt();
		
		System.out.print("Lutfen urunun liste fiyatini giriniz :");
		
		double fiyat=scan.nextDouble();
		
		System.out.print("Musteri kartiniz var mi? (evet/hayir)");
		
		String kart=scan.next();
		
		if (kart.toLowerCase().contains("evet")|| kart.toLowerCase().contains("hayir")) { if (kart.toLowerCase().contains("evet")) { 
			
			 System.out.println(adet>10 ? "Musteri kartiniz oldugu ve 10 urunden fazla aldiginiz icin %20 indirimli fiyat : " + (adet*fiyat*0.8)+ " $" :
					
					"Musteri kartiniz oldugu icin ve 10 urunden az aldiginiz icin %15 indirimli fiyat : " + (adet*fiyat*0.85)+ " $"); 
			
		}
		 else { System.out.println(adet>10 ? "Musteri kartiniz OLMADIGI icin ve 10 urunden fazla aldiginiz icin %15 indirimli fiyat : " + (adet*fiyat*0.85)+ " $" :
					
					"Musteri kartiniz OLMADIGI icin ve 10 urunden az aldiginiz icin %10 indirimli fiyat : " + (adet*fiyat*0.90) + " $");
		 }}
		
		else {System.out.println("Lutfen Musteri kartinizin olup olmadigini *evet veya *hayir diyerek kodlayiniz!");
		}

		
		scan.close();
		
	}
		
}

