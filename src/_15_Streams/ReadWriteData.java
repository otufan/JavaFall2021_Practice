package _15_Streams;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

import java.util.List;

public class ReadWriteData {
	
	String name;
	String geschlecht;
	int groesse;
	int gewicht;
	
	static List<ReadWriteData> list=new ArrayList<>();

	public static void main(String[] args) {
		
		String w;
		
		try {
			BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
			PrintWriter writer = new PrintWriter(new FileWriter("C:\\Users\\omert\\OneDrive - BBQ Berlin\\Desktop\\TEST\\personal.dat"));
			writer.println("die personal Infomation : ");
			
			do {
				ReadWriteData obj=new ReadWriteData();
				
				System.out.println("Bitte geben Sie die Name ein : ");
				obj.name=reader.readLine();
				System.out.println("Bitte geben Sie die Geschlecht ein : ");
				obj.geschlecht=reader.readLine();
				System.out.println("Bitte geben Sie die Groesse ein : ");
				obj.groesse=Integer.parseInt(reader.readLine());
				System.out.println("Bitte geben Sie die Gewicht ein : ");
				obj.gewicht=Integer.parseInt(reader.readLine());
				list.add(obj);
				
				System.out.println("Weiter (j/n)");
				w=reader.readLine();
				
			} while (w.substring(0,1).equalsIgnoreCase("j"));
			
			for (Object obj : list) {
				writer.println(obj);
			}
			
			writer.close();
		} catch (IOException e) {
			System.out.println(e);
		}		
	}

	@Override
	public String toString() {
		return "Name=" + name + ", Geschlecht=" + geschlecht + ", Groesse=" + groesse + ", Gewicht="
				+ gewicht;
	}

}
