package _09_Arrays;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		// Kullanicidan aldigimiz 8 elemanli arrayin icinde 
    	// kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
		
		int arr[]=new int[8];
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen 8 elemanli array elemanlarini sirayla giriniz");
		for (int i = 0; i < 8; i++) {
			
		
		System.out.print("index " + i + " olan elemani giriniz : ");
		arr[i]=scan.nextInt();

		}
		
		int sayac=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]!=0&&arr[i]%3==0) { sayac++;
				
			}
		}
		
		System.out.println("Girilen listenin icinde 3 e tam bolunen toplam " + sayac + " eleman vardir");
		
		scan.close();
	}

}
