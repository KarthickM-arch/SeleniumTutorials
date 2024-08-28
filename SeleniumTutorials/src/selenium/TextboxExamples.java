package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextboxExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver", "E:\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/input.xhtml");

		//Textbox - Enter the text
		//driver.findElement(By.id("j_idt88:name")).sendKeys("Karthick");
		WebElement name = driver.findElement(By.id("j_idt88:name"));
		name.sendKeys("Karthick");

		//Textbox - Append (Old text + New text)
		// 2 types of xpath -> // Relative
		//                  -> / Absolute
		//driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]")).sendKeys("-Perumbakkam");
		WebElement appendBox = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]"));
		appendBox.sendKeys("-Perumbakkam");

		//Textbox - Retrieve text
		//String value = driver.findElement(By.name("j_idt88:j_idt97")).getAttribute("value");
		//System.out.println(value);
		WebElement textBoxvalue = driver.findElement(By.name("j_idt88:j_idt97"));
		String value = textBoxvalue.getAttribute("value");
		System.out.println(value);

		//Textbox - Clear text
		//driver.findElement(By.name("j_idt88:j_idt95")).clear();
		WebElement clearText = driver.findElement(By.name("j_idt88:j_idt95"));
		clearText.clear();

		//Disable box
		WebElement disableBox = driver.findElement(By.id("j_idt88:j_idt93"));
		Boolean enable = disableBox.isEnabled();
		System.out.println("Is the textbox is enable: " +enable);

		//Just Press Enter and confirm error message
		WebElement clickTextbox = driver.findElement(By.id("j_idt106:thisform:age"));
		clickTextbox.sendKeys(""+Keys.ENTER);
		WebElement warningMsg = driver.findElement(By.id("j_idt106:thisform:j_idt110"));
		String msg = warningMsg.getText();
		System.out.println(msg);

		//Type your name in searchbox
		WebElement textSearchbox = driver.findElement(By.id("j_idt106:auto-complete_input"));
		textSearchbox.sendKeys("ka");

		//Type your DOB (mm/dd/yyyy)
		WebElement dobTextbox = driver.findElement(By.id("j_idt106:j_idt116_input"));
		dobTextbox.click();
	}
}