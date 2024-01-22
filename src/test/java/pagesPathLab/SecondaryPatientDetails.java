package pagesPathLab;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class SecondaryPatientDetails {
	public WebDriver driver;
	public WebDriverWait wait;

	@FindBy(xpath = "//input[@name='height']")
	private WebElement EnterHeight;
	@FindBy(xpath = "//input[@name='weight']")
	private WebElement EnterWeight;
	@FindBy(xpath = "//div[@id='mui-component-select-gender']")
	private WebElement SelectGender;
	@FindBy(xpath = "//li[@data-value=\"female\"]")
	private WebElement GenderOptionFemale;
	@FindBy(xpath = "//input[@name='age']")
	private WebElement SelectAge;
	@FindBy(xpath = "//input[@name='systolic']")
	private WebElement SelectSystolicValue;
	@FindBy(xpath = "//input[@name='diastolic']")
	private WebElement SelectDistolicValue;
	@FindBy(xpath = "(//button[@type='button'])[4]")
	private WebElement AddTestButton;

	public SecondaryPatientDetails(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}
	public void ClearPatientData() {
		try {
			
			
			
			SelectAge.clear();
			Thread.sleep(500);
			SelectDistolicValue.clear();
			Thread.sleep(500);
			SelectSystolicValue.clear();
			Thread.sleep(500);
			
		}catch(Exception e) {
			
		}
	}

	public void InsertHeight(String value) {
		try {

			wait.until(ExpectedConditions.visibilityOf(EnterHeight));
			EnterHeight.clear();
			Thread.sleep(500);
			EnterHeight.sendKeys(value);
//			Thread.sleep(500);
//			EnterWeight.sendKeys("65");
//			Thread.sleep(500);
//			SelectGender.click();
//			GenderOptionFemale.click();
//			SelectAge.sendKeys("35");
//			SelectSystolicValue.sendKeys("100");
//			SelectDistolicValue.sendKeys("80");
//			Actions act=new Actions(driver);
//			act.moveToElement(AddTestButton).click().build().perform();

		} catch (Exception e) {

		}
	}

	public void InsertWeight(String value) {
		try {
			wait.until(ExpectedConditions.visibilityOf(EnterWeight));
			EnterWeight.clear();
			Thread.sleep(500);
			EnterWeight.sendKeys(value);
//				Thread.sleep(500);	

		} catch (Exception e) {

		}
	}

	public void InsertGender() {
		try {
			wait.until(ExpectedConditions.visibilityOf(SelectGender));
			SelectGender.clear();
			Thread.sleep(500);
			SelectGender.click();
			GenderOptionFemale.click();

		} catch (Exception e) {

		}
	}

	public void InsertAge(String value) {
		try {
			wait.until(ExpectedConditions.visibilityOf(SelectAge));
			SelectAge.clear();
			Thread.sleep(500);
			SelectAge.sendKeys(value);

		} catch (Exception e) {

		}
	}

	public void InsertSystolic(String value) {
		try {
			wait.until(ExpectedConditions.visibilityOf(SelectSystolicValue));
			SelectSystolicValue.clear();
			Thread.sleep(500);
			SelectSystolicValue.sendKeys(value);

		} catch (Exception e) {

		}
	}

	public void InsertDistolic(String value) {
		try {
			wait.until(ExpectedConditions.visibilityOf(SelectDistolicValue));
			SelectDistolicValue.clear();
			Thread.sleep(500);
			SelectDistolicValue.sendKeys(value);

		} catch (Exception e) {

		}
	}

	public void AddTest() {
		try {
			Actions act = new Actions(driver);
			act.moveToElement(AddTestButton).click().build().perform();
			Reporter.log("All data field proceed to test calculator page", true);

		} catch (Exception e) {

		}
	}

}
