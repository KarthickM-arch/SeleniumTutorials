package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/radio.xhtml");

		//UnSelectable radio buttons
		WebElement unChecked = driver.findElement(By.xpath("//*[@id=\"j_idt87:city2\"]/div/div[1]/div/div[2]"));
		Boolean notSelected = unChecked.isSelected();
		System.out.println(notSelected);

		//Find the default select radio button
		WebElement thirdLabelChecked = driver.findElement(By.id("j_idt87:console2:2"));
		Boolean isChecked = thirdLabelChecked.isSelected();
		System.out.println(isChecked);

	}

}
