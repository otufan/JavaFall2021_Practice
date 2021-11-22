package _07_ForLoop;

import java.util.Scanner;

public class Q13 {
	
	
	public static void main(String[] args) {
		
		/*
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         *
         * ORNEK:
         *
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         *
         * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
         */

		Scanner scan=new Scanner(System.in);
		
		System.out.print("Lutfen bir cumle giriniz : ");
		
		String cumle=scan.nextLine();
		int cumleUzunluk=cumle.length();
		System.out.print("Lutfen cumle icinde kac tane bulundugunu ogrenmek istediginiz karakteri giriniz : ");
		
		
		String str=scan.nextLine();
		
		int strUzunluk=str.length();
	
		
		int toplam=0;
		
		if (strUzunluk==1) { for (int i = 0; i < cumleUzunluk; i++) {
			
			if(cumle.toLowerCase().charAt(i)==str.toLowerCase().charAt(0)) {toplam++;
			
			}
	}

}else { System.out.println("Lutfen sadece bir karakter giriniz!!!");

}
		System.out.println(" ");
		System.out.print("Toplam karakter sayisi : " + toplam);
		scan.close();
	}
}
