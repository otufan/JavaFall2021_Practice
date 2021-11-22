package _07_ForLoop;

public class Q17 {

    public static void main(String[] args) {

//        1 2 3 4 5 6
//         2 3 4 5 6
//          3 4 5 6
//           4 5 6
//            5 6
//             6       şeklini konsola yazdiriniz.

    	
    	
			String sekil="1 2 3 4 5 6 ";
			
			for (int j = 0; j <= 5; j++) {
			
				System.out.println(sekil.substring(j*2));
		
		}
    		System.out.println("");
    }
}


