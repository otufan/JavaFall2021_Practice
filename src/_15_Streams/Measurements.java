package _15_Streams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Measurements {

	public static void main(String[] args) {

		char arr[] = new char[12];
		BufferedReader bReader = null;
		BufferedWriter bWiter = null;
		try {
			bReader = new BufferedReader(new FileReader("C:\\Users\\omert\\OneDrive - BBQ Berlin\\Desktop\\QQQQ\\valuesIn.dat"));
			BufferedWriter bWriter = new BufferedWriter(new FileWriter("C:\\Users\\omert\\OneDrive - BBQ Berlin\\Desktop\\QQQQ\\valuesOut.dat"));
			
			bReader.read(arr);

			for (int i = 0; i < 20; i++) {
				bReader.read(arr);

				for (int c : arr) {
					System.out.printf("%4d", c);
				}
				bWriter.write(arr);
				System.out.printf(" Ende der Messreihe%3d%n", i + 1);
				System.out.println("");
			}
			bReader.close();
			bWriter.close();

		} catch (

		IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
