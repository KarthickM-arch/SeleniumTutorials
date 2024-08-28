package fileWritingOperations;

import java.io.FileWriter;
import java.io.IOException;

//FileWriter -> Costly operation.
//           -> Direct interaction with files.
//           -> Less performance.

public class UsingFileWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//1.File location 2.Content
		
		String location = "UsingFileWriter.txt";
		String content = "Learning Java File Writer";
		
		//FileWriter -> Class
		FileWriter fileWriter = new FileWriter(location);
		
		fileWriter.write(content);
		
		fileWriter.close(); 

	}

}
