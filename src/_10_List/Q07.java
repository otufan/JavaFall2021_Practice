package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q07 {

	public static void main(String[] args) {
		/*
		ayna check sorusu:
		 input : int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1 };
		 output : verilen array simetriktir
		 */

		int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1 };
	
		List <Integer> list1=new ArrayList <> ();
		
		for (int i = arr1.length-1; i >=0; i--) {
			list1.add(arr1[i]);
		}
		
		System.out.println(list1);

		int kontrol=0;
		for (int i = 0; i < arr1.length; i++) {
			
				
			if (list1.get(i)!=arr1[i]) {kontrol++;
				
			}
			
		}
	

		if (kontrol==0) { System.out.println("Verilen array simetriktir");
			
		} else {System.out.println("Verilen array simetrik DEGILDIR");

		}
}
}
