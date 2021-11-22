package _07_ForLoop;

import java.util.Scanner;

public class Q11 {
    
    public static void main(String[] args) {
    	/*
        Bir sayinin mükemmel olup olmadiğini bulan bir method yaziniz.
        Mükemmel sayi : bir sayinin kendisi hariç bölenlerinin toplamı, kendisine eşitse o sayi mükemmeldir.
        ORNEK:
        INPUT     : 6
        OUTPUT : 1,2,3
                      1+2+3 = 6 = 6 (Mükemmel)

                      mukemmel sayi kontrolu
                      1. kullanicidan sayi alalim
                      2. bir toplam degiskeni olusturuyoruz
                      3. sayinin bolenleri bul
                      4. bolenleri toplamla topla
                      5. sayiyla toplamin esitligini kontrol et

        */

    	Scanner scan=new Scanner(System.in);
    	
    	System.out.print("Lutefen bir sayi giriniz :");
    	
    	int num=scan.nextInt();
    	int toplam=0;
    	for (int i = 1; i < num; i++) {
    		if (num%i==0) { toplam+=i;
    		System.out.println("Bolen : " + i);
			}
    		
		}
    	 System.out.println(" ");
    	if (toplam==num) { System.out.print("Girdiginiz sayi mukemmel sayidir, bolenleri toplami sayinin kendisine esittir. \nBolenlerin toplami : " + toplam);
			
		} else {System.out.print("Girdiginiz sayi mukemmel sayi degildir, bolenleri toplami sayinin kendisine esit degildir. \nBolenlerin toplami : " + toplam);

		}
   
    	scan.close();
    }


}
