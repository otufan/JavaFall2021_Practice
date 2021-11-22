package _05_StringManipulation;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        //Kullanıcıdan alacağınız, 3 kelimeden oluşan ismi
        // Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.

    	Scanner scan=new Scanner(System.in);
    	
    	System.out.print("Lutfen 3 kelimeden olusan isminizi giriniz: ");
    	
    	String isim=scan.nextLine();
    	
    	String ilk=isim.substring(0, 1).toUpperCase();
    	String ikinci=isim.substring((isim.indexOf(" ")+1),(isim.indexOf(" ")+2)).toUpperCase();
    	String ucuncu=isim.substring((isim.lastIndexOf(" ")+1),(isim.lastIndexOf(" ")+2)).toUpperCase();
    	
    	System.out.println("isminizin bas harfleri : " + ilk+ "."+ikinci+"."+ucuncu+".");
    	
    	
    	//Bu problem char metodu ile daha kolay cozuluyor
    }       
}
