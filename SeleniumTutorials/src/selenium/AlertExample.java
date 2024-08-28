package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/alert.xhtml");

		//Alert (Simple Dialog)
		WebElement alertBox = driver.findElement(By.id("j_idt88:j_idt91"));
		alertBox.click();
		//Alert - Interface using for alert
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();

		//Alert (Confirm Dialog)
		WebElement alertConfirmbutton = driver.findElement(By.id("j_idt88:j_idt93"));
		alertConfirmbutton.click();
		Alert confirmAlert = driver.switchTo().alert();
		Thread.sleep(3000);
		confirmAlert.dismiss();

		//Alert (Prompt Dialog)
		WebElement promptBox = driver.findElement(By.id("j_idt88:j_idt104"));
		promptBox.click();
		Alert enterPromptalert = driver.switchTo().alert();
		Thread.sleep(3000);
		enterPromptalert.sendKeys("Karthick");
		Thread.sleep(3000);
		enterPromptalert.accept();

		//Sweet Alert (Simple Dialog)
		WebElement alertDialog = driver.findElement(By.id("j_idt88:j_idt95"));
		alertDialog.click();
		//Xpath types -> i, Absolute. ii, Relative.
		//i, Absolute -> It will start from root node. It have single /.
		//ii, Relative -> It will start from the current node. It have double //.
		WebElement dialogBoxtext = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt96_content\"]"));
		String text = dialogBoxtext.getText();
		System.out.println("Dialog: " +text);
		Thread.sleep(3000);
		driver.findElement(By.id("j_idt88:j_idt98")).click();

		//Sweet Modal Dialog
		driver.findElement(By.id("j_idt88:j_idt100")).click();
		WebElement dialogText = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt101_content\"]/p"));
		String modalText = dialogText.getText();
		System.out.println("Modal Dialog: " +modalText);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt101\"]/div[1]/a")).click();

		//Yes or No
		driver.findElement(By.id("j_idt88:j_idt106")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("j_idt88:j_idt108")).click();

		//Min & Max
		driver.findElement(By.id("j_idt88:j_idt111")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt112\"]/div[1]/a[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt112\"]/div[1]/a[1]")).click();
	}

}
