package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        // sadece tek elemanlarını ayrı diziye bir metodda atayarak
        // main de yazdırınız.

    	
    	Scanner scan=new Scanner(System.in);
    	
    	List <Integer> list1=new ArrayList <> ();
    	
    	System.out.println("Lutfen 6 elemanli listenin tam sayilarini giriniz!");
    	
    	for (int i = 0; i < 6; i++) {

    		System.out.print((i+1) + ". tam sayiyi giriniz : ");
    		list1.add(scan.nextInt());
    	
		}
    	
    	tamSayi(list1);
    	
    	System.out.print("Girilen listede bulunan tek sayilarin listesi : " + tamSayi(list1));

    	scan.close();
    }

	public static List<Integer> tamSayi(List<Integer> list1) {
		
		List <Integer> list2=new ArrayList <>();
		for (int i = 0; i <list1.size(); i++) {
			if (list1.get(i)%2!=0) { list2.add(list1.get(i));
				
			}
			
		}
		
		
		
		return list2;
	}


}
