package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver", "E:\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		//tooltip - get the title attribute value. 99% tooltip text available in "title" attribute
		WebElement googleSearchtextbox = driver.findElement(By.name("q"));
		String toolTiptext = googleSearchtextbox.getAttribute("title");
		System.out.println("Google search box tooltip name is: "+toolTiptext);
		
		
		driver.get("https://www.redbus.in/");
		WebElement redBusLogo = driver.findElement(By.className("rb_logo"));
		String toolTipText = redBusLogo.getAttribute("title");
		System.out.println("Red Bus tooltip name is: "+toolTipText);

	}

}
