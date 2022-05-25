package sort_suchAlgoritmusVergleichen;

import java.util.Random;

public class ArrayErstellen {

	public int[] arrayErstellen(int a) {

		int[] arr = new int[a];
		Random r = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(10000);
		}
		return arr;
	}
}
