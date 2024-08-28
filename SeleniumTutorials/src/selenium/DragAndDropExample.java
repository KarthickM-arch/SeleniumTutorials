package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver", "E:\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/drag.xhtml");

		//Drag and drop
		WebElement from = driver.findElement(By.id("form:drag"));
		WebElement to = driver.findElement(By.id("form:drop"));

		//Actions - class use, mouse related interactions
		Actions actions = new Actions(driver);
		Thread.sleep(2000);
		//build().perform() - Use this, action perform
		//actions.clickAndHold(from).moveToElement(to).release(to).build().perform();
        //(WebElement source, WebElement target)
		actions.dragAndDrop(from, to).perform();

		//Draggable
		WebElement dragMove1 = driver.findElement(By.id("form:conpnl"));
		WebElement dragMove2 = driver.findElement(By.id("form:restrictPanel"));
		Thread.sleep(2000);
		actions.clickAndHold(dragMove1).moveToElement(dragMove2).release(dragMove2).build().perform();
		
		//contextClick() - Right click on the mouse
		WebElement elementToRightClick = driver.findElement(By.id("form:conpnl_header"));
		actions.contextClick(elementToRightClick).perform();

	}

}
