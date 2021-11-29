package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        // Bir öğretmenden girmek istediği kadar notu alınız, ve
        // ortalamayı geçen öğrenci sayısını bulunuz.

    	Scanner scan=new Scanner(System.in);
    	System.out.print("Lutfen kac not girmek istediginizi giriniz : ");
    	
    	int adet=scan.nextInt();
    	
    	System.out.println("Lutfen ogrencilerin notlarini giriniz! ");
    	List<Integer> liste=new ArrayList <> ();
    	
    	for (int i = 0; i <adet; i++) {
    		
    		System.out.print("Lutfen " + (i+1) + ". notu giriniz: ");
    		liste.add(scan.nextInt());
			
		}

    	double toplamNot=0;
    	
    	for (int i = 0; i < adet; i++) {
    		
    		toplamNot+=liste.get(i);
			
		}
    	
    	double ortalama=toplamNot/adet;
    	
    	int gecenOgrenci=0;
    	
    	for (int i = 0; i < adet; i++) {
    		
    		if (liste.get(i)>ortalama) { gecenOgrenci++;
				
			}
			
		}
    	
    	System.out.println("Sinav ortalamasi : " +ortalama+"\nSinavi gecen ogrenci sayisi : " + gecenOgrenci);
    	scan.close();
    }
}
