package _09_Arrays;

import java.util.Arrays;

public class Q03 {

    public static void main(String[] args) {
        //bir int Array elemanlarinin işaretini(+-)degistiren  bir method yaziniz.
        // input : 1,2,-3,4,-5,-6
        //output :-1,-2,3,-4,5,6

    	
    	int arr[]= {1,2,-3,4,-5,-6};
    	
    	yeniArr(arr);
    	
    	

    }

	public static void yeniArr(int[] arr) {
		
		int arr2[]=new int[arr.length];
    	
    	for (int i = 0; i < arr.length; i++) {
    		
    		arr2[i]=(arr[i]*(-1));
			
		}
    	
    	System.out.println(Arrays.toString(arr2));
		
	}


}
