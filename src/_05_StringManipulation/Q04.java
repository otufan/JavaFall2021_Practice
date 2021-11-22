package _05_StringManipulation;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        // Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi tersten yazdirin

       
    	Scanner scan=new Scanner(System.in);
    	
    	System.out.print("Lutfen 4 harften olusan bir kelime giriniz : ");
    	
    	String str=scan.nextLine();
    	
    	if (str.length()>=5) { System.out.println("Hatali giris yaptiniz!!! \nLutfen 4 harften olusan bir kelime giriniz!");
			
		} else {System.out.println("Girilen kelimenin tersten yazilisi :" + str.charAt(0)+str.charAt(1)+str.charAt(2)+str.charAt(3));
			
		}
    	
    	
    	scan.close();
    }
}
