package fileWritingOperations;

import java.io.FileOutputStream;
import java.io.IOException;

//FileOutputStream -> For writing raw byte array information.

public class UsingFileOutputStream {

	public static void main(String[] args) throws IOException {
		
		String location = "UsingFOS.txt";
		String content = "Learning Java File Output Stream";
		
		//FileOutputStream -> Class
		FileOutputStream fileOutputStream = new FileOutputStream(location);
		//getBytes() -> Return as, byte[]
		byte[] writeThis = content.getBytes();
		fileOutputStream.write(writeThis);
		fileOutputStream.close();
	}

}
