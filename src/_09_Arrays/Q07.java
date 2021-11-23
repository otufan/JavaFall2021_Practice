package _09_Arrays;

public class Q07 {

    public static void main(String[] args) {
        /*
         * write a method that accepts a 2 dimensional array and finds the max value
         * (2 boyutlu bir diziyi kabul eden ve maksimum degeri bulan bir method yazin )
         * Input : {{1,2,3},{4,5},{6,7,8}}
         * Output : 8
         */

    	int arr[][]= {{1,20,34},{41,5},{16,7,8}};
    	
    	enBuyuk(arr);
    	
    	System.out.println(enBuyuk(arr));
    	
    

    }

	public static int enBuyuk(int[][] arr) {
		
		int max=arr[0][0]; //    	int a=Integer.MIN_VALUE; <----- cok iyiymis
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				if (max<arr[i][j]) { max=arr[i][j];
					
				}
				
				
			}
			
		}
		
		
		return max;
		
		
		
	}
}
