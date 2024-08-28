package testNG;

import org.testng.annotations.Test;

public class SampleTestCase {
	
	//TestNG -> No use the main method.
	
	//How to install TestNG - Goto Eclipse -> Help -> Install New Software -> Add.

	//How to change the TestNG testcase?
	//@Test -> TestNG Test
	//Add TestNG library
	//import 'Test'(org.testng.annotations)

	@Test
	public void firstTestCase() {
		System.out.println("This is the first test case");
	}
	

	/*@Test
	public void secondTestCase() {
		System.out.println("This is the second test case");
	}

	@Test
	public void thirdTestCase() {
		System.out.println("This is the third test case");
	}

	@Test
	public void fourthTestCase() {
		System.out.println("This is the fourth test case");
	}*/
	
	

	/*
	 * Result: We can get the minimized details for the TC's.
	 * 		   We can get the result for method name alphabets.
	 */
}
