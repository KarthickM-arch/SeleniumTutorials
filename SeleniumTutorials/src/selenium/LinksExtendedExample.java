package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksExtendedExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver", "E:\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//get - you can not do "Refresh, Forward (or) backward
		//driver.get("https://www.leafground.com/link.xhtml");

		//navigate() - you can do "Refresh, Forward (or) backward
		driver.navigate().to("https://www.leafground.com/link.xhtml");

		WebElement homePagelink = driver.findElement(By.linkText("Go to Dashboard"));
		homePagelink.click();

		driver.navigate().back();


		//Find the URL without clicking me
		WebElement whereTogo = driver.findElement(By.partialLinkText("URL without clicking me"));
		//href - tag, we can see the page where to go
		String where = whereTogo.getAttribute("href");
		System.out.println("This link is going to "+where);


		//Am I broken link
		WebElement brokenLink = driver.findElement(By.linkText("Broken?"));
		brokenLink.click();

		String title = driver.getTitle();

		Thread.sleep(2000);

		if(title.contains("404")) {
			System.out.println("Link is broken");
		}

		driver.navigate().back();


		//Find the duplicate Link
		/*
		 * StaleElementReferenceException - We can identify the one web element and action perform it.
		 * Page refresh (or) redirect and again back to the original page.
		 * Next, we call the used web element name.
		 * Getting this exception.
		 *
		 * How to solve the above exception?
		 * Again we should find the web element & perform it.
		 */
		WebElement homePagelink1 = driver.findElement(By.linkText("Go to Dashboard"));
		homePagelink1.click();
		driver.navigate().back();


		//Count Links
		List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
		int linkCount = totalLinks.size();
		System.out.println("Total links "+linkCount);
	}

}
