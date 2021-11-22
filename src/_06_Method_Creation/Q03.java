package _06_Method_Creation;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {


// Saati saniyeye, mil'i kilometreye, kilogrami gram'a
        // ceviren bir method yaziniz.
        
    	Scanner scan=new Scanner(System.in);
    	
    	System.out.print("Lutfen cevirelecek birimi giriniz : ");
    	
    	String birim=scan.nextLine();
    	
    	
    	System.out.print("Cevirelecek birimin degerini giriniz : ");
    	
    	double miktar=scan.nextDouble();
    	
    	cevir(birim, miktar);
    	
    	
    	
      
    }

	public static void cevir(String birim, double miktar) {
		
		switch (birim) {
		
		case "saat":
			System.out.print("Girilen saat " + (miktar*3600) + " saniyeye esittir.");
			break;
		case "mil" :
			
			System.out.print("Girilen mil " + (miktar*1.6) + " kilometreye esittir." );
			break;
		case "kilogram":
			System.out.print("Girilen kilogram" + (miktar*1000) + " grama esittir.");
			break;
		default :
			System.out.println("Lutfen gecerli bir birim giriniz.");
			break;
		}
		
		
		
		
		
	}
}

