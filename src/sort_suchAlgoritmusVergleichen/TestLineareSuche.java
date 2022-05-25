package sort_suchAlgoritmusVergleichen;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class TestLineareSuche {
	
	public static void main(String[] args) throws InterruptedException {
		
		ArrayErstellen aE=new ArrayErstellen();
		Random r=new Random();
		PrintWriter pw;
		int key1=r.nextInt(10000);
		int key2=r.nextInt(50000);
		int key3=r.nextInt(100000);
				
		int[] arr1=aE.arrayErstellen(10000);
		int[] arr2=aE.arrayErstellen(50000);
		int[] arr3=aE.arrayErstellen(100000);
		
		LineareSuche s1=new LineareSuche(arr1,key1);
		LineareSuche s2=new LineareSuche(arr2,key2);
		LineareSuche s3=new LineareSuche(arr3,key3);
		
		s1.start();
		s2.start();
		s3.start();
		s1.join();
		s2.join();
		s3.join();
		
		System.out.println("Lineare Suche");
		System.out.println("Messreihe 1:10000 Elemente \tMessreihe 2:50000 Elemente \tMessreihe 3:100000 Elemente");
		System.out.printf("\t\t   %4d ms         \t\t   %4d ms         \t\t    %4d ms",s1.getMillis(), s2.getMillis(), s3.getMillis() );
		
		try {
			pw = new PrintWriter("C:\\SchazuProjekt\\MesswerteLineareSuche.txt");
			 pw.println("Lineare Suche");
			 pw.println("Messreihe 1:10000 Elemente \tMessreihe 2:50000 Elemente \tMessreihe 3:100000 Elemente");
			 pw.printf("\t\t       %4d ms       \t\t       %4d ms       \t\t        %4d ms",s1.getMillis(), s2.getMillis(), s3.getMillis());
			 pw.close();
			 
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}
	

}
