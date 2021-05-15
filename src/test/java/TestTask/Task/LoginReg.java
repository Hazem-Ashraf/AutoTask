package TestTask.Task;

import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginReg extends PageBase {

	public LoginReg(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//input[@name='uid']")
	WebElement userid;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath = "//input[@name='btnLogin']")
	WebElement loginbtn;
	
	@FindBy(xpath = "//a[@href='addcustomerpage.php']")
	WebElement newcustomer;
	
	@FindBy(xpath = "//input[@name='name']")
	WebElement customername;
	
	@FindBy(xpath = "//tr[5]/td[2]/input[1]")
	WebElement gender;
	
	@FindBy(xpath = "//input[@id='dob']")
	WebElement date;
	
	@FindBy(xpath = "//textarea[@name='addr']")
	WebElement address;
	
	@FindBy(xpath = "//input[@name='city']")
	WebElement city;
	
	@FindBy(xpath = "//input[@name='state']")
	WebElement state;
	
	@FindBy(xpath = "//input[@name='pinno']")
	WebElement pin;
	
	@FindBy(xpath = "//input[@name='telephoneno']")
	WebElement mobile;
	
	@FindBy(xpath = "//input[@name='emailid']")
	WebElement email;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement passwordbtn;
	
	@FindBy(xpath = "//input[@name='sub']")
	WebElement submitbtn;
	
	

		public void UserLoginn (String useidlogin , String passwordlogin) {
			
			//WebDriverWait wait = new WebDriverWait(driver, 60);
			
			userid.sendKeys(useidlogin);
			password.sendKeys(passwordlogin);
			loginbtn.click();
			
			
		
		
	}
		
public void UserReg (String name , String dateE, String addressE, String cityE, String stateE, String pinE, String mobileE, String emailE, String passwordE ) {
			
			//WebDriverWait wait = new WebDriverWait(driver, 60);
			
	newcustomer.click();
	customername.sendKeys(name);
	gender.click();
	date.sendKeys(dateE);
	address.sendKeys(addressE);
	city.sendKeys(cityE);
	state.sendKeys(stateE);
	pin.sendKeys(pinE);
	mobile.sendKeys(mobileE);
	email.sendKeys(emailE);
	passwordbtn.sendKeys(passwordE);
	submitbtn.click();
			
			
			
		
		
	}	

}
