package apiTesting;

//What is web service? -> A service which is available over internet is called web service.

//What is an API? -> Application Programming Interface(API) this acts as intermediary between two different application.
//                -> It can't be automated using selenium.

//Server -> A program which receives the request from the client, process it & returns the response.

//URL -> Uniform Resource Locator.

//FTP -> File Transfer Protocol.

//SMTP -> Simple Mail Transfer Protocol.

//HTTP -> Hyper Text Transfer Protocol.

//HTTP methods -> i, Get. ii, Post. iii, Put. iv, Delete.
//i, Get -> To retrieve resource.
//			Not to modify it in anyway.
//			Don't change the state of the resource, these are said to be safe methods.
//			Will return the resource & status code.
//			If the resource isn't found, then the relevant  status code will be returned.
//ii, Post -> Create a new resource.
//			  Not safe methods.
//			  Post request will have post body.
//iii, Put -> To update existing resource.
//			  If the resource doesn't exist then API may decide to create a new resource.
//iv, Delete -> Used to delete resources.


//Status codes -> A, 2XX. B, 3XX. C, 4XX. D, 5XX.
//A, 2XX -> Indicates the success reason.
//B, 3XX -> Indicating redirection.
//C, 4XX -> Error on the client side(User can handle this).
//D, 5XX -> Error on the server side(User can't handle this, only the server maintenance people can handle).


//A, 2XX(Success) -> i, 200 Ok.
//               -> ii, 210 Created.


//B, 4XX(Client error) -> i, 400 Bad request(Bad data).
//					  -> ii, 401 Unauthorized.
//					  -> iii, 403 Forbidden.
//					  -> iv, 404 Not found(Resource isn't available).


//C, 5XX(Server error) -> i, 500 Internal server error.
//					   -> ii, 501 Not implemented.
//					   -> iii, 503 Service unavailable.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpURLConnectionExample {

	//GET Method Example
	public void getMethodExample() throws IOException {

		//Create object for URL class
		URL url = new URL("https://dummy.restapiexample.com/api/v1/employees");

		//Open the URL connection & store it in parent class
		HttpURLConnection connection = (HttpURLConnection)url.openConnection();

		//Set Request Type
		connection.setRequestMethod("GET");

		//Connect
		connection.connect();

		//Get Response Code
		int statusCode = connection.getResponseCode();
		System.out.println("Status code is: "+statusCode);

		//Get Response Message
		String message = connection.getResponseMessage();
		System.out.println("Response Message is: "+message);

		//getInputStream - Use is take the response body
		InputStream inputStream = connection.getInputStream();

		//InputStreamReader - Use is reading the response body
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);

		//Create a buffered reader & pass the input stream reader
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

		String line;
		StringBuffer buffer = new StringBuffer();
		//read the lines using readlines()
		while((line=bufferedReader.readLine())!=null) {

			buffer.append(line);

		}

		System.out.println(buffer);
	}



	//Post Method Example
	public void postMethodExample() throws IOException {

		//Create object for URL class
		URL url = new URL("https://dummy.restapiexample.com/api/v1/create");

		//Open the URL connection & store it in parent class
		HttpURLConnection connection = (HttpURLConnection)url.openConnection();

		//Set Request Type
		connection.setRequestMethod("POST");

		//Set Request Property (Content type as application/json)
		connection.setRequestProperty("Content-Type", "application/json");

		//Set Do Output as True
		connection.setDoOutput(true);

		String jsonBody = "{\"name\":\"Karthick\",\"salary\":\"1000000\",\"age\":\"32\"}";

		byte[] inputJson = jsonBody.getBytes();

		OutputStream outputStream = connection.getOutputStream();

		outputStream.write(inputJson);

		System.out.println("Response code: "+connection.getResponseCode());
		System.out.println("Response Message: "+connection.getResponseMessage());

		//getInputStream - Use is take the response body
		InputStream inputStream = connection.getInputStream();

		//InputStreamReader - Use is reading the response body
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);

		//Create a buffered reader & pass the input stream reader
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

		String line;
		StringBuffer buffer = new StringBuffer();
		//read the lines using readlines()
		while((line=bufferedReader.readLine())!=null) {

			buffer.append(line);

		}

		System.out.println(buffer);


	}



	public static void main(String[] args) throws IOException {
		HttpURLConnectionExample connectionExample = new HttpURLConnectionExample();
		//connectionExample.getMethodExample();
		connectionExample.postMethodExample();
	}
}
