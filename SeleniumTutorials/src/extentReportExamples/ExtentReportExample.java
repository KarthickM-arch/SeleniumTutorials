package extentReportExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.ActualMain;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportExample {

	WebDriver driver;

	ExtentReports extentReports;

	ExtentSparkReporter sparkReporter;

	ExtentTest testCase;

	@BeforeSuite
	public void launchBrowser() {
		extentReports = new ExtentReports();

		sparkReporter = new ExtentSparkReporter("target/Spark.html");

		extentReports.attachReporter(sparkReporter);

		driver = new ChromeDriver();
	}


	@Test
	public void openGoogle() {
		testCase = extentReports.createTest("Verify Google Title");
		testCase.log(Status.INFO, "Navigating to Google");

		driver.get("https://www.google.com/");

		String title = driver.getTitle();

		testCase.log(Status.INFO, "Actul title: "+title);
		testCase.log(Status.INFO, "Expected title: "+"Google");
		testCase.log(Status.INFO, "Verification of Actual & Expected title ");

		if(title.equals("Google")) {
			//System.out.println("Passed");	
			testCase.log(Status.PASS, "Actual title & Expected title are equal");
		} else {
			//System.out.println("Failed");
			testCase.log(Status.FAIL, "Actual title & Expected title NOT are equal");
		}
	}


	@Test
	public void openBing() {
		testCase = extentReports.createTest("Verify Bing Title");
		testCase.log(Status.INFO, "Navigating to Bing");

		driver.get("https://www.bing.com/");

		String title = driver.getTitle();

		testCase.log(Status.INFO, "Actul title: "+title);
		testCase.log(Status.INFO, "Expected title: "+"Bing");
		testCase.log(Status.INFO, "Verification of Actual & Expected title ");

		if(title.equals("Bing")) {
			//System.out.println("Passed");
			testCase.log(Status.PASS, "Actual title & Expected title are equal");
		} else {
			//System.out.println("Failed");
			testCase.log(Status.FAIL, "Actual title & Expected title NOT are equal");
		}
	}


	@Test
	public void openWikipedia() {
		testCase = extentReports.createTest("Verify Wikipedia Title");
		testCase.log(Status.INFO, "Navigating to wikipedia");

		driver.get("https://www.wikipedia.org/");

		String title = driver.getTitle();

		testCase.log(Status.INFO, "Actul title: "+title);
		testCase.log(Status.INFO, "Expected title: "+"wikipedia");
		testCase.log(Status.INFO, "Verification of Actual & Expected title ");

		if(title.equals("wikipedia")) {
			//System.out.println("Passed");
			testCase.log(Status.PASS, "Actual title & Expected title are equal");
		} else {
			//System.out.println("Failed");
			testCase.log(Status.FAIL, "Actual title & Expected title NOT are equal");
		}
	}


	@AfterSuite
	public void closeBrowser() {
		driver.quit();
		extentReports.flush();
	}
}
