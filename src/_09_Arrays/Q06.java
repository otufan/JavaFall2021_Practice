package _09_Arrays;

import java.util.Arrays;

public class Q06 {
    public static void main(String[] args) {
	
	/*    write a java program to find the second largest number in the array?
	Maximum and minimum number in the array?
	(Dizideki en büyükk ikinci sayyiyi, maksimum ve minimum sayiyi
	bulmak için bir java programi yazin)
	
	int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };
	
	*/
    	int[] arr={ 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };
    	
    	maxSecond(arr);
    	max(arr);
    	min(arr);

    }

	private static void min(int[] arr) {
		Arrays.sort(arr);
		
		System.out.println(arr[0]);
	}

	private static void max(int[] arr) {
		Arrays.sort(arr);
		
		System.out.println(arr[(arr.length-1)]);
	}

	private static void maxSecond(int[] arr) {
		
		Arrays.sort(arr);
		
		System.out.println(arr[(arr.length-2)]);
		
	}
	
	

}
