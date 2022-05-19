package _15_Streams;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class FilterCharacters {

	public static void main(String[] args) throws IOException {
		
		PrintWriter writer = new PrintWriter(new MyFilterWriter(new FileWriter("C:\\Users\\omert\\OneDrive - BBQ Berlin\\Desktop\\TEST\\filter.dat")));
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Bitte geben Sie einen Char Wert ein : ");
		writer.print(reader.readLine());
		
		char [] arr = {'a', 'z' ,'1', 'A', 'Z' ,'(','+', '$' ,'.'};
		writer.print(arr);
		String s="123popöüüß´9008ujlfkoi09ßi3kl4m";
		writer.print(s);
		
		reader.close();
		writer.close();
		

	}

}
