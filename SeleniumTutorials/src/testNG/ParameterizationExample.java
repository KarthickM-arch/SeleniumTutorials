package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExample {

	//Using "@Parameters()".
	//testNG.xml -> In this file, we should mention the parameter name & value.
	//           -> <parameter name = "Name" value = "KarthickMuthu">
	
	@Test
	@Parameters("Name")
	public void printName(String yourName) {
		System.out.println("Name is "+yourName);
	}

}
