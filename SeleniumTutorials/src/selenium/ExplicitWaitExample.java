package selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample {
	
	//Waits types -> i, Implicit. ii, Explicit.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver", "E:\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/waits");
		
		driver.findElement(By.id("accept")).click();
		
		//driver.switchTo().alert().accept();
		
		Duration duration = 30;
		WebDriverWait wait = new WebDriverWait(driver, duration);
		Alert until = wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(until.getText());
		until.accept();
	}

}
