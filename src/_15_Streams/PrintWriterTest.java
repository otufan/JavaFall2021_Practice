package _15_Streams;

import java.io.*;
import static java.lang.Math.PI;

class PrintWriterTest
{
  public static void main(String[] args)
  {
    try
    {
      PrintWriter pw = new PrintWriter("C:\\Users\\omert\\OneDrive - BBQ Berlin\\Desktop\\test\\test.txt");

      pw.println("Ausgabe des Flaecheninhalts fuer Kreise mit"); // String schreiben

      for(int r = 1; r <= 10; r++)
      {
        pw.print("Radius r = " + r + ": ");  //String schreiben
        pw.println(PI * r * r);    //double-Wert schreiben
      }

      pw.close();

    }

    catch (IOException io)
    {
          System.out.println(io.getMessage());
    }
  }
}