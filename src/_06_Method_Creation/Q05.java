package _06_Method_Creation;

import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {
         /*
        Problem tanımı :
        Bir String içinde kaç kelime olduğunu yazdıran bir method yazınız.
       Test Data:
       Input the string: The quick brown fox jumps over the lazy dog.
 	   Expected Output: Number of words in the string: 9
         */

    	Scanner scan=new Scanner(System.in);
    	
    	System.out.print("Lutfen kelime sayini ogrenmek istediginiz cumleyi giriniz : ");
    	String str=scan.nextLine();
    	
    	kelimeSayisi(str);
    	
    	scan.close();
    }

	private static void kelimeSayisi(String str) {
		char bosluk=' ';
    	int toplam=0;
    	
    	for (int i = 0; i <str.length(); i++) {
    	
    		
    		if (str.toLowerCase().charAt(i)==bosluk) {toplam++;
				
			}
			
		}
    	
    	System.out.println("Cumle icinde gecen kelime sayisi : " + (toplam+1) + " olarak belirlenmistir.");

       
		
	}
}
