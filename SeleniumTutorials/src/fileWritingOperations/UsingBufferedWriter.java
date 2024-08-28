 package fileWritingOperations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//BufferedWriter -> Performance is best.

public class UsingBufferedWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String location = "UsingBufferedWriter.txt";
		String content = "Learning Java Buffered Writer";
		
		FileWriter fileWriter = new FileWriter(location);
		
		//BufferedWriter -> Class
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		
		bufferedWriter.write(content);
		
		bufferedWriter.close();

	}

}
