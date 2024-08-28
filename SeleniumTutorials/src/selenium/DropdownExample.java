package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		     //setProperty(String key, String value)
		System.setProperty("Webdriver.chrome.driver", "E:\\Chrome driver\\chromedriver.exe");
		//WebDriver -> I/F.
		//ChromeDriver() -> Class.
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/select.xhtml");

		//Select the drop down values
		//WebElement -> I/F.
		WebElement dropDown = driver.findElement(By.className("ui-selectonemenu"));
		//Select - class using for dropdown
		Select select = new Select(dropDown);
		//Dropdown value (select) -> i, Index  ii,Value  iii,VisibleText
		select.selectByIndex(1);
		//Program execution delay
		Thread.sleep(3000);
		select.selectByVisibleText("Cypress");

		//Get the number of dropdown options
		//List -> I/F.
		List<WebElement> listOfoptions = select.getOptions();
		int size = listOfoptions.size();
		System.out.println("Number of elements: " +size);

		Thread.sleep(3000);

		//Choose your preferred drop down value
		dropDown.sendKeys("Pl");

	}

}
