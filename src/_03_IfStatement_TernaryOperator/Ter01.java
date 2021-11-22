package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Ter01 {

    public static void main(String[] args) {

        //Kullanicidan bir sayi aliniz
        //Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
        //10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
        //Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.

    	Scanner scan=new Scanner(System.in);
    	
    	System.out.print("Lutfen bir sayi giriniz:");
        
    	double sayi=scan.nextDouble();
    	
    	System.out.println("******** ternary cozum *******");
    	
    	String sonuc=(sayi<0) ? "Negatif Sayi" : ((sayi<10) ? "Rakam" : "Pozitif Sayi");
    	
    	System.out.println(sonuc);
    	
    	System.out.println("******** if else cozum *******");
    	
    	if (sayi<0) { System.out.println("Negatif Sayi");
			
		} else if (sayi<10){ System.out.println("Rakam");

		}
		else {System.out.println("Pozitif Sayi");
			
		}
    	
    	scan.close();
    }
}
