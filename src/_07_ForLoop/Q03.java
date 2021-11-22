package _07_ForLoop;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

        /*
        Girilen bir stringdeki a harfi sayısını bulunuz.
        ama  c harfine  gelirse döngüden çıkılsın

        Bugün hava oldukca güzel.-> 2
         

         */
        
    	Scanner scan=new Scanner(System.in);
    	
    	System.out.print("Lutfen bir String degeri giriniz : ");
    	
    	String str=scan.nextLine();
    	
    	
    	
    	
    	int uzunluk=0;
    	int c=str.indexOf("c");
    	
    	if (str.toLowerCase().contains("c")) { uzunluk=c;
			
		} else { uzunluk=str.length();

		}
    	
    	int toplam=0;
    	
    	for (int i = 0; i < uzunluk; i++) {
    		
    		if (str.toLowerCase().charAt(i)=='a') { toplam++;
				
			} 
			/*for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase().charAt(i) == 'a') {
                aMiktari++;
            } else if (str.toLowerCase().charAt(i) == 'c') {
                break;
            }*/
    		
		}
    	
    	System.out.println("c harfine kadar String icinde toplam: " + toplam +" adet a vardir.");
    	
    	scan.close();
    }

}
