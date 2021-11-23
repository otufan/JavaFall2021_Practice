package _09_Arrays;

import java.util.Arrays;

public class Q08 {

    public static void main(String[] args) {
		
		/*   $ ve  £  isareti olanlarin toplamlarini ayri ayri bulun

        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        */

    	 String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
    	 
    	 String arr[]=str.split(" ");
    	 
    	 System.out.println(Arrays.toString(arr));
    	 int dolar=0;
    	 int pound=0;
    	 
    	 for (int i = 0; i < arr.length; i++) {
    		 
    		 
    		 if (arr[i].contains("$")) {dolar+=Integer.parseInt(arr[i].replace("$", ""));
				
			} else {pound+=Integer.parseInt(arr[i].replace("£", ""));

			}
			
		}
    	 
    	 System.out.println("Toplam dolar miktari : " + dolar + "$" + " toplam pound miktari : " + pound + "£");
    }
}


