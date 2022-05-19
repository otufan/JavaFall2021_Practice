package _15_Streams;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

public class MyFilterWriter extends FilterWriter {

	public static void main(String[] args) {
		
	}
	public MyFilterWriter(Writer out) {

		super(out);

	}

	@Override
	public void write(int c) throws IOException {
		if (c<48 || (c>57 && c<65) || (c>90 && c<97) || c>122) {
			c=42;
		}
		super.write(c);
	}

	@Override
	public void write(char[] cbuf, int off, int len) throws IOException {
		
		for (int i = 0; i < len; i++) {
			write(cbuf[i+off]);
		}
	}

	@Override
	public void write(String str, int off, int len) throws IOException {
		
		for (int i = off; i < len; i++) {
			write((int)str.charAt(i+off));			
		}
		// write(str.toCharArray(), off, len); 
	}
	
	

}
