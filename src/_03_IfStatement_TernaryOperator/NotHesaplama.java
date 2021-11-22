package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class NotHesaplama {
    public static void main(String[] args) {
        /*
        1.Kullaniciya    "Vize sinav sonucunuzu giriniz :"
        2.vize notu double degerinde girilecek.

        3. Kullanıcıya  "Vize sinavi yuzdesini giriniz". ->> double olmali ->> 0,40 etkiliyor   !!Yuzde kac etkiledigini Sisteme siz giriyorsunuz.!!

        4.Kullaniciya    "Final sinav sonucunuzu giriniz.

        5. final notu double degerinde olmali. (orn: 65,5)

        6.Kullaniciya    "Final sinavi yuzdesini giriniz"-->> double olmali ->> 0,60 etkiliyor.

        7. Vize final ortalamasini bulmak isin, vize nin yuzde40 i, finalin yuzde60 i alinmali ve cikan sonuclar toplanmalidir.

        8. cikan sonucu (dersin not ortalamasini)   double toplam  ' a esitleyebilirsiniz.

        todo  :  Kosul kismi
 			eğer ortalaması 90(90 dahil) 'dan buyuk ise, harf notu olarak 
 			AA, 80(80dahil)   ile 90 arasinda ise  
 			BA, 70(70 dahil)   ile 80 arasinda ise 
 			BB, 60(60dahil) ile 70 arasinda ise 
 			CB, 50(50 dahil) ile 60 arasinda ise 
 			CC, 40(40 dahil) ile 50 arasinda ise 
 			DC, 30(30 dahil) ile 40 arasinda ise 
 			DD, 30 'dan kucuk ise FF  gelmeli.
 			
         */

    	Scanner scan=new Scanner(System.in);
    	
    	System.out.print("Lutfen vize sinav sonucunu giriniz:");
    	
    	double vizeSonuc=scan.nextDouble();
    	
    	System.out.print("Lutfen vize sinav yuzdesini giriniz:");
    	
    	double vizeYuzde=scan.nextDouble();
    	
    	System.out.print("Lutfen final sinav sonucunu giriniz:");
    	
    	double finalSonuc=scan.nextDouble();
    	
    	System.out.print("Lutfen final sinav yuzdesini giriniz:");
    	double finalYuzde=scan.nextDouble();
    	
    	double notOrtalamasi=vizeSonuc*vizeYuzde/100+finalSonuc*finalYuzde/100;
    	
    	System.out.println("Ortalamaniz: " + notOrtalamasi);
    	
    	if (notOrtalamasi>100 || notOrtalamasi<0) { System.out.println("Lutfen girdilerinizi kontrol ediniz!!!");
			
		} else if (notOrtalamasi>=90 ){ System.out.println("Notunuz: AA");

		}
		else if(notOrtalamasi>=80) { System.out.println("Notunuz:BA");
			
		}
		else if (notOrtalamasi>=70){ System.out.println("Notunuz:BB");
			
		}
		else if (notOrtalamasi >=60) { System.out.println("Notunuz:CB");
			
		}
		else if (notOrtalamasi >=50){ System.out.println("Notunuz:CC");
			
		}
    	
		else if (notOrtalamasi >=40) { System.out.println("Notunuz:DC");
			
		}
    	
		else if(notOrtalamasi >=30) { System.out.println("Notunuz:DD");
			
		}
    	
		else { System.out.println("Notunuz:FF");
			
		}
		 scan.close();
    	
    }
}
