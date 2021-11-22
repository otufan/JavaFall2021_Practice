package _05_StringManipulation;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        // Kullanıcıdan alacağını bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.
        

        // Kullanıcıdan alacağını bir stringin bos olup olmadığını kontrol ediniz.
       
    	Scanner scan=new Scanner(System.in);
    	System.out.print("Lutfen bir kelime girin : ");
    	String str=scan.nextLine();
    	
    	if (str.contains(" ")) { System.out.println("Bosluk var");
			
		} else { System.out.println("Bosluk yok");

		}
    	
    System.out.println("Girilen string bos mu ?" + str.isEmpty());
    	scan.close();
    }
}

