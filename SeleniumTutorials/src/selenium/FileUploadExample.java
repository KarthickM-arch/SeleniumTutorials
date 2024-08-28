package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadExample {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver", "E:\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/file.xhtml");

		WebElement chooseButton = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt89\"]/span[1]"));
		chooseButton.click();

		Thread.sleep(3000);

		//Windows controls begins here
		//StringSelection - class usage is normal java string plan text format transfered
		StringSelection selection = new StringSelection("C:\\Users\\ADMIN\\Downloads\\TestLeaf Logo.png");

		//setContents(Transferable contents, ClipboardOwner owner)
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

		//Robot - class usage is keyboard action simulate
		Robot robot = new Robot();
		//VK - Virtual Key (press)
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		//VK - Virtual Key (release)
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		Thread.sleep(3000);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

}
