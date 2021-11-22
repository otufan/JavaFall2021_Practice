package _06_Method_Creation;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        /*
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */
    	
    	
    	Scanner scan=new Scanner(System.in);
    	System.out.print("Lutfen bir String degeri giriniz: ");
    	String anahtar=scan.nextLine();
    	
    	
    	keyFind(anahtar);
    	
    	scan.close();
    	
    }

	private static void keyFind(String anahtar) {
		String key="xyz";
		if (anahtar.toLowerCase().contains(key)) { System.out.println("True");
			
		} else {System.out.println("False");

		}
		
		
	}

}
