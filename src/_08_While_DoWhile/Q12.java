package _08_While_DoWhile;

import java.util.Scanner;

public class Q12 {

    public static void main(String[] args) {

        //Bir top belirli bir yükseklikten atılmaktadır.
        // Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
        // Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
        // Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulunuz.
    	
    	Scanner scan=new Scanner(System.in);
    	
    	System.out.print("Topu ne kadar yukseklikten biraktiniz : ");
    	
    	double yukseklik=scan.nextDouble();
    	
    	int ziplama=0;
    	double yol=0;
    	
    	do {
    		yol+=yukseklik;
    		ziplama++;
    		yukseklik=(yukseklik*3)/4;
    		System.out.println(yukseklik + " " + yol);
    		yol+=yukseklik;
			
			
			
		} while (yukseklik>1);
    	

    	System.out.println("Topunuz toplam " + (ziplama) + " kere ziplamis ve " + yol + " m toplam ziplamistir");
    }
}