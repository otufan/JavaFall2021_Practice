package _08_While_DoWhile;

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {

        //TODO STRING OLAN PIN kodunuzu kontrol eden ve 3 giris hakki veren bir kod yazınız.

    	Scanner scan=new Scanner(System.in);
    	
    	System.out.print("Lutfen PIN giriniz : ");
	
    	String pin=scan.nextLine();
    	
    	
    	String sabitPin="Qw.12345";
    	int deneme=2;
    	
    	
    	while (!pin.equals(sabitPin)&& deneme!=0) {
    		
    		System.out.print("Hatali giris yaptiniz tekrar giriniz " + deneme + " hakkiniz kaldi. \ntekrar giris yapiniz : ");
    		
    		pin=scan.nextLine();
    		deneme--;
    		
    		if (!pin.equals(sabitPin)&& deneme==0) { System.out.println("Pin bloke oldu");
			
    		} 
    		
		}
    	
    	if (pin.equals(sabitPin)) { System.out.println("Basarili giris yaptiniz");
			
		} 
    	

    	
    	

    }


}