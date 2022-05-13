package javaProjects.person2;

import static java.nio.file.StandardOpenOption.READ;
import static java.nio.file.StandardOpenOption.WRITE;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DateiVerarbeitung {

	private byte[] data;
	public static ByteBuffer b = null;
	public static ByteBuffer list;
	public static Path FILE = Paths.get("C:\\Test\\Person.txt");
	FileChannel fc;
	private static long position=0;

	public byte[] getData() {
		return data;
	}
	
	public void setData(byte[] data) {
		this.data = data;
	}

	public static ByteBuffer getB() {
		return b;
	}

	public static void setB(ByteBuffer b) {
		DateiVerarbeitung.b = b;
	}

	public static Path getFile() {
		return FILE;
	}

	public void datenInDatei(Person p) throws IOException {
		
		fc=FileChannel.open(FILE, READ, WRITE);
		String a=p.toString()+"\n";
		data=a.getBytes();
		b=ByteBuffer.wrap(data);		
		fc.position(position);
		
		while (b.hasRemaining())
			fc.write(b);
		position=position+a.length();
	}
}
