package selenium;

import java.security.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ctrl+a & ctrl+i ---> Alignment

		//1. Open Chrome
		                             //(String key,       String value)
		System.setProperty("webdriver.chrome.driver", "E:\\Chrome driver\\chromedriver.exe");
		//WebDriver - I/F
		//ChromeDriver() - Class
		WebDriver driver = new ChromeDriver();

		//2. Google home page
		driver.get("https://www.google.com/");
	
		//WebElement - I/F
		WebElement text = driver.findElement(By.name("q"));
		text.sendKeys("Karthick"+Keys.ENTER);
		
		//3. Quit browser
		//quit - all windows close
		//driver.quit();
		
		String title = driver.getTitle();
		System.out.println("Page title: "+title);
	}

}
