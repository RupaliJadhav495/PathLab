package testPathLab;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pagesPathLab.HomePg;

public class HomePageTest extends BaseTest {
 public HomePg Hp;
 public void initObject() {
	 Hp=new HomePg(driver);
 }
 @BeforeClass
 public void driverInitialization() {
	 initObject();
 }
 @Test(priority = 1,testName="TODO List Visibility",enabled =true)
 public void TodoListVisibility() {
	 Hp.checkToDoList();
	 Reporter.log("ToDo List is Visible");
 }
 @Test(priority = 2,testName="TODO Tab Visibility",enabled =true)
 public void TodoTabVisibility() {
	 Hp.checkToDoTag();
 }
 @Test(priority = 3,testName="Test Selection",enabled =true)
 public void EnterTest() {
	 Hp.TestOptionSelection();
 }
 @Test(priority = 4,testName="Discount Selection",enabled =true)
 public void EnterDiscount() throws InterruptedException {
	 Hp.DiscountSlection();
 }
 
}
