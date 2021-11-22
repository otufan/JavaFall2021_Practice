package _07_ForLoop;

import java.util.Scanner;

public class Q14 {

    public static void main(String[] args) {
    	  /*  Problem Tanımı
        Girilen bir sayı kadar satır ve sütünu olan ve
        sağ kenara dayalı üçgeni basan kodu yazınız.

        Ekran Çıktısı
        Bir sayi giriniz: 5
            *
           **
          ***
         ****
        *****

        */


       
         /*
                    *
                    * *
                    * * *
                    * * * *
                    * * * * *
                    şeklini yazdırınız
             */

    	Scanner scan=new Scanner(System.in);
    	
    	System.out.print("Lutfen bir tam sayi giriniz : ");
    	
    	int sayi=scan.nextInt();
    	
    	for (int satir = 0; satir <= sayi; satir++) {
    		for (int sutun = 0; sutun < satir; sutun++) {
    			
    			System.out.print("*");
		
			}
			System.out.println("");
		}
        scan.close();
        
    }
}
