package _06_Method_Creation;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
		/*
		name1 ve name2 degiskenlerini olusturun.
		name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
		name1 degiskeninin karakter sayisi tek ise "name1 cift sayili olmadigi icin ortasina yerlestiremedik" yazdirinan bir method oluşturun
		          e.g:
		         name1= mehmet
		         name2= ahmet
		         Print ==> mehahmetmet
		*/
       
    	Scanner scan=new Scanner(System.in);
    	
    	System.out.print("Lutfen birinci ismi giriniz : ");
    	
    	String isim1=scan.nextLine();
    	
    	System.out.print("Lutfen ikinci ismi giriniz : ");
    	
    	String isim2=scan.nextLine();
    	
    	ikiIsimBirlestirme(isim1, isim2);
    	
    	scan.close();
    	
}

	public static void ikiIsimBirlestirme(String isim1, String isim2) {
		
		if (isim1.length()%2==0) {
			
			System.out.println("Output : " + (isim1.substring(0, isim1.length()/2)+isim2)+isim1.substring(isim1.length()/2));
			
		} else { System.out.println("Ilk kelime cift sayili olmadigi icin birlestirme yapilamadi");

		}
		
	}





}
