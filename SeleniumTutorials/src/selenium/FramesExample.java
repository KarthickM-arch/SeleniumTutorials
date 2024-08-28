package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver", "E:\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/frame.xhtml");

		//Click Me (Inside frame)
		//Frame - method is using for frame
		driver.switchTo().frame(0);
		WebElement clickMebutton1 = driver.findElement(By.id("Click"));
		Thread.sleep(3000);
		clickMebutton1.click();

		String text = driver.findElement(By.id("Click")).getText();
		System.out.println(text);


		//Click Me (Inside Nested frame)
		//defaultContent - method is used, "exit the frame and come to the default content"
		driver.switchTo().defaultContent();

		driver.switchTo().frame(2);
		//Frame having another frame
		driver.switchTo().frame("frame2");

		WebElement clickMebutton2 = driver.findElement(By.id("Click"));
		clickMebutton2.click();


		//How many frames
		driver.switchTo().defaultContent();
		List<WebElement> totalFrames = driver.findElements(By.tagName("iframe"));
		int size = totalFrames.size();
		System.out.println("Frames count: "+size);

	}

}