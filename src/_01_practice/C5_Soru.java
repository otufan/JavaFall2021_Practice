package _01_practice;

import java.util.Scanner;

public class C5_Soru {

	public static void main(String[] args) {
	
		//kullanicinin ad soyad yas boy kilosunu alt alata yazdiriniz
		

		Scanner scan=new Scanner(System.in);
		
		System.out.print("Lutfen adinizi giriniz:");
		
		String ad=scan.nextLine();
		
		System.out.print("Lutfen soyadinizi giriniz:");
		
		String soyad=scan.nextLine();
		
		System.out.print("Lutfen yasinizi giriniz:");
		
		int yas=scan.nextInt();
		
		System.out.print("Lutfen boy giriniz:");
		
		int boy=scan.nextInt();
		
		System.out.print("Lutfen kilonuzu giriniz:");
		
		Double kilo=scan.nextDouble();
		
		System.out.println("Ad:" + ad+ "\n" + "Soyad:"+ soyad + "\n" +"Yas:" + yas + "\n" + "Boy:" + boy + "\n" + "Kilo:" + kilo);
		
	}

}
