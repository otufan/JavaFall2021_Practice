package _05_StringManipulation;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        /*
         * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
         * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
         *
         * ornek
         * input = Ali
         * output = lilili
         *
         * input = el
         * output = el
         */
       
    	Scanner scan=new Scanner(System.in);
    	
    	System.out.print("Lutfen bir String degeri giriniz :");
    	
    	String str=scan.nextLine();
    	
    	int boyut=str.length();
    	
    	if (boyut>=3) {
    		
    		int sI=(str.length()-2);
    		String newStr=str.substring(sI)+str.substring(sI)+str.substring(sI);
    		
    		System.out.print("Girilen kelimenin degistirilmis hali :" + newStr );
			
		} else { System.out.print("Girilen kelime :" + str);

		}
    	
    	scan.close();
    	
    }
}
