package _10_List;

import java.util.ArrayList;
import java.util.List;

public class Q10 {
    /*
     * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
     * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
     */
    public static void main(String[] args) {

    	int arr[]={ 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 };
    	
    	List <Integer> liste=new ArrayList <> ();
    	int toplam=0;
    	for (int i = 0; i < arr.length/2; i++) {
			toplam=0;
    		for (int j = i; j <= i; j++) {
    			toplam+=arr[i+j];
    			
				
			}
    		
    		liste.add(i, toplam);
    		
		}
    	
    	System.out.println(liste);
    	
    	
    	
    }
}
