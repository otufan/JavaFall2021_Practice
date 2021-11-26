package _09_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        // kullanıcıdan alınan bir  String'deki herbir  karakterin adedini bir array içinde yazdıran bir java programı yazın.
        // String  "Javacilar cook afilli" ise cevap şöyle olmalıdır:
        // { =2, a=3, r=1, c=1, v=1, o=2, f=1, l=2, J=1, i=2}


    	Scanner scan=new Scanner(System.in);
    	
    	System.out.print("Lutfen bir cumle giriniz : ");
    	
    	String cumle=scan.nextLine();
    	
    	String arr[]=cumle.split("");
    	
    	Arrays.sort(arr);
    	
    	List <String> liste=new ArrayList <>();
    	
    	for (int i = 0; i < arr.length; i++) {
    		
    	liste.add(arr[i]);
			
		}
    	
    	
    	System.out.println("liste:" + liste);
    	
    	int cesit=1;
    	
    	for (int i = 0; i < arr.length-1; i++) {
    		
    		if (!arr[i].equals(arr[i+1])) {cesit++;
				
			}
			
		}
    	
    	System.out.println(cesit);
    	
    	String arr2[]=new String[cesit];
    	
    	
   
    		
    	for (int i = liste.size(); i >0 ; i--) { // sondan baslanmasi gerekiyor. bastan baslayinca indexler degisiyor cunku
			
			if (liste.get(i).equals(liste.get(i-1))) { liste.remove(i);
			
			}
			
		}
    	
    	System.out.println(liste);
    
			
		}
			
			
		

    }

