package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver", "E:\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/pages/autoComplete.html");

		WebElement input = driver.findElement(By.id("tags"));
		input.sendKeys("s");

		Thread.sleep(3000); //Explicit wait //Implicit wait

		List<WebElement> optionsList = driver.findElements(By.xpath("//*[@id='ui-id-1']/li"));

		System.out.println(optionsList.size());

		for (WebElement webElement : optionsList) {

			/*if (webElement.getText().equals("Web Services")) {
				webElement.click();
				System.out.println("Selecting "+webElement.getText());
				break;*/

			if (webElement.getText().equals("Selenium")) {
				webElement.click();
				System.out.println("If part");
				break;
			}

			else
			{
				System.out.println("Else part");
			}

		}

	}

}