package pagesPathLab;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCalculatorPg {
	public WebDriver driver;
	public WebDriverWait wait;
	public Actions act;
	public JavascriptExecutor js;
	@FindBy(xpath = "//input[@id='patient-test']")
	private WebElement SelectTest;
	@FindBy(xpath ="(//div[@aria-haspopup=\"listbox\"])[1]")
	private WebElement SelectDiscount;
	@FindBy(xpath ="//input[@id=\"patient-tests-labs\"]")
	private WebElement SelectLab;
	@FindBy(xpath ="//input[@name=\"doctor_name\"]")
	private WebElement SelectDoctor;
	@FindBy(xpath ="//div[@id=\"mui-component-select-doctor_commission\"]")
	private WebElement SelectDoctorCommision;
	@FindBy(xpath ="//span[text()=\"add_box\"]")
	private WebElement SelectEquipmentButton;
	@FindBy(xpath ="//div[@aria-label=\"Eqipment Name\"]")
	private WebElement SelectEquipmentName;
	@FindBy(xpath ="//input[@aria-label=\"Required\"]")
	private WebElement SelectEquipmentRequired;
	@FindBy(xpath ="//span[text()=\"check\"]")
	private WebElement SelectActionCheck;
	@FindBy(xpath ="//span[text()=\"clear\"]")
	private WebElement SelectActionCancel;
	@FindBy(xpath ="//span[@class=\"MuiButton-label jss123\"]")
	private WebElement SelectAddPatient;
	@FindBy(xpath ="//div[@class=\"MuiBox-root jss156\"]")
	private WebElement TextTotal;
	
	
	 public TestCalculatorPg(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		act=new Actions(driver);
		js = (JavascriptExecutor)driver;
	}
	 
	 public void AddPatientTest() throws InterruptedException {
		 wait.until(ExpectedConditions.visibilityOf(SelectTest));
		 SelectTest.sendKeys(" ");
		 act.click(SelectTest).sendKeys("  ").build().perform();
		 act.sendKeys(Keys.ARROW_DOWN).perform();
		 Thread.sleep(1000);
		 act.sendKeys(Keys.ARROW_DOWN).perform();
		 Thread.sleep(1000);
		 act.sendKeys(Keys.ENTER).perform();
		 
	 }
	 public void AddDiscount() throws InterruptedException {
		 wait.until(ExpectedConditions.visibilityOf(SelectDiscount));
		 act.click(SelectDiscount).perform();
		 act.sendKeys(Keys.ARROW_DOWN).perform();
		 Thread.sleep(1000);
		 act.sendKeys(Keys.ENTER).perform();
	 }
	 public void AddLab() throws InterruptedException {
		 wait.until(ExpectedConditions.visibilityOf(SelectLab));
		 SelectLab.click();
		 // act.click(SelectLab).perform();
		 act.sendKeys(Keys.ARROW_DOWN).perform();
		 Thread.sleep(1000);
		 act.sendKeys(Keys.ENTER).perform();
	 }
	 public void AddDoctor() throws InterruptedException {
		 wait.until(ExpectedConditions.visibilityOf(SelectDoctor));
		 SelectDoctor.click();
		 // act.click(SelectLab).perform();
		 act.sendKeys(Keys.ARROW_DOWN).perform();
		 Thread.sleep(1000);
		 act.sendKeys(Keys.ENTER).perform();
	 }
	 public void AddDoctorCommision() throws InterruptedException {
		 wait.until(ExpectedConditions.visibilityOf(SelectDoctorCommision));
		 SelectDoctorCommision.click();
		 // act.click(SelectLab).perform();
		 act.sendKeys(Keys.ARROW_DOWN).perform();
		 Thread.sleep(1000);
		 act.sendKeys(Keys.ENTER).perform();
		 Thread.sleep(1000);
		 
	 }
	 public void AddEquipment() throws InterruptedException {
		 js.executeScript("window.scrollBy(0,1000)");
		 Thread.sleep(1000);
		 
		 //SelectAddPatient.click();
		 act.doubleClick(SelectEquipmentButton).perform();
		 Thread.sleep(1000);
		 act.moveToElement(SelectEquipmentName).click();
		 act.sendKeys(Keys.ARROW_DOWN).perform();
		 Thread.sleep(1000);
		 act.sendKeys(Keys.ENTER).perform();
		 Thread.sleep(1000);
		 act.sendKeys(SelectEquipmentRequired, "2").click().build().perform();
         SelectActionCheck.click();
         Thread.sleep(1000);
         act.moveToElement(SelectAddPatient).click().build().perform();
		 
	 }
	 public void AddPatient() {
		 
	 }
	
	
}
