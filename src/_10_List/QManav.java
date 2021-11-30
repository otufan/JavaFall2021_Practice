package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QManav {
	static List<String> urunListesi =new ArrayList<>();
	static List<Double> urunFiyatlari =new ArrayList<>();
	static double toplanOdenecekTutar;

	public static void main(String[] args) {
		/*
		 * Basit bir 5 ürünlü manav alisveris programi yaziniz.
		 *
		 * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
		 * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
		 * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
		 * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
		 * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
		 * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
		 *
		 * */

		Scanner scan=new Scanner(System.in);
		
	
		System.out.println("Lutfen almak istediginiz urunun kodunu giriniz");
		System.out.println("***		1- Elma 		***");
		System.out.println("***		2- Armut 		***");
		System.out.println("***		3- Muz			***");
		System.out.println("***		4- Kiraz 		***");
		System.out.println("***		5- Uzum			***");
	
		double elma=1.5;
		double armut=2;
		double muz=3.5;
		double kiraz=5;
		double uzum=2.5;
		
		String finish="K";
		int tercih=0;
		double miktar=0;
		double toplamFiyat=0;
		
		
		while (!finish.substring(0,1).toLowerCase().contains("h")) {
			
			System.out.print("Lutfen urun tercihinizi yapiniz : ");
			tercih=scan.nextInt();
			
			switch (tercih) {
			case 1: 
				
				System.out.print("Lutfen alacaginiz elma miktarini giriniz :");
				miktar=scan.nextDouble();
				toplamFiyat+=(elma*miktar);
				break ;
			case 2: 
				System.out.print("Lutfen alacaginiz armut miktarini giriniz :");
				miktar=scan.nextDouble();
				toplamFiyat+=(armut*miktar);
				break;
			case 3: 
				System.out.print("Lutfen alacaginiz muz miktarini giriniz :");
				miktar=scan.nextDouble();
				toplamFiyat+=(muz*miktar);
				break;
			case 4: 
				System.out.print("Lutfen alacaginiz kiraz miktarini giriniz :");
				miktar=scan.nextDouble();
				toplamFiyat+=(kiraz*miktar);
				break;
			case 5: 
				System.out.print("Lutfen alacaginiz uzum miktarini giriniz :");
				miktar=scan.nextDouble();
				toplamFiyat+=(uzum*miktar);
				break;
			default:
		        System.out.println("Hatali secim yaptiniz");
		        break;
		    }
			
			System.out.print("Baska urun siparisi vermek istiyorsaniz E istemiyorsaniz H tusuna basiniz");
			finish=scan.next();
			if (finish.substring(0,1).toLowerCase().contains("e")||finish.substring(0,1).toLowerCase().contains("h")) { continue;
				
			} else {System.out.println("Hatali Giris!!! Lutfen E veya H tusunu tuslayiniz");
			finish=scan.next();
			
				
			}
			
			}
			
		System.out.println("Aldiginiz urunlerin toplam fiyati ---> " + toplamFiyat+" Euro ");
		System.out.println(" ");
		System.out.println("Alisverisiniz icin tesekkur ederiz, tekrar bekleriz!!!");
		scan.close();
		
			}
			
		
		
		
		
	
}
