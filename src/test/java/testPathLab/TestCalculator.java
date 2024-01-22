package testPathLab;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pagesPathLab.TestCalculatorPg;

public class TestCalculator extends BaseTest{
public TestCalculatorPg TestCal;
public void initObject() {
	TestCal=new TestCalculatorPg(driver);
}
@BeforeClass
public void driverInitialization() {
	 initObject();
}
@Test(priority = 1,testName="Patients test calculator testing",enabled=true)
public void CheckingCal() throws InterruptedException {
	TestCal.AddPatientTest();
	TestCal.AddDiscount();
	TestCal.AddLab();
	TestCal.AddDoctor();
	TestCal.AddDoctorCommision();
	TestCal.AddEquipment();
}
}
