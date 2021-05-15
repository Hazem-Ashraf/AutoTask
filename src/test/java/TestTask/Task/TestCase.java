package TestTask.Task;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



public class TestCase extends TestBase {

	//LoginReg User;
	
	@Test(priority = 1)
	public void userSuccesLogin () {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		LoginReg User = new LoginReg(driver);
		User.UserLoginn("mngr325739", "YmYqubu");
		
		
		 wait = new WebDriverWait(driver, 10);
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//marquee[@class='heading3']")));
		} catch (Exception e) {
			fail();
		}
		
		System.out.println("Page title is : " + driver.getTitle());
	}
	@Test(priority = 2)
	public void userManagerid () {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		LoginReg User = new LoginReg(driver);
		User.UserLoginn("mngr325739", "YmYqubu");
		
		
		 wait = new WebDriverWait(driver, 10);
		
		try {
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//td[contains(text(),'Manger Id : mngr325739')]")));
		} catch (Exception e) {
			fail("Failed to Find Manager ID");
		}
		assertEquals("Manger Id : mngr325739", driver.findElement(By.xpath("//table[@class='layout']/tbody/tr/td/table//tr[@class='heading3']//td")).getText());
		
		
	}
	@Test(priority = 3)
	public void userReg () throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		LoginReg User = new LoginReg(driver);
		User.UserLoginn("mngr325739", "YmYqubu");
		
		
		 wait = new WebDriverWait(driver, 10);
		
		try {
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//td[contains(text(),'Manger Id : mngr325739')]")));
		} catch (Exception e) {
			fail("Failed to Find Manager ID");
		}
		User.UserReg("Hazem", "10/11/1990", "Egypt", "Cairo", "ddd", "123456", "12345678", "test@teeveest.com", "123456789");
		wait = new WebDriverWait(driver, 10);
		//Thread.sleep(3000);
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='heading3']")));
		} catch (Exception e) {
			fail(" Customer failed to Register Successfully");
		}
		assertEquals("Customer Registered Successfully!!!", driver.findElement(By.xpath("//p[@class='heading3']")).getText());
		
		System.out.println(driver.findElement(By.xpath("//p[@class='heading3']")).getText());
	}
	
	
	
}


