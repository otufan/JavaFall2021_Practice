package _15_Streams;

import static java.lang.Math.PI;
import java.io.PrintWriter;

public class PrintWriterTest2 {

	public static void main(String[] args)  {

		PrintWriter pw1 = new PrintWriter(System.out, false);

		pw1.println("1. Ausgabe des Flaecheninhalts fuer Kreise mit");
		
		
		for (int r = 1; r <= 5; r++) {
			
			pw1.print("Radius r = " + r + ": "); // String schreiben
			pw1.println(PI * r * r); // double-Wert schreiben
		}
		pw1.close();
		System.out.println("#################################################################");
		
		/*
		 * PrintWriter pw2 = new PrintWriter(System.out, true);
		 * 
		 * pw2.println("2. Ausgabe des Flaecheninhalts fuer Kreise mit");
		 * 
		 * for (int r = 1; r <= 5; r++) {
		 * 
		 * pw2.print("Radius r = " + r + ": "); // String schreiben pw2.println(PI * r *
		 * r); // double-Wert schreiben }
		 * 
		 * pw1.close(); pw2.close();
		 */
		
	}

}
