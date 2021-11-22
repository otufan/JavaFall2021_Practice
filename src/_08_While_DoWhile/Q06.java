package _08_While_DoWhile;

import java.util.Scanner;

public class Q06 {
	static int bolum=0;

	public static void main(String[] args) {
		// kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru 
		//kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.
		

		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Lutfen bolunmesini istediginiz bir sayi giriniz : ");
		
		int sayi=(int) scan.nextDouble();
		
		System.out.print("Lutfen sayinizin kaca bolunnmesini istediginiz sayiyi giriniz : ");
		
		int bolen=(int) scan.nextDouble();
		
		bolumIslemi(sayi, bolen);
		
		scan.close();
		
		
	}

	private static void bolumIslemi(int sayi, int bolen) {
		
		int bolum=0;
		
		do { sayi-=bolen;
		
		bolum++;
			
		} while (sayi>=bolen);
		
		System.out.println("Sayinizin " +bolen + " sayisina bolumunun sonucu :" + bolum);
		
	}

}