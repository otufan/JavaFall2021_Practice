package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {
    /*
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulunuz. Sonucu ekrana yazdırınız.
    */

    	Scanner scan=new Scanner(System.in);
    	
    	System.out.println("Lutfen listeye eklemek istediginiz 6 tam sayiyi giriniz :");
    	List <Integer> liste=new ArrayList <> ();
    	
    	for (int i = 0; i < 6; i++) {
    		
    		System.out.print("Listenin " + (i+1) + ". sayisini giriniz :");
    		liste.add(scan.nextInt());
			
		}

    	System.out.print("Girdiniz liste : " + liste);
    	System.out.println("");
    	
    	int toplam=0;
    	
	for (int i = 0; i < 6; i++) {
    		
    		toplam+=(liste.get(i)*liste.get(i));
			
		}
	
	System.out.print("Listenin elemanlarinin karelerinin toplami : " + toplam);
	scan.close();
    }
}
