package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q08 {

    public static void main(String[] args) {
        /*
         * 10 elamanli bir list olusturun. Ardindan dizinin 3. elemani ile
         * 8. elemaninin yerlerini degistirin.
         *
         * ORNEK:
         *
         * INPUT : String[] isimler={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
         * OUTPUT : String[] isimler={"Umit","Emin","Furkan","Kerem","Taylan","Orhan","Sinan","Kemal","Ahmet","Ali"};
         */


    	List <String> list1=new ArrayList <> (Arrays.asList("Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"));

    
    	String arr[]=new String[1];
    	arr[0]=list1.get(2);
    	
    	list1.set(2, list1.get(7));
    	list1.set(7, arr[0]);
    	

    	System.out.println(list1);
    }

}
