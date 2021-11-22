package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan 1 harf (karakter) aliniz ve bunun buyuk harf, kucuk harf yada 
		hatali giris seklinde kod yazniz
		 */
		 
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir harf giriniz :");
		
		char karakter=scan.next().charAt(0);
		
		if ('A'<=karakter&&'Z'>=karakter) { System.out.println("Girilen karakter " + karakter + " BUYUK HARFTIR");
			
		} else { if ('a' <=karakter&&'z'>=karakter) { System.out.println("Girilen karakter " + karakter + " KUCUK HARFTIR");
			
		} else { System.out.println("Hatali giris yapilmistir. Lutfen bir harf giriniz");

		}

		}
		

	}

}
