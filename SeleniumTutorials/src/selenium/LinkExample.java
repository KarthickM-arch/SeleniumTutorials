package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver", "E:\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/link.xhtml");

		//Hyper Link text - Full
		//driver.findElement(By.linkText("Go to Dashboard")).click();

		//Hyper Link text - Partial
		driver.findElement(By.partialLinkText("Dashboard")).click();

	}

}
