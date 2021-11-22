package _08_While_DoWhile;

import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {
        // Kullanıcıdan 5 sayı isteyiniz, bu sayılardan en büyüğünü bularak yazdırınız.

    	Scanner scan=new Scanner(System.in);
    	
	
    
    	int sayiEnBuyuk=0;
    	
    	int giris=0;
    	int deneme=1;
    	
    	while (deneme!=6) {
    		
    		System.out.print(deneme+"."+ "sayiyi giriniz : ");
    		deneme++;
    		giris=scan.nextInt();
    		
    		if (giris>sayiEnBuyuk) { sayiEnBuyuk=giris;
				
			} 
			
		}
    	System.out.println("Girilen sayilarin en buyugu : " + sayiEnBuyuk);
    
    	
    	
    }
}