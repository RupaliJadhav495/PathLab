package pagesPathLab;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class AddNewPatient {
	public WebDriver driver;
	public WebDriverWait wait;
	@FindBy(xpath = "(//button[@type=\"submit\"])[1]")
	private WebElement AddPatientButton;
	@FindBy(xpath = "//div[text()=\"Add Patient\"]")
	private WebElement AddPatientText;
	@FindBy(xpath = "//input[@name=\"name\"]")
	private WebElement EnterName;
	@FindBy(xpath = "//input[@name=\"email\"]")
	private WebElement EnterEmail;
	@FindBy(xpath = "//input[@name=\"phone\"]")
	private WebElement EnterPhone;
	@FindBy(xpath = "(//button[@type=\"button\"])[4]")
	private WebElement GeneralDetailsAddButton;
	@FindBy(xpath = "(//div[@class='jss161'])[1]")
	private WebElement SecondaryDetailTitle;
	
	
	public AddNewPatient(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
		 wait= new WebDriverWait(driver, Duration.ofSeconds(30));
	 }
	public void AddPatient() {
		try {
			wait.until(ExpectedConditions.visibilityOf(AddPatientButton));
			AddPatientButton.click();
			Reporter.log("cliked on add Patient",true);
			wait.until(ExpectedConditions.visibilityOf(AddPatientText));
			Reporter.log("Add Patient Page is Visible", true);
		}catch (Exception e) {
			// TODO: handle exception
		}	
	}
	public void EnterNewPatentData() {
		try {
			wait.until(ExpectedConditions.visibilityOf(EnterName));
			EnterName.clear();
			EnterEmail.clear();
			EnterPhone.clear();
			EnterName.sendKeys("Rupali");
			Thread.sleep(1000);
			EnterEmail.sendKeys("rj@gmail.com");
			Thread.sleep(1000);
			EnterPhone.sendKeys("8888888888");
			Thread.sleep(1000);
			GeneralDetailsAddButton.click();
			Reporter.log("General button Clicked Proceed to Secondary info page", true);
			wait.until(ExpectedConditions.visibilityOf(SecondaryDetailTitle));
			Reporter.log("Secondary Detail Tiltle is Visible",true);		
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
