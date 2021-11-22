package _04_switchCase;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

// Girilen bir ay numarasına göre , ayın kaç gün olduğunu sayı ile yazdırınız

    	Scanner scan=new Scanner(System.in);
    	
    	System.out.print("Lutfen bir ay numarasi giriniz : ");
    	
    	String ayNumarasi=scan.next();
    	
    	switch (ayNumarasi) {
    	
    	case "1": 
    		System.out.println("Ocak ayini girdiniz. Toplam gun sayisi 31");
    		break;
    	case "2": 
    		
    		System.out.println("Yili giriniz:");
    		int yil=scan.nextInt();
    		if (yil%4==0) {System.out.println("Subat ayini girdiniz. Artik yil ve toplam gun sayisi 29");
				
			} else {System.out.println("Subat ayini girdiniz. Toplam gun sayisi 28");

			}
    		
    		break;
    	case "3": 
    		System.out.println("Mart ayini girdiniz. Toplam gun sayisi 31");
    		break;
    	case "4": 
    		System.out.println("Nisan ayini girdiniz. Toplam gun sayisi 30");
    		break;	
    	case "5": 
    		System.out.println("Mayis ayini girdiniz. Toplam gun sayisi 31");
    		break;
    	case "6": 
    		System.out.println("Haziran ayini girdiniz. Toplam gun sayisi 30");
    		break;	
    	case "7": 
    		System.out.println("Temmuz ayini girdiniz. Toplam gun sayisi 31");
    		break;
    	case "8": 
    		System.out.println("Agustos ayini girdiniz. Toplam gun sayisi 30");
    		break;	
    	case "9": 
    		System.out.println("Eylul ayini girdiniz. Toplam gun sayisi 31");
    		break;	
    	case "10": 
    		System.out.println("Ekim ayini girdiniz. Toplam gun sayisi 30");
    		break;	
    	case "11": 
    		System.out.println("Kasim ayini girdiniz. Toplam gun sayisi 31");
    		break;	
    	case "12": 
    		System.out.println("Aralik ayini girdiniz. Toplam gun sayisi 31");
    		break;	
    	default:
    		System.out.println("Hatali giris yaptiniz!!!");
    		
 
    	}
    	scan.close();
    }
}

