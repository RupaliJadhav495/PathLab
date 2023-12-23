package testPathLab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import pagesPathLab.LoginPg;

public class BaseTest {
	public static WebDriver driver;
	LoginPg Lp;

	@BeforeTest
	public void createSession() {
		try {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
//	 driver=new ChromeDriver();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();

		driver.get("https://gor-pathology.web.app/");

		Reporter.log("Url lunch", true);
		}catch(Exception e) {
			
		}
	}
	
}
