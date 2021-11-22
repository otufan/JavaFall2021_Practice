package _07_ForLoop;

public class Q16 {
    public static void main(String[] args) {
        /*
        A
        B B
        C C C
        D D D D
        E E E E E
        F F F F F F
        şekli yazdırınız
        */

    	int harf=65;
    	for (int i = 0; i < 6; i++) {
    		for (int j = 0; j <= i; j++) {
    			System.out.print((char)(harf+i)+ " ");
				
			}
			System.out.println();
		}
    }

}
