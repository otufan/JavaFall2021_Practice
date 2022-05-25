package sort_suchAlgoritmusVergleichen;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Random;

public class TestBinaereSuche {

	public static void main(String[] args) throws InterruptedException {

		Sortieralgorithmen s = new Sortieralgorithmen();
		ArrayErstellen aE=new ArrayErstellen();
		PrintWriter pw;
		Random r=new Random();
		
		int key1=r.nextInt(10000);
		int key2=r.nextInt(50000);
		int key3=r.nextInt(100000);
		
		int[] arr1=aE.arrayErstellen(10000);
		int[] arr2=aE.arrayErstellen(50000);
		int[] arr3=aE.arrayErstellen(100000);
		
		s.quick(arr1, 0, arr1.length-1);
		s.quick(arr2, 0, arr2.length-1);
		s.quick(arr3, 0, arr3.length-1);
		
		BinaereSuche b1=new BinaereSuche(arr1, 0, arr1.length-1, key1);
		BinaereSuche b2=new BinaereSuche(arr2, 0, arr2.length-1, key2);
		BinaereSuche b3=new BinaereSuche(arr3,  0, arr3.length-1, key3);
		
		b1.start();
		b2.start();
		b3.start();
		b1.join();
		b2.join();
		b3.join();
		
		
		System.out.println("Binaere Suche");
		System.out.println("Messreihe 1:10000 Elemente \tMessreihe 2:50000 Elemente \tMessreihe 3:100000 Elemente");
		System.out.printf("\t\t   %.3f ms       \t\t  %.3f ms         \t\t   %.3f ms",(float)b1.getNanos()/100000, (float)b2.getNanos()/100000, (float)b3.getNanos()/100000 );
		
		//Da der Algorithmus sehr schnell ist, werden die Ergebnisse auch in Nanosekunden angegeben.
		System.out.println("\nMessreihe 1:10000 Elemente \tMessreihe 2:50000 Elemente \tMessreihe 3:100000 Elemente");
		System.out.printf("\t\t   %4d ns         \t\t   %4d ns         \t\t    %4d ns",b1.getNanos(), b2.getNanos(), b3.getNanos() );
		
		try {
			pw = new PrintWriter("C:\\SchazuProjekt\\MesswerteBinaereSuche.txt");
			 pw.println("Binaere Suche");
			 pw.println("Messreihe 1:10000 Elemente \t\tMessreihe 2:50000 Elemente \t\tMessreihe 3:100000 Elemente");
			 pw.printf("\t\t      %.3f ms    \t\t\t\t %.3f ms      \t\t\t\t  %.3f ms",(float)b1.getNanos()/100000, (float)b2.getNanos()/100000, (float)b3.getNanos()/100000);
			 pw.println("\nMessreihe 1:10000 Elemente \t\tMessreihe 2:50000 Elemente \t\tMessreihe 3:100000 Elemente");
			 pw.printf("\t\t       %4d ns         \t\t\t\t %4d ns         \t\t\t\t %4d ns",b1.getNanos(), b2.getNanos(), b3.getNanos());
			 pw.close();
			 
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}

	}

}
