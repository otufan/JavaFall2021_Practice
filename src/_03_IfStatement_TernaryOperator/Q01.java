package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
		 *  dort islemden biri ile isleme koyup sonucun yazdiriniz
		 */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen sirayla iki sayi giriniz, girdiler arasi enter tusuna basiniz!!");
		
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		
		double carpimSonucu=sayi1*sayi2;
		
		double bolmeSonucu=sayi1*sayi2;
		
		System.out.print("Toplama icin-> 1 \nCikarma icin -> 2 \nCarpma-> 3 \nBolme ->4 \nLutfen girisinizi yapiniz:");
		
		int islem=scan.nextInt();
		
		if (islem==1) { System.out.println("Girdiginiz sayilarin toplami :" + (sayi1+sayi2));
			
		}
	
		else if (islem==2) {System.out.println("Girdiginiz sayilarin farki :" + (sayi1-sayi2));
			
		}
		else if (islem==3) {System.out.println("Girdiginiz sayilarin carpimi :" + (sayi1*sayi2));
		
		}
		else if (islem==4) {System.out.println("Girdiginiz sayilarin orani :" + (sayi1/sayi2));
		
		}
	
		else { System.out.println("Hatali giris yaptiniz!!!");
			
		}
	}

}
