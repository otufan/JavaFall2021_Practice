package sort_suchAlgoritmusVergleichen;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.Duration;
import java.time.Instant;
import java.util.Map;
import java.util.TreeMap;

public class TestSortierung {

	public static void main(String[] args) {
		
		Sortieralgorithmen s = new Sortieralgorithmen();
		ArrayErstellen aE=new ArrayErstellen(); //automatische Array-Erstellungsmethode
		TreeMap<Long, String> result=new TreeMap<>();
		//Die Ergebnisse werden in der TreeMap gespeichert, um den schnellsten Algorithmus zu finden.
		PrintWriter pw; //Ausgabe in Datei --> C:\\SchazuProjekt\\MesswerteSortierung.txt
		
		int[] arr1 = aE.arrayErstellen(10000);
		int[] arr2 = aE.arrayErstellen(10000);
		int[] arr3 = aE.arrayErstellen(10000);
		int[] arr4 = aE.arrayErstellen(10000);

		//Verarbeitungszeit gemessen		
		Instant start1 = Instant.now();		
		s.bubbleSort(arr1);		
		Instant end1 = Instant.now();		
		Duration timeElapsed1 = Duration.between(start1, end1);		
		long millis1 = timeElapsed1.toMillis();//Speichern von Differenzen zwischen Start- und Endzeit
				
		Instant start2 = Instant.now();
		s.insertionSort(arr2);
		Instant end2 = Instant.now();
		Duration timeElapsed2 = Duration.between(start2, end2);
		long millis2 = timeElapsed2.toMillis(); 
		
		
		Instant start3 = Instant.now();
		s.shellSort(arr3);
		Instant end3 = Instant.now();
		Duration timeElapsed3 = Duration.between(start3, end3);
		long millis3 = timeElapsed3.toMillis();
		
		
		Instant start4 = Instant.now(); 
		s.quick(arr4, 0, arr4.length-1);
		Instant end4 = Instant.now();
		Duration timeElapsed4 = Duration.between(start4, end4);
		long millis4 = timeElapsed4.toMillis();
					
		//für 50000 Elemente
		arr1 = aE.arrayErstellen(50000);
		arr2 = aE.arrayErstellen(50000);
		arr3 = aE.arrayErstellen(50000);
		arr4 = aE.arrayErstellen(50000);

		Instant start5 = Instant.now();
		s.bubbleSort(arr1);
		Instant end5 = Instant.now();
		Duration timeElapsed5 = Duration.between(start5, end5);
		long millis5 = timeElapsed5.toMillis();
		
		Instant start6 = Instant.now();
		s.insertionSort(arr2);
		Instant end6 = Instant.now();
		Duration timeElapsed6 = Duration.between(start6, end6);
		long millis6 = timeElapsed6.toMillis(); 
		
		Instant start7 = Instant.now();
		s.shellSort(arr3);
		Instant end7 = Instant.now();
		Duration timeElapsed7 = Duration.between(start7, end7);
		long millis7 = timeElapsed7.toMillis();
		
		Instant start8 = Instant.now(); 
		s.quick(arr4, 0, arr4.length-1);
		Instant end8 = Instant.now();
		Duration timeElapsed8 = Duration.between(start8, end8);
		long millis8 = timeElapsed8.toMillis();
		
		//für 10000 Elemente
		arr1 = aE.arrayErstellen(100000);
		arr2 = aE.arrayErstellen(100000);
		arr3 = aE.arrayErstellen(100000);
		arr4 = aE.arrayErstellen(100000);

		Instant start9 = Instant.now();
		s.bubbleSort(arr1);
		Instant end9 = Instant.now();
		Duration timeElapsed9 = Duration.between(start9, end9);
		long millis9 = timeElapsed9.toMillis();
		
		Instant start10 = Instant.now();
		s.insertionSort(arr2);
		Instant end10 = Instant.now();
		Duration timeElapsed10 = Duration.between(start10, end10);
		long millis10 = timeElapsed10.toMillis(); 
		
		Instant start11 = Instant.now();
		s.shellSort(arr3);
		Instant end11 = Instant.now();
		Duration timeElapsed11 = Duration.between(start11, end11);
		long millis11 = timeElapsed11.toMillis();
		
		Instant start12 = Instant.now(); 
		s.quick(arr4, 0, arr4.length-1);
		Instant end12 = Instant.now();
		Duration timeElapsed12 = Duration.between(start12, end12);
		long millis12 = timeElapsed12.toMillis();
		
		//Alle Ergebnisse werden auf der Konsole ausgegeben
		System.out.println("Sortierung    \tBubble-Sort   \tInsertion-Sort\tShell-Sort    \tQuick-Sort");
		System.out.printf("10000 Elemente\t %4d ms      \t%4d ms      \t%4d ms    \t%4d ms%n", millis1,millis2,millis3,millis4);
		System.out.printf("50000 Elemente\t %4d ms      \t%4d ms      \t%4d ms    \t%4d ms%n", millis5,millis6,millis7,millis8);
		System.out.printf("100000 Elemente\t %4d ms      \t%4d ms      \t%4d ms    \t%4d ms%n", millis9,millis10,millis11,millis12);
		
		
		
		//Die Ergebnisse werden in der TreeMap gespeichert, um den schnellsten Algorithmus zu finden.
		result.put(millis1, "Bubble-Sort   - 10000");
		result.put(millis2, "Insertion-Sort- 10000");
		result.put(millis3, "Shell-Sort    - 10000");
		result.put(millis4, "Quick-Sort    - 10000");
		result.put(millis5, "Bubble-Sort   - 50000");
		result.put(millis6, "Insertion-Sort- 50000");
		result.put(millis7, "Shell-Sort    - 50000");
		result.put(millis8, "Quick-Sort    - 50000");
		result.put(millis9, "Bubble-Sort   - 100000");
		result.put(millis10, "Insertion-Sort-100000");
		result.put(millis11, "Shell-Sort    -100000");
		result.put(millis12, "Quick-Sort    -100000");
		
		//Da die Treemap automatisch sortiert wird, ist das erste Element der schnellste Algorithmus.
		for (Map.Entry<Long, String> r : result.entrySet() ) {
			
			//Das erste Element wird auf die Konsole ausgegeben
			System.out.printf("%n%nDer Suchalgorithmus %s benötigt für die Suche nach einem "
					+ "%nElement in einer Menge von %s Elemente in %d Sekunden.%n", 
					r.getValue().toString().substring(0, 14).toUpperCase(), r.getValue().toString().substring(15), r.getKey());
			break;
		}
		
		//in Datendatei speichern
		try {
			pw = new PrintWriter("C:\\SchazuProjekt\\MesswerteSortierung.txt");
			 pw.println("Sortierung    \tBubble-Sort   \tInsertion-Sort\tShell-Sort    \tQuick-Sort");
			 pw.printf("10000 Elemente\t %4d ms      \t%4d ms      \t%4d ms      \t%4d ms%n", millis1,millis2,millis3,millis4);
			 pw.printf("50000 Elemente\t %4d ms      \t%4d ms      \t%4d ms      \t%4d ms%n", millis5,millis6,millis7,millis8);
			 pw.printf("100000 Elemente\t %4d ms      \t%4d ms      \t%4d ms      \t%4d ms%n", millis9,millis10,millis11,millis12);
			 pw.close();
			 
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}

	

}
