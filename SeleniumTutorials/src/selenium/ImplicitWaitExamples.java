package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitExamples {
	
	//Waits types -> i, Implicit. ii, Explicit.
	
	//Implicit -> It's applicable to all the elements.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
				System.setProperty("Webdriver.chrome.driver", "E:\\Chrome driver\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://www.redbus.in/");
				
				WebElement account = driver.findElement(By.id("account_dd"));
				account.click();
				//implicitlyWait(long, TimeUnit)
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				WebElement login = driver.findElement(By.id("user_sign_in_sign_up"));
				login.click();


	}

}
