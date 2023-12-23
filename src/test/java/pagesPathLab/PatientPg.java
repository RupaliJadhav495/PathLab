package pagesPathLab;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.Log;

public class PatientPg {
	public WebDriver driver;
	public WebDriverWait wait;
 @FindBy(xpath = "//span[text()=\"Patients\"]")
 private WebElement EnterPatientPage;
 
 public PatientPg(WebDriver driver) {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
	 wait= new WebDriverWait(driver, Duration.ofSeconds(30));
 }
 public void ClickPatient() {
	 try {
		 wait.until(ExpectedConditions.visibilityOf(EnterPatientPage));
	 EnterPatientPage.click();
	 Log.info("Patient Page open");
	 }catch (Exception e) {
		// TODO: handle exception
	}
 }
}
