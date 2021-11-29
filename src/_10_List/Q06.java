package _10_List;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q06 {

    public static void main(String[] args) {
        /*
         * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir program yaziniz.
         *
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]
         */

    	List<Integer> list1=new ArrayList <> ();
    	//List<Integer> list=new ArrayList <> (Arrays.asList(1,2,2,3,1,4,2,5,6,8,7,5,9,1)); // bu sekilde hizlica liste olusturulur ama problem liste esnekligi gider
    	
    	list1.add(1);
    	list1.add(2);
    	list1.add(2);
    	list1.add(3);
    	list1.add(1);
    	list1.add(4);
    	list1.add(2);
    	list1.add(5);
    	list1.add(6);
    	list1.add(8);
    	list1.add(7);
    	list1.add(5);
    	list1.add(9);
    	list1.add(1);
    	
    	Collections.sort(list1);
    	
    	for (int i =list1.size()-1; i>=1; i--) {
    		if (list1.get(i)==list1.get(i-1)) { list1.remove(i-1);
				
			}
			
		}
			
		
    	System.out.println(list1);
    	
    	
    	

    }

}
