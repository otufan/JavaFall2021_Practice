package _06_Method_Creation;

import java.util.Scanner;

public class Q09 {
	  public static void main(String[] args) {
/*
    Problem Tanımı:
    addDigits isminde bir method oluşturun.
    Parametresi int
    Return tipi de int
    Pozitif int değerler ver ve en son sonuç tek basamaklı çıkana kadar basamakları birbiriyle topla.
    Tek basamaklı çıktığında, döndürün

    Örnek1:
    Girdi 38
    Çıktı: 2
    Açıklama: İşlemler şöyle olacak: 3 + 8 = 11, 1 + 1 = 2.
                 2 , tek basamaklı olduğundan, bunu döndürün.
    */

   Scanner scan=new Scanner(System.in);
   
   System.out.print("Lutfen bir pozitif tam sayi giriniz : ");
   
   int sayi=scan.nextInt();
   
   basamakTopla(sayi);
   
   

}

	public static void basamakTopla(int sayi) {
		
		int toplam=0;
		int basamak=0;
		
	    for (int i = sayi; i >= 1; i/=10) {
			
			toplam+=(i%10);
			
			i=i-i%10;
		
				
			}
	    
	    basamak=(""+toplam).length();
	    if(basamak>1) { toplam=(toplam/10)+(toplam%10);
	
	}
	    
	 
		System.out.println(toplam);
	    
	}
}
