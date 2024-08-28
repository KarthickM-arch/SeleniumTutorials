package fileWritingOperations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UsingPath {
	
//Path -> This also writes byte array.

	public static void main(String[] args) throws IOException {
		
		String location = "UsingPath.txt";
		String content = "Learning Java Path";
		
		//Path -> I/F.
		//Paths -> Class.
		Path path = Paths.get(location);
		//Files -> Class.
		Files.write(path, content.getBytes());

	}

}
