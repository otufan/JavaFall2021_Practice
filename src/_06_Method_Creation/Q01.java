package _06_Method_Creation;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {

		/* StringMethods
           String girildiginde ilk iki karakteri haric string return eden java programi yaziniz
           Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise bu karakterler de return edilsin
          ORNEK:
           INPUT      :  goat
                         photo
                         ghost
                         kalem
           OUTPUT :      gat
                         hoto
                         ghost
                         lem
		 */
       
    	Scanner scan=new Scanner(System.in);
    	
    	System.out.print("Lutfen bir string degeri giriniz : ");
    	
    	String str=scan.nextLine();
    	
    	System.out.print("Output : " + ilkIkisiz(str));

    	scan.close();
    }

	public static String ilkIkisiz(String str) {
		if (str.toLowerCase().charAt(0)=='g' && str.toLowerCase().charAt(1)=='h') {  //
			
			str=str;
		
		}else if (str.toLowerCase().charAt(0)=='g') { str= str.charAt(0)+ str.substring(2);
		
		} else if(str.toLowerCase().charAt(1)=='h') { str=str.charAt(1)+str.substring(2);
			
		} else { str=str.substring(2);
			
		}
		
		
		 return str;
		
		
	}
}
