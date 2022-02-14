package _09_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        /*
        Write a method which accepts  string as parameter and prints the sum of digits
        present in thr given string
        input :"ade1r4d3"
        output : 8
        trick : Use --> Character.isDigit()
                    --> Integer.valueOf()
         */


    	Scanner scan=new Scanner(System.in);
    	
    	System.out.print("Lutfen bir string deger giriniz : ");
    	
    	String str=scan.nextLine();
    	
    	str=str.replaceAll("\\s", "");
    	String arr[]=str.split("");
    	
    	arraysToplama(arr);
    	
    	
    	System.out.println(Arrays.toString(arr) + " parametrelerinde bulunan sayilarin toplami :" + arraysToplama(arr));
    	scan.close();
    }

	public static int arraysToplama(String[] arr) {
		int toplam=0;
    	for (int i = 0; i < arr.length; i++) {

    		if (Character.isDigit(arr[i].charAt(0))) {
    			
    			toplam+=Integer.valueOf(arr[i]);
    			
			} else continue;
		}
    	
    	return toplam;
	}


}

