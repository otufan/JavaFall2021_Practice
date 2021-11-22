package _01_practice;

import java.util.Scanner;

public class C5_SoruCevap {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Lutfen bir tam sayi giriniz:");
		
		int sayi1=scan.nextInt();
		
		System.out.print("Lutfen bir tam sayi daha giriniz:");
		
		int sayi2=scan.nextInt();
		
		System.out.println("Girilen sayilarin toplami:" + (sayi1+sayi2) + "\n" + "Girilen sayilarin farki:" + (sayi1-sayi2) + "\n" 
				+ "Girilen sayilarin carpimi:" + (sayi1*sayi2) + "\n" + "Girilen sayilarin birbirine bolumu:" + ((double)sayi1/sayi2));

	}

}
