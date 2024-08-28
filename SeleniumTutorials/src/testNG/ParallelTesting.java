package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTesting {
	
	//parallel - Should be mention in "testNG.xml" file.

	@Test
	public void openGoogle() {

		System.setProperty("Webdriver.Chrome.driver", "E:\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.quit();

	}

	@Test
	public void openBing() {

		System.setProperty("Webdriver.Chrome.driver", "E:\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.bing.com/");

		driver.quit();

	}

	@Test
	public void openYahoo() {

		System.setProperty("Webdriver.Chrome.driver", "E:\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.yahoo.com/");

		driver.quit();

	}

}
