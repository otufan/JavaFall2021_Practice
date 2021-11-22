package _05_StringManipulation;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
       /*
       kullanıcıdan bir e-posta adresi girmesini isteyin, ardından "hotmail" içeriyorsa, "gmail" ile değiştirin,
        örneğin: johnbrown@hotmail.com ==> johnbrown@gmail.com
        */

       
    	Scanner scan=new Scanner(System.in);
    	
    	System.out.print("Lutfen mail adresinizi giriniz :");
    	
    	String mail=scan.nextLine();
    	
    	boolean check=mail.toLowerCase().contains("hotmail");
    	
    	if (check==false) { System.out.println("Mail adresiniz basarili bir sekilde kaydedilmistir");
			
		} else { String newMail=mail.toLowerCase().replaceAll("hotmail", "gmail");
		
		System.out.println("Yeni mail adresiniz :" + newMail+ "\n*******Kaydiniz icin tessekur ederiz******");

		}
    	scan.close();
    }
}
