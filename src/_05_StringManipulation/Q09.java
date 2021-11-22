package _05_StringManipulation;

import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {

		/*
				StringMethods:
				Kullanicidan alinan cift uzunlukta bir stringin ilk yarisini konsolda yazdirmak icin bir Java programi yaziniz.
	    	    ORNEK:
		     	INPUT      :  Python
				OUTPUT :   Pyt
	    */
       
    	Scanner scan=new Scanner(System.in);
    	
    	System.out.println("Cift haneli bir degisken giriniz : ");
    	
    	String str=scan.nextLine();
    	
    	if (str.length()%2!=0) { System.out.println("Lutfen cift uzunlukta bir kelime giriniz!!!");
			
		} else { System.out.print("Girilen kelimenin ilk yarisi :" + str.substring(0, str.length()/2) );
			
		}
    	scan.close();
    }
}
