package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationsHierarchyExamples {
	
	/*@BeforeSuite
	@BeforeTest
	@BeforeClass
	@BeforeMethod
	@Test    ---------------   I'm before method
			 (Multiple test)   I'm test2
							   I'm after method
	@AfterMethod
	@AfterClass
	@AfterTest
	@AfterSuite*/
	

	/*@Test
	public void test2() {
		System.out.println("I'm test2");
	}*/
	

	@Test
	public void test() {
		System.out.println("I'm test");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I'm before method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("I'm after method");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("I'm before class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("I'm after class");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("I'm before test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("I'm after test");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("I'm before suite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("I'm after suite");
	}

}
