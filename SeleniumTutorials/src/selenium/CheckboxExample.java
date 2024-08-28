package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/checkbox.xhtml");

		//Choose the checkbox
		WebElement checkboxEnable = driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt89\"]/div[2]"));
		checkboxEnable.click();

		//Verify if check box is disabled or not
		WebElement checkboxDisable = driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt102\"]/div[2]"));
		Boolean isDisbale = checkboxDisable.isEnabled();
		System.out.println("Checkbox is disable: "+isDisbale);

		//DeSelect task
		WebElement firstElement = driver.findElement(By.xpath("//*[@id=\"j_idt87:basic\"]/tbody/tr/td[1]/div/div[2]"));
		if (firstElement.isSelected())
		{
			firstElement.click();
		}

		WebElement secondElement = driver.findElement(By.xpath("//*[@id=\"j_idt87:basic\"]/tbody/tr/td[2]/div/div[2]"));
		if (secondElement.isSelected())
		{
			secondElement.click();
		}
	}

}
