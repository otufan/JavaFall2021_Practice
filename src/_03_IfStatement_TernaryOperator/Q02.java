package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
	/*
	 *  Kullanicidan 3 tene pozitif  tam sayi alniz. 
	 *  bu uc sayinin ucgen olusturma durumunu kontrol ediniz
	    eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz
	     
	     ucgen olma sarti :herhangi iki kenar toplami diger kenardan buyuk, herhangi iki kenar farki diger kenardan buyuk olmali
		 a+b>c>a-b
		 a+c>b>a-c  
	     b+c>a>b-c  
		a=b=c ise es kenar ucgen 
		 
	 */
	
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen uc tane sayi giriniz, her sayidan sonra enter tusuna basiniz:");
	
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		
		int fark1=a-b<0 ? b-a : a-b;
		int fark2=a-c<0 ? c-a : a-c;
		int fark3=b-c<0 ? c-b : b-c;
		
		if (((a+b)>c&&c>fark1)&&((a+c)>b&&b>fark2)&&((b+c)>a&&a>fark3)) { if (a==b&&a==c) {System.out.println("Girilen sayilarla eskenar ucgen olusturulabilir");
			
		} else { System.out.println("Girilen sayilardan ucgen olusturulabilir");

		}
			
		} else { System.out.println("Girilen sayilarla ucgen OLUSTURULAMAZ");

		}
			
		scan.close();

	}

}
