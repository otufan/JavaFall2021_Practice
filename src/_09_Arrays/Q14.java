package _09_Arrays;

import java.util.Arrays;

public class Q14 {

	public static void main(String[] args) {
		/*
		 * Congratulations kelimesini Array yontemlirini kullanarak asagidaki outputu
		 * alin.
		 * input : Congratulations
		 * output: [C, o, n, g, r, a, t, u, l, a, t, i, o, n, s]    sniitilitirgniC --> o ,a ve u harfini i ye donusturun.

		 */

		String input="Congratulations";
		
		String arr[]=input.split("");
		
		System.out.println(Arrays.toString(arr));
		
		for (int i = 0; i < arr.length; i++) {

			if (arr[i].equals("o") || arr[i].equals("a") || arr[i].equals("u")) { arr[i]="i";
				
			}
			
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
