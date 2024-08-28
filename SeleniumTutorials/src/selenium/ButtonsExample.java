package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ButtonsExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver", "E:\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/button.xhtml");

		//Click on Button
		//WebElement button = driver.findElement(By.id("j_idt88:j_idt90"));
		//button.click();

		//Get the XY position of the button
		WebElement buttonPosition = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt94\"]/span[2]"));
		Point xyPoint = buttonPosition.getLocation();
		int xValue = xyPoint.getX();
		int yValue = xyPoint.getY();
		System.out.println("X position is: "+ xValue);
		System.out.println("Y position is: "+ yValue);

		//Find the color of the button
		WebElement buttonColor = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt96\"]/span[2]"));
		String colorName = buttonColor.getCssValue("color");
		System.out.println("Button color is: "+ colorName);

		//Find the size of the button
		WebElement sizeButton = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt98\"]/span[2]"));
		int height = sizeButton.getSize().getHeight();
		int width = sizeButton.getSize().getWidth();
		System.out.println("Height is: "+ height);
		System.out.println("Width is: "+ width);

		//Confirm if the button is disabled
		WebElement buttonDisable = driver.findElement(By.id("j_idt88:j_idt92"));
		Boolean enable = buttonDisable.isEnabled();
		System.out.println("Is the button is enable: " +enable);

		//Click Image Button and Click on any hidden button
		WebElement imageButton = driver.findElement(By.id("j_idt88:j_idt102:imageBtn"));
		imageButton.click();

		//Mouse over and confirm the color changed
		WebElement buttonColorovermouse = driver.findElement(By.id("j_idt88:j_idt100"));

		Actions action = new Actions(driver);
		action.moveToElement(buttonColorovermouse).build().perform();

		Thread.sleep(2000);

		WebElement colorSpan = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt100\"]/span"));
		System.out.println("Mouse over button color changed is: " +colorSpan.getCssValue("background-color"));

	}

}
