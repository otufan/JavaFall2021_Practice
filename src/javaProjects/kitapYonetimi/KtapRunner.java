package javaProjects.kitapYonetimi;

import java.util.Arrays;
import java.util.Scanner;

public class KtapRunner extends KitapMethod{

	static {
		
		System.out.println("---- Kitap Uygulamasina hosgeldiniz ----");
		
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		KitapMethod runner=new KitapMethod();
		KitapDepo islem=new KitapDepo();
		
		System.out.println(islem.menu);
		int islemNo=0;
	
			System.out.print("Lutfen yapmak istediginiz islem numarasini giriniz :");
			islemNo=scan.nextInt();
			System.out.println(islem.menu);
			
			
		
			System.out.print("Lutfen yapmak istediginiz islem numarasini giriniz :");
			islemNo=scan.nextInt();
			System.out.println(islem.menu);
			
		
		  
	}

}
