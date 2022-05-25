package sort_suchAlgoritmusVergleichen;

import java.time.Duration;
import java.time.Instant;

public class LineareSuche extends Thread{ //Es werden Multithread-Funktionen verwendet, die von der Thread-Klasse erben, 
										  //da die Verarbeitungszeit parallel gemessen werden muss

	private int[] arr;
	private int key;
	private long millis;

	public LineareSuche(int[] arr, int key) {

		this.arr = arr;
		this.key = key;
	}
	
	public long getMillis() {
		return millis;
	}

	public int lineareSuche() {
		
		for (int i = 0; i < arr.length; i++) {			
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}
	
	@Override
	public void run() { //mithilfe der Methode run erfolgenZeitmessung und Elementsuche gleichzeitig
		
		Instant start1 = Instant.now();			
		lineareSuche();		
		Instant end1 = Instant.now();
		Duration timeElapsed1 = Duration.between(start1, end1);
		millis=timeElapsed1.toMillis();
	}
}
