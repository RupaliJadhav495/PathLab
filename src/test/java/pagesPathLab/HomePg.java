package pagesPathLab;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

import utility.Log;

public class HomePg {
	public WebDriver driver;
	public WebDriverWait wait;

	@FindBy(xpath = "//ul[@class=\"MuiList-root MuiList-padding\"]/li")
	private List<WebElement> ToDoList;
	@FindBy(xpath = "//div[@class=\"jss55\"]")
	private WebElement ToDoTab;
	@FindBy(xpath = "//div[text()=\"Total\"]")
	private WebElement total;
	@FindBy(xpath = "//input[@id=\"patient-test\"]")
	private WebElement TestSelect;
	@FindBy(xpath = "//input[@aria-activescendant=\"patient-test-option-3\"]")
	private WebElement TestSelect1;
	@FindBy(xpath = "//input[@aria-activescendant=\"patient-test-option-2\"]")
	private WebElement TestSelect2;
	@FindBy(xpath="//*[@id=\"root\"]/div/main/div[2]/div[3]/div/div[2]/div[2]/div/div")
	private WebElement Discount;
	@FindBy(xpath = "(//ul[@class=\"MuiList-root MuiMenu-list MuiList-padding\"]/li)[2]")
	private WebElement Discount5;

	public HomePg(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}

	public void checkToDoList() {
		try {
			wait.until(ExpectedConditions.visibilityOfAllElements(ToDoList));
			int listSize=ToDoList.size();
			Log.info("ToDo List is Displayed And List count is " + ToDoList.size());
			Reporter.log("ToDo List is Displayed And List count is " +listSize, true);
		} catch (Exception e) {

		}
	}

	public void checkToDoTag() {
		try {
			wait.until(ExpectedConditions.visibilityOf(ToDoTab));
			Log.info("ToDo Tab is Displayed  ");
		} catch (Exception e) {

		}
	}
	public void  TestOptionSelection() {
		try {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true)",total);
			wait.until(ExpectedConditions.visibilityOf(total));
			Log.info("Test Selection Tab is Visible");
			Reporter.log("Total is Visible");
			TestSelect.click();
			Log.info("Test Selection Tab is clicked");
//			wait.until(ExpectedConditions.visibilityOf(TestSelect1));
//			TestSelect1.click();
//			Log.info("Patient Selected first test");
//			TestSelect2.click();
//			Log.info("Patient Selected first test");
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void DiscountSlection() throws InterruptedException {
		Discount.click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(Discount5));
		Thread.sleep(1000);
		Discount5.click();
	}
	
	@AfterTest
	public void closeSession() {
		
	}

}
