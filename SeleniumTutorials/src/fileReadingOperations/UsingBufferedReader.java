package fileReadingOperations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UsingBufferedReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String location = "UsingBufferedWriter.txt";

		//FileReader -> Class
		FileReader fileReader = new FileReader(location);
		//BufferedReader -> Class
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		//readLine() -> Return as "String"
		String currentLine;
		while((currentLine = bufferedReader.readLine())!=null) {
			System.out.println(currentLine);
		}

	}

}
