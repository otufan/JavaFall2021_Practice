package _01_practice;

import java.util.Arrays;
import java.util.Scanner;

public class C06_Practice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        
        System.out.print("Bitte geben Sie die Anzahl der Elemente Array ein: ");
        int anzahl = scan.nextInt();

        int[] arr = new int[anzahl];

        for (int i = 0; i < arr.length; i++) {

            System.out.print("Bitte geben Sie die Nummer " + (i + 1) + " ein : ");
            arr[i] = scan.nextInt();

        }

        System.out.println("das eingegebene Array : " + Arrays.toString(arr));
        
        int a=0;
        int b=0;
        
        for (int i = 0; i < arr.length; i++) {
        	b++;
        	if (b<=(anzahl-b)) {
        	a=arr[anzahl-b];
        	arr[anzahl-b]=arr[i];
        	arr[i]=a;
        	
        				
			}        	
        	
              
        }
        
      System.out.println("das umgekehrte Array : "+Arrays.toString(arr));
		
      
		
      
      
      
      
      
      
      
      
      
		

      scan.close();
	}

}
