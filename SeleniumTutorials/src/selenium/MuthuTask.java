package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MuthuTask {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.Chrome.driver", "E:\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/window.xhtml");

		/*
		 * WebElement justClick = driver.findElement(By.id("j_idt106:thisform:age"));
		 * justClick.sendKeys(Keys.ENTER);
		 *
		 *
		 * WebElement clickDropdown =
		 * driver.findElement(By.xpath("//*[@id=\"j_idt106:auto-complete\"]/button"));
		 * clickDropdown.click();
		 *
		 * WebElement typeNumber = driver.findElement(By.id("j_idt106:slider"));
		 * typeNumber.sendKeys("70");
		 *
		 * WebElement clearText = driver.findElement(By.id("j_idt88:j_idt95"));
		 * clearText.clear();
		 *
		 * WebElement disableTextbox = driver.findElement(By.id("j_idt88:j_idt93"));
		 * boolean disable = !disableTextbox.isEnabled();
		 * System.out.println("Checkboxes is enable: "+disable);
		 */

		/*
		 * WebElement buttonHeightwidth = driver.findElement(By.id("j_idt88:j_idt98"));
		 * int height = buttonHeightwidth.getSize().getHeight(); int width =
		 * buttonHeightwidth.getSize().getWidth();
		 * System.out.println("Button height is: "+height);
		 * System.out.println("Button width is: "+width);
		 *
		 * WebElement buttonColor = driver.findElement(By.id("j_idt88:j_idt98")); String
		 * color = buttonColor.getCssValue("background");
		 * System.out.println("Button color is: "+color);
		 *
		 * WebElement buttonColorovermouse =
		 * driver.findElement(By.id("j_idt88:j_idt100"));
		 *
		 * Actions action = new Actions(driver);
		 * action.moveToElement(buttonColorovermouse).build().perform();
		 *
		 * Thread.sleep(2000);
		 *
		 * WebElement colorSpan =
		 * driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt100\"]/span"));
		 * System.out.println("Mouse over button color changed is: "
		 * +colorSpan.getCssValue("background-color"));
		 */

		/*
		 * WebElement language = driver.findElement(By.id("j_idt87:lang_label"));
		 * language.click();
		 *
		 * WebElement languageSelect =
		 * driver.findElement(By.xpath("//*[@id=\"j_idt87:lang_1\"]"));
		 * languageSelect.click(); String englishLanguage =
		 * languageSelect.getAttribute("data-label");
		 * System.out.println(englishLanguage);
		 *
		 * WebElement selectValue = driver.findElement(By.id("j_idt87:value_label"));
		 * selectValue.click();
		 *
		 * if(englishLanguage.equals("English")) { WebElement valueTwo =
		 * driver.findElement(By.id("j_idt87:value_3")); valueTwo.click(); } else {
		 * System.out.println("Please select the correct language"); }
		 */

		/*
		 * WebElement triCheckbox1 =
		 * driver.findElement(By.xpath("//*[@id=\"j_idt87:ajaxTriState\"]/div[2]"));
		 * triCheckbox1.click();
		 *
		 * Thread.sleep(2000);
		 *
		 * WebElement triCheckboxstate1 =
		 * driver.findElement(By.id("j_idt87:id_container")); String stateStatus1 =
		 * triCheckboxstate1.getText();
		 * System.out.println("State status 1: "+stateStatus1+"\n");
		 *
		 * Thread.sleep(2000);
		 *
		 * WebElement triCheckbox2 =
		 * driver.findElement(By.xpath("//*[@id=\"j_idt87:ajaxTriState\"]/div[2]"));
		 * triCheckbox2.click();
		 *
		 * Thread.sleep(2000);
		 *
		 * WebElement triCheckboxstate2 =
		 * driver.findElement(By.id("j_idt87:id_container")); String stateStatus2 =
		 * triCheckboxstate2.getText();
		 * System.out.println("State status 2: "+stateStatus2+"\n");
		 *
		 * Thread.sleep(2000);
		 *
		 * WebElement triCheckbox3 =
		 * driver.findElement(By.xpath("//*[@id=\"j_idt87:ajaxTriState\"]/div[2]"));
		 * triCheckbox3.click();
		 *
		 * Thread.sleep(2000);
		 *
		 * WebElement triCheckboxstate3 =
		 * driver.findElement(By.id("j_idt87:id_container")); String stateStatus3 =
		 * triCheckboxstate3.getText();
		 * System.out.println("State status 3: "+stateStatus3+"\n");
		 *
		 * WebElement toggleSwitchon =
		 * driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt100\"]/div[2]"));
		 * toggleSwitchon.click();
		 *
		 * Thread.sleep(2000);
		 *
		 * WebElement toggleSwitchonstatus =
		 * driver.findElement(By.id("j_idt87:msg_container")); String toggleStatuson =
		 * toggleSwitchonstatus.getText();
		 * System.out.println("Toggle Switch "+toggleStatuson+"\n");
		 *
		 * Thread.sleep(2000);
		 *
		 * WebElement toggleSwitchoff =
		 * driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt100\"]/div[2]"));
		 * toggleSwitchoff.click();
		 *
		 * Thread.sleep(2000);
		 *
		 * WebElement toggleSwitchoffstatus =
		 * driver.findElement(By.id("j_idt87:msg_container")); String toggleStatusoff =
		 * toggleSwitchoffstatus.getText();
		 * System.out.println("Toggle Switch "+toggleStatusoff+"\n");
		 *
		 * WebElement checkboxStatus = driver.findElement(By.id("j_idt87:j_idt102"));
		 * String isEnablecheckbox = checkboxStatus.getText();
		 * System.out.println("Checkbox status is "+isEnablecheckbox);
		 *
		 * WebElement multipleSelect = driver.findElement(By.id("j_idt87:multiple"));
		 * multipleSelect.click();
		 *
		 * Thread.sleep(2000);
		 *
		 * WebElement enterText = driver.findElement(By.xpath(
		 * "//*[@id=\"j_idt87:multiple_panel\"]/div[1]/div[2]/input"));
		 * enterText.sendKeys("L");
		 *
		 * Thread.sleep(2000);
		 *
		 * WebElement SelectBox = driver.findElement(By.xpath(
		 * "//*[@id=\"j_idt87:multiple_panel\"]/div[1]/div[1]/div[2]"));
		 * SelectBox.click();
		 *
		 * Thread.sleep(2000);
		 *
		 * WebElement closeIcon =
		 * driver.findElement(By.xpath("//*[@id=\"j_idt87:multiple_panel\"]/div[1]/a"));
		 * closeIcon.click();
		 */

		/*
		 * WebElement unSelectable = driver.findElement(By.xpath(
		 * "//*[@id=\"j_idt87:city2\"]/div/div[2]/div/div[2]")); unSelectable.click();
		 * Thread.sleep(2000); unSelectable.click();
		 *
		 * WebElement ageSelected1 = driver.findElement(By.id("j_idt87:age:1")); boolean
		 * defaltAgeselected = ageSelected1.isSelected();
		 * System.out.println(defaltAgeselected);
		 *
		 * WebElement ageSelected2 =
		 * driver.findElement(By.xpath("//*[@id=\"j_idt87:age\"]/div/div[1]/div/div[2]")
		 * ); WebElement ageSelected3 =
		 * driver.findElement(By.xpath("//*[@id=\"j_idt87:age\"]/div/div[3]/div/div[2]")
		 * );
		 *
		 * if(!ageSelected2.isSelected()) { Thread.sleep(2000); ageSelected3.click();
		 * System.out.println("Selected 3rd radio option"); }
		 */

		/*
		 * WebElement confirmDialog = driver.findElement(By.id("j_idt88:j_idt93"));
		 * confirmDialog.click();
		 *
		 * Alert alert = driver.switchTo().alert();
		 *
		 * Thread.sleep(3000);
		 *
		 * alert.accept();
		 *
		 * WebElement confirmResult = driver.findElement(By.id("result")); String
		 * getResult = confirmResult.getText();
		 * System.out.println("Confirm Dialog - "+getResult);
		 *
		 *
		 * WebElement promptDialog = driver.findElement(By.id("j_idt88:j_idt104"));
		 * promptDialog.click();
		 *
		 * Thread.sleep(3000);
		 *
		 * alert.sendKeys("Karthick");
		 *
		 * Thread.sleep(3000);
		 *
		 * alert.accept();
		 *
		 * WebElement promptResult = driver.findElement(By.id("confirm_result")); String
		 * getPromptresult = promptResult.getText();
		 * System.out.println("Prompt Dialog - "+getPromptresult);
		 *
		 *
		 *
		 * WebElement minMax = driver.findElement(By.id("j_idt88:j_idt111"));
		 * minMax.click();
		 *
		 * WebElement minMaxcontent =
		 * driver.findElement(By.id("j_idt88:j_idt112_content")); String contentMinmax =
		 * minMaxcontent.getText(); System.out.println("Min and Max: "+contentMinmax);
		 *
		 * Thread.sleep(3000);
		 *
		 * WebElement maxIconclick =
		 * driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt112\"]/div[1]/a[2]"));
		 * maxIconclick.click();
		 *
		 * Thread.sleep(3000);
		 *
		 * WebElement closeIconclick =
		 * driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt112\"]/div[1]/a[1]"));
		 * closeIconclick.click();
		 */

		/*
		 * driver.switchTo().frame(2);
		 *
		 * driver.switchTo().frame("frame2");
		 *
		 * WebElement nestedFrame = driver.findElement(By.id("Click"));
		 * Thread.sleep(2000); nestedFrame.click(); String getNestedframetext =
		 * nestedFrame.getText(); System.out.println(getNestedframetext);
		 *
		 * driver.switchTo().defaultContent();
		 *
		 * List<WebElement> frameCounttag = driver.findElements(By.tagName("iframe"));
		 * int frameCount = frameCounttag.size();
		 * System.out.println("Total frames count: "+frameCount);
		 */

		/*
		 * WebElement clickWindow = driver.findElement(By.id("j_idt88:new"));
		 * clickWindow.click();
		 *
		 * Set<String> newWindow = driver.getWindowHandles();
		 *
		 * List<String> newWlindowlist = new ArrayList<String>(newWindow); String
		 * checkNewwindow = newWlindowlist.get(1);
		 * driver.switchTo().window(checkNewwindow);
		 *
		 *
		 * for (String checkNewwindow : newWindow) {
		 *
		 * driver.switchTo().window(checkNewwindow);
		 *
		 * }
		 *
		 *
		 * WebElement clickBrowser =
		 * driver.findElement(By.xpath("//*[@id=\"menuform:j_idt39\"]"));
		 * clickBrowser.click();
		 *
		 * Thread.sleep(3000);
		 *
		 * WebElement clickWindowicon = driver.findElement(By.id("menuform:m_window"));
		 * clickWindowicon.click();
		 */

	}

}
