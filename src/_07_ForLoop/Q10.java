package _07_ForLoop;

import java.util.Scanner;

public class Q10 {
    
    public static void main(String[] args) {
    	/*Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
        değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
                1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)

        Sesli harfler: a,e,i,o,u

        Test Data:
        a

        Beklenen Çıktı:
        a harfi sesli harfdir.

        Test Data:
        d

        Beklenen Çıktı:
        d harfi sesiz harftir.

        Test Data:
        we  yada %

        Beklenen Çıktı:
        Yanlis karakter girdiniz!

         */
    	
    	Scanner scan=new Scanner(System.in);
    	
    	System.out.print("Lutfen bir karakter giriniz : ");
    	
    	String karakter=scan.next();
    	
			
		
    	int boyut=karakter.length();
    	String sliH="aeiouAEIOU";
    	String ssizH="QWRTZPSDFGHJKLYXCVBNMqwrtzpsdfghjklyxcvbnm";
    	int sli=0;
    	int ssiz=0;
    	if (boyut==1) { 
    		
    	for (int i = 0; i < ssizH.length(); i++) {
			
    	 if (karakter.charAt(0)==ssizH.charAt(i)) {System.out.println("Girilen harf sessizdir."); sli=1;
			}
    	}
    	 
    	for (int i = 0; i < sliH.length(); i++) {
    		if (karakter.charAt(0)==sliH.charAt(i)) {System.out.println("Girilen harf seslidir."); ssiz=1;
			break;
			
			}  
    	} 
    	
    	if (ssiz+sli==0) { System.out.println("Yanlis karakter girdiniz...");
			
		}
    	}
    	else {System.out.println("Hatali giris yaptiniz. Lutfen bir karakter giriniz.");
    		
    	}
    		
    	
		scan.close();	
		
    } 
    }


