package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Ter03 {

    public static void main(String[] args) {
        // Kullanicidan bir pozitif tamsayi girmesini isteyin, o pozitif tamsayi 3 basamakli ise ekrana 3 BasamaklÄ±â€� yazdirin.
        // 3 basamakli degilse cift olup olmadigini kontrol edin. cift ise 3 basamakli olmayan cift sayi yazdiri
        // cift sayi degilse 3 basamakli olmayan tek sayi yazdirin.

    	Scanner scan=new Scanner(System.in);
    	
    	System.out.print("Lutfen pozitif bir tam sayi giriniz: ");
    	
    	int sayi=scan.nextInt();
    	
    	if (sayi<0) {System.out.println("Lutfen pozitif bir tam sayi giriniz");  
    	
    	} 
    	
    	else if (sayi>=100 && sayi<1000) { System.out.println("3 basamakli sayi");
			
    	}
    	
    	else if (sayi%2==0) { System.out.println("3 basamakli olmayan cift sayi");

		}
    	
		else { System.out.println("3 basamakli olmayan tek sayi");
			
		}
    	
    	scan.close();
      
    }
}