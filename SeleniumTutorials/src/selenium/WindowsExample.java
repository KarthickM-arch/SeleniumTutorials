package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver", "E:\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/window.xhtml");

		//Click and Confirm new Window Opens
		//getWindowHandle -> method is used to identify the current window
		//                -> return as, String
		String oldWindow = driver.getWindowHandle();

		Thread.sleep(3000);

		WebElement firstWindow = driver.findElement(By.id("j_idt88:new"));
		firstWindow.click();

		//getWindowHandles -> method is used to identify all windows
		//				   -> return as, Set<String>
		Set<String> handle = driver.getWindowHandles();
        //for each - Iterable
		for (String newWindow : handle) {
			//window - function is used, switch the another window
			driver.switchTo().window(newWindow);

		}

		WebElement browser = driver.findElement(By.xpath("//*[@id=\"menuform:j_idt39\"]/a"));
		browser.click();

		Thread.sleep(3000);

		driver.close();

		driver.switchTo().window(oldWindow);


		//Find the number of opened tabs
		WebElement openedTabs = driver.findElement(By.id("j_idt88:j_idt91"));
		openedTabs.click();

		int numberOfwindows = driver.getWindowHandles().size();
		System.out.println("Number of windows opened: "+numberOfwindows);


		//Close all windows except Primary
		WebElement closeWindows = driver.findElement(By.id("j_idt88:j_idt93"));
		closeWindows.click();

		Set<String> newWindowhandle = driver.getWindowHandles();

		for (String allWindows : newWindowhandle) {

			if(!allWindows.equals(oldWindow))
			{
				driver.switchTo().window(allWindows);
				//close - current window close
				driver.close();
			}
		}

		//quit - all windows close
		//driver.quit();


		//Wait for 2 new tabs to open
		driver.switchTo().window(oldWindow);

		WebElement waitTwotabs = driver.findElement(By.id("j_idt88:j_idt95"));
		Thread.sleep(5000);
		waitTwotabs.click();

	}

}