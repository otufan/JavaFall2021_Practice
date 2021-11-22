	package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {

        /*
          Problem tanimi : 
        Kulanıcıdan aracının hızını alınız
        Trafik cezasının değerini hesaplayın.
            45 hız sınırıdır.
            Eğer hızınız 55-74 arasında ise:
            Ceza 100 $'dır.

            Eğer hızınız 75 - 84 arasında ise:
            Ceza 150 $'dır.

            Eğer hızınız 85 -94 arasında ise:
            Ceza 320 $'dır.

            Eğer hızınız 94'den daha fazla ise:
            Ceza 500 $'dır.

            ve ayrıca,
            Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.

            Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.

-----------------------------------------

            Örn;

            currentSpeed(Hızınız) 87
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = true;

            sonuç 320 olmalıdır.

            currentSpeed(Hızınız) 65
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = false;

            sonuç 300 olmalıdır.
     */

       Scanner scan=new Scanner(System.in);
       
       System.out.print("Lutfen hizinizi girin :");
    	
    	int hiz=scan.nextInt();
    	
    	System.out.println("Ehliyetiniz var mi? (evet/hayir)");
    	
    	String ehliyet=scan.next();
    	
    	int ceza = 0;
    	
    	if (55<=hiz&&hiz<=74) { ceza=100;
			
		}
    	if (75<=hiz&&hiz<=84) { ceza=150;
		
		}
    	if (85<=hiz&&hiz<=94) { ceza=320;
		
		}
    	if (95<=hiz) { ceza=500;
		
		}
    	
    	if (ehliyet.toLowerCase().contains("evet") || ehliyet.toLowerCase().contains("hayir"))
    		
    		{ if (ceza==0&&ehliyet.toLowerCase().contains("evet")) { System.out.println("Kurallara uzdugunuz icin tesekkur ederiz!");
			
		} if (ceza==0&&ehliyet.toLowerCase().contains("hayir")) { System.out.println("Ehliyetsiz araba kullanmaktan cezaniz :200$");
			
		}
    		
    	else if (ehliyet.toLowerCase().contains("evet")) { System.out.println("Cezaniz : " + ceza + " $");
			
		}
    		
    		
		else if (ehliyet.toLowerCase().contains("hayir")){ System.out.println("Ehliyetsiz oldugunuz icin cezaniz 200 $ artmistir. Toplam ceza : " + (ceza+200) + " $");

		}
		else { System.out.println("Lutfen ehliyetinizin olup olmadigini evet veya hayir diyerek yaziniz!!!");
			
		}
	

    }
    	scan.close();
}
}
