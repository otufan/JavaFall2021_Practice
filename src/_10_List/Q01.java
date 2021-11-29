package _10_List;

import java.util.ArrayList;
import java.util.List;

public class Q01 {

    public static void main(String[] args) {
        /*
         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ harfi bulunanlari silen bir program yaziniz
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */

    	List <String> liste=new ArrayList <> ();
    	
    	liste.add("Ali");
    	liste.add("Veli");
    	liste.add("Ayse");
    	liste.add("Fatma");
    	liste.add("Omer");
    	
    	for (int i = liste.size()-1; i >=0; i--) {
			
    		if (liste.get(i).toLowerCase().contains("a")) { liste.remove(i);
				
			}
    		
    		
		}
    	
    	System.out.println(liste);
    	
    	
    }


}
