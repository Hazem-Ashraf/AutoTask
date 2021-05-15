package TestTask.Task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;


public class TestBase {

	public static WebDriver driver;

	@BeforeMethod
	public void StartDriver () {

		String chromepath = System.getProperty("user.dir")+"\\resources\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver",chromepath );
		driver = new ChromeDriver();
		//driver.manage().window().maximize();

		driver.navigate().to("http://demo.guru99.com/v4/");
	
		

	}

	@AfterMethod
	public void CloseDriver() {

		driver.quit();
	}
	/*
	@AfterMethod
	public void screenShot(ITestResult result) {
		
		if (result.getStatus() == ITestResult.FAILURE) {
		System.out.println("Take screenshot");
		ScreenShots.GetScreenshot(driver, result.getName());
		}
		
	} */

}
