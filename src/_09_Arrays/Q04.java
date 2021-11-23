package _09_Arrays;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		/*
		 *  verilen bir int  Arrayde toplamlari istenen degere esit olan sayi ciftlerini
		 * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1};
		 * int istenenToplam=9;
		 */

		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Lutfen istenen toplami giriniz : ");
		
		int num=scan.nextInt();
		int arr[]={5,7,-6,4,2,15,3,8,1};
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i+1; j < arr.length; j++) {
				
				 if (num==arr[i]+arr[j]) {
					System.out.println("istenen toplami veren sayi cifti : " + (arr[i])+ " ve " + (arr[j]));
					
					
				}
				
			}
			
		}
	
		
		
	}

}
