package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenGoogleWithFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. Open Firefox
		System.setProperty("webdriver.gecko.driver", "E:\\Firefox (or) Gecko driver\\geckodriver-v0.32.1-win64\\geckodriver.exe");
		
		//WebDriver - I/F
		//FirefoxDriver() - Class
		WebDriver driver = new FirefoxDriver();

		//2. Google home page
		driver.get("https://www.google.com/");

		//3. Quit browser
		//driver.quit();

		//4. Enter a search term
		driver.findElement(By.name("q")).sendKeys("HDFC"+Keys.ENTER);

	}

}
