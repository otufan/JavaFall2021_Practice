package _07_ForLoop;

import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {
        // Kullanıcıdan 5 adet sayı isteyiniz
        // Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
        // bu soruyu continue kullanarak çözünüz.

    	
    	Scanner scan=new Scanner(System.in);
    	
    	System.out.println("Lutfen 5 adet sayi giriniz : ");
    	
    	int sayi=0;
    	int toplam=0;
    	
    	for (int i = 1; i < 6; i++) { 
    		System.out.print("Lutfen sayi " +i+" giriniz: ");
    		sayi=scan.nextInt();
    	
    	if (5>sayi || sayi>=10) { toplam+=sayi; continue; //break for dongusunu kirar ama continue donguyu kirmaz devam ettirir. cok onemli
			
		} 
			
		}
        System.out.println("Toplam :" + toplam);
        scan.close();
    }

}
