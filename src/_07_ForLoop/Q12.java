package _07_ForLoop;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {

    /*  Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
         ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
         hesaplayan kodu yazınız.

         Örnek Ekran Çıktısı
        Girilen sayı=4
        Kareler toplamı=30
     */

    	Scanner scan=new Scanner(System.in);
    	
    	System.out.print("Lutfen 1'den buyuk bir tam sayi giriniz : ");

    	int num=scan.nextInt();
    	int toplam=0;
    	if (num>=2) { for (int i = 1; i < num; i++) { toplam+=i*i;
			System.out.print(toplam + " ");
		}
			
		} else { System.out.println("Lutfen birden buyuk bir sayi giriniz !!!");

		}
    	System.out.println(" ");
    	System.out.println("Girilen sayiya kadar olan sayilarin karelerinin toplami : " + toplam);
        scan.close();
    }
}
