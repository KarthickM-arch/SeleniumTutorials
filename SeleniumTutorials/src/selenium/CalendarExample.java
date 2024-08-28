package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver", "E:\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("http://www.leafground.com/pages/Calendar.html");

		WebElement calendar = driver.findElement(By.id("datepicker"));
		//calendar.sendKeys("29/08/2022"+Keys.ENTER);
		calendar.click();

		//a[@title='Next']
		WebElement nextButton = driver.findElement(By.xpath("//a[@title='Next']"));
		nextButton.click();

		//a[contains(text(), '10')]
		WebElement dateTobeGiven = driver.findElement(By.xpath("//a[contains(text(), '10')]"));
		dateTobeGiven.click();

	}

}
