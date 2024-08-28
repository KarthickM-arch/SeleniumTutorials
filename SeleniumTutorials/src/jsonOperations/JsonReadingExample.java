package jsonOperations;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReadingExample {

	//JSON Reading -> Create object for JSON parser.
	//	           -> (File Reader) Read from "xxx.json"
	//             -> Parse the read file using parse() & store it in object.
	//             -> To get the values, from the parsed object, use get(). But to do that, we have to convert the object to Json object. Store them after type casting.
	//             -> Now use, get() with Key to retrieve name, age & store them after type casting.
	// 			   -> To fetch data from Json Array, use iterator() & iterate them and print.


	public static void main(String[] args) throws IOException, ParseException {

		//JSONParser -> Class
		JSONParser jsonParser = new JSONParser();

		//FileReader -> Class
		FileReader fileReader = new FileReader("Karthick.json");

		//Object -> Class
		Object parsedObject = jsonParser.parse(fileReader);

		//JSONObject -> Class
		//(JSONObject) -> This is type casting
		JSONObject jsonObject = (JSONObject) parsedObject;

		//String -> Class
		//(String) -> This is type casting
		String name = (String) jsonObject.get("Name");
		System.out.println("Name is: "+name);
		//Long -> Class
		//(Long) -> This is type casting
		Long age = (Long) jsonObject.get("Age");
		System.out.println("Age is: "+age);
		//JSONArray -> Class
		//(JSONArray) -> This is type casting
		JSONArray array = (JSONArray) jsonObject.get("Life struggles");
		//iterator() -> Return as, Iterator
		//Iterator -> I/F;
		Iterator iterator = array.iterator();
		while (iterator.hasNext()) {
			System.out.println("Life struggles: "+iterator.next());
		}
	}
}
