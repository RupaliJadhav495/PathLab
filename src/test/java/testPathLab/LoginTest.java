package testPathLab;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pagesPathLab.LoginPg;
import utility.PropReader;

public class LoginTest extends BaseTest{
  public LoginPg Lp;
  public void initObject() {
	  Lp=new LoginPg(driver);
  }
  @BeforeClass
  public void driverinitialization() {
	  initObject();
  }
  @Test(priority = 1,testName="valid email and valid password",enabled =true)
  public void validLogin() throws InterruptedException {
	  Lp.enterEmail(PropReader.readProperties("email"));
	  Thread.sleep(1000);
	  Lp.enterPassword(PropReader.readProperties("password"));
	  Thread.sleep(1000);
	  Lp.clickLogin();
  }
}
