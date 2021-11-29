package _10_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q02 {

    public static void main(String[] args) {
     //2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
     //listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
     //Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
     //   Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]

    	String arr[][]={{"Ali","Veli","Ayse"},{"Hasan","Can"},{"Suzan"}};
    	List <String> liste=new ArrayList <>();
    	
    	for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				liste.add(arr[i][j]);
				
			}
		}

    	Collections.sort(liste);
    	System.out.println(liste);
    	//Collections.reverse(liste); //bu sekilde siralanan listeyi tersine ceviriyor
    	//System.out.println(liste);  //----->[Veli, Suzan, Hasan, Can, Ayse, Ali]
    }

}
