package selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver", "E:\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("http://www.leafground.com/pages/table.html");

		/*
		 * <tr> -> Table Row, <th> -> Table Header, <td> -> Table Cell.
		 */

		//Table column count
		List<WebElement> columns = driver.findElements(By.tagName("th"));
		int columnCount = columns.size();
		System.out.println("Number of columns: "+columnCount);


		//Table row count
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		int rowCount = rows.size();
		System.out.println("Number of rows: "+rowCount);


		//Get the progress value of "Learn to interact with Elements"
		//normalize-space() ->  Front & Back spaces truncated
		//following:: -> Next
		WebElement getPercent = driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
		String percent = getPercent.getText();
		System.out.println("Percentage is: "+percent);


		//Check the vital task for the least completed progress
		List<WebElement> allProgress = driver.findElements(By.xpath("//td[2]"));

		List<Integer> numberList = new ArrayList();

		for (WebElement webElement : allProgress) {
			String individualValue = webElement.getText().replace("%", "");
			//Integer.parseInt() -> String converted to Integer
			numberList.add(Integer.parseInt(individualValue));
		}

		System.out.println("Final list "+numberList);
		//Collections -> Class, hierarchy for the "List & Set"
		int smallValue = Collections.min(numberList);
		System.out.println(smallValue);

		//Integer.toString() -> Integer converted to String
		String smallValuestring = Integer.toString(smallValue)+"%";

		//td[normalize-space()='20%']//following::td[1]
		String finalXpath = "//td[normalize-space()="+"\""+ smallValuestring +"\""+"]"+"//following::td[1]";
		System.out.println(finalXpath);

		WebElement check = driver.findElement(By.xpath(finalXpath));
		check.click();
	}

}
