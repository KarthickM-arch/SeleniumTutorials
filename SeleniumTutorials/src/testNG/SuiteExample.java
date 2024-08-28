package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExample {
	
	//Suite - Collection of Testcases.
	
	//test-output -> We can see the test result in "index.html".

	WebDriver driver;

	long startTime;

	long endTime;

	@BeforeSuite
	public void launchBrowser() {

		startTime = System.currentTimeMillis();

		System.setProperty("Webdriver.Chrome.driver", "E:\\Chrome driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test(priority = 0)
	public void openGoogle() {
		driver.get("https://www.google.com/");
	}

	@Test(priority = 1)
	public void openBing() {
		driver.get("https://www.bing.com/");
	}

	@Test(priority = 2)
	public void openYahoo() {
		driver.get("https://www.yahoo.com/");
	}

	@AfterSuite
	public void closeBrowser() {

		driver.quit();

		endTime = System.currentTimeMillis();

		long totalTime = endTime - startTime;

		System.out.println("Total time taken "+ totalTime);

	}
}
