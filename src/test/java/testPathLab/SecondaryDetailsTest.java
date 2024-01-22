package testPathLab;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pagesPathLab.SecondaryPatientDetails;
import utility.PropReader;

public class SecondaryDetailsTest extends BaseTest {
public SecondaryPatientDetails SceDetail;
public void initObject() {
	SceDetail=new SecondaryPatientDetails(driver);
}
@BeforeClass
public void driverInitialization() {
	 initObject();
}
@Test
public void InsertSecondaryData() throws InterruptedException {
//	SceDetail.ClearPatientData();
//	Thread.sleep(1000);
	SceDetail.InsertHeight(PropReader.readProperties("height"));
	SceDetail.InsertAge(PropReader.readProperties("age"));
	SceDetail.InsertWeight(PropReader.readProperties("weight"));
	SceDetail.InsertGender();
	SceDetail.InsertSystolic(PropReader.readProperties("systolic"));
	SceDetail.InsertDistolic(PropReader.readProperties("distolic"));
	SceDetail.AddTest();
}
}
