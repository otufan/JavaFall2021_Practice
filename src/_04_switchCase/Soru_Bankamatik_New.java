package _04_switchCase;

import java.util.Scanner;
public class Soru_Bankamatik_New {
    public static void main(String[] args) {
       System.out.println("*** ATM'ye hos geldiniz ****");
       Scanner scan=new Scanner(System.in);
       String islem="1.islem : BAKIYE \n 2.islem : PARA YATIRMA\n 3. islem : PARA CEKME \n 4. islem : CIKIS";
       
       System.out.println(islem);
       
       System.out.print("yapmak istediginiz islemi seciniz: ");
        
       int bakiye =5000;
       
       String secilenIslem=scan.nextLine();
       
       switch (secilenIslem) {
    case "1":
        System.out.println("bakiyeniz : "+bakiye);
        
        break;
case "2":
    System.out.print("cekeceginiz miktari giriniz :");
    int cekilecekMiktar=scan.nextInt();
    if (cekilecekMiktar<=bakiye) {
        bakiye-=cekilecekMiktar;
        System.out.println("yeni hesap bakıyeniz :"+bakiye);
        
    }else {
        System.out.println("yetersiz bakıye");
    }
    
    
        
        break;
case "3":
    System.out.print("yatirilacak miktari giriniz :");
    int yatirilacakMiktar=scan.nextInt();
    bakiye+=yatirilacakMiktar;
    System.out.println("yeni hesap bakıyeniz :"+bakiye);
    
    break;
case "4":
    System.out.println("cikis isleminiz basari ile yapildi");
    break;
    default:
        System.out.println("hatali secim yaptiniz");
        break;
    }
       
       
       scan.close();
       
       
       
    }
    
    
}
