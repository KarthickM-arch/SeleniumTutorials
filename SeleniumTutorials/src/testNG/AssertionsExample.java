package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsExample {
	
	//Assertions -> We have to compare 'Actual result' & 'Expected result'.

	String name = "karthick";
	//Boolean value = false;

	@Test
	public void checkEqual() {

		/*if(name.equals("Karthick")) {

			System.out.println("Name is equal");

		} else {

			System.out.println("Name is not equal");
		}*/

		   Assert.assertEquals(name, "Karthick");

		/* Assert.assertNotEquals(name, "Karthick"); */

		/* Assert.assertTrue(value, "This should not be true"); */

		/* Assert.assertFalse(value, "This should not be true"); */

	}

}
