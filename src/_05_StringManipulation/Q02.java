package _05_StringManipulation;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        // Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
        // ad ayrı soyad ayrı sekilde ekrana yazdırınız.

      Scanner scan=new Scanner(System.in);
      
      System.out.print("Lutfen ad ve soyadinizi giriniz : ");
      
      String nameSurname=scan.nextLine();
      int aI=nameSurname.indexOf(" ");
      
      
      System.out.println("Adiniz :" + nameSurname.substring(0,aI)+ 
    		  "\nSoyadiniz :" + nameSurname.substring(aI+1));
      
      
      
      scan.close();
       
    }
}
