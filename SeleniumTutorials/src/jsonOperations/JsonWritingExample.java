package jsonOperations;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonWritingExample {

	//JSON (Java Script Object Notation).
	//JSON Writing -> Create JSON object.
	//	           -> Add "Key" & "Value" pair using put() 
	//             -> If JSON array is needed, create object for JSON array then add the elements to it. Using add()
	//             -> To add JSON array to JSON object, use same put()
	//             -> To write this JSON to a file, use file writer.

	public static void main(String[] args) throws IOException {

		//JSONObject -> Class
		JSONObject jsonObject = new JSONObject();

		jsonObject.put("Name", "Karthick");
		jsonObject.put("Age", 33);

		//JSONArray -> Class
		JSONArray jsonArray = new JSONArray();
		jsonArray.add("Miss My Kuttypaiyan");
		jsonArray.add("Life is lot of pain");

		jsonObject.put("Life struggles", jsonArray);

		FileWriter fileWriter = new FileWriter("Karthick.json");
		//toJSONString()
		fileWriter.write(jsonObject.toJSONString());
		fileWriter.close();
	}
}
