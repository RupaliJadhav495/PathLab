package pagesPathLab;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.Log;


public class LoginPg{
	public WebDriver driver;
	public WebDriverWait wait;
	
	
	@FindBy(name = "email")
	private WebElement email;
	@FindBy(name = "password")
	private WebElement password;
	@FindBy(className = "MuiButton-label") 
	private WebElement LoginButton;
	
	public LoginPg(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}
	
	public void enterEmail(String value){
		
	try {
		wait.until(ExpectedConditions.visibilityOf(email));
		email.sendKeys(value);
		Log.info("User entered email as "+value);
	}catch(Exception e) {
		
	}
	}
	public void enterPassword(String value){
		
		try {
			wait.until(ExpectedConditions.visibilityOf(password));
			password.sendKeys(value);
			Log.info("User entered password successfully as ");
		}catch(Exception e) {
			
		}
		}
public void clickLogin(){
		
		try {
			wait.until(ExpectedConditions.visibilityOf(LoginButton));
			LoginButton.click();
			Log.info("Succesfully clicked on login button ");
		}catch(Exception e) {
			
		}
		}
}
