package _08_While_DoWhile;

import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {
//  kullanicinin INTEGER OLAN PIN kodunuzu kontrol eden bir kod yazınız.

    	Scanner scan=new Scanner(System.in);
    	
    	System.out.print("Lutfen PIN giriniz : ");
	
    	int pin=scan.nextInt();
    	
    	
    	int sabitPin=1234;
    	
    	while (pin!=sabitPin) {
    		
    		System.out.print("Hatali giris yaptiniz tekrar giriniz : ");
    		
    		pin=scan.nextInt();
    		
		}
    	
    	System.out.println("Basarali giris yaptiniz!");
    	
    }
}