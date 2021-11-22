package _06_Method_Creation;

import java.util.Scanner;

public class Q10 {
	
	public static void main(String[] args) {
		
	

    /*
     Problem Tanımı :
        powerOfThree isminde bir method oluşturun.
        Parametre olarak int
        Return tipi boolean
        Bir tamsayı verildiğinde, 3 üssü olup olmadığını teyit edin. 3'ün üssü(kuvveti) ise true, değilse false döndürün.
        Örnek 1:
        Girdi: 27
        Çıktı: true
        Açıklama: 3*3*3 =27
        Sonuç= true

        Örnek 2:
        Girdi: 0
        Çıktı: false
        Örnek 3:
        Girdi: 9
        Çıktı: true
        Açıklama: 3*3 = 9
        Sonuç= true

        Örnek 4:
        Girdi: 45
        Çıktı:: false
        Açıklama: 3*3*3*3 =81
        Sonuç= false
        45, 3ün üssü (kuvveti) değildir.
     */

    Scanner scan=new Scanner(System.in);
    
    System.out.print("Lutfen pozitif bir tam sayi giriniz :");
   
    int sayi=scan.nextInt();
    
    
	 System.out.println(powerOfThree(sayi));
	scan.close();
	}

	public static boolean powerOfThree(int sayi) {
		
		int bolen=3;
			
			
		while (sayi<3) {
			
			sayi/=3;
			
		}
		
		if (sayi%3==0) { return true;
			
		} else { return false;

		}
		
		
		
	}	
}

