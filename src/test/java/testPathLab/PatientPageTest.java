package testPathLab;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pagesPathLab.AddNewPatient;
import pagesPathLab.PatientPg;

public class PatientPageTest extends BaseTest {
public PatientPg PPg;
public AddNewPatient AddNew;
public void initObject() {
	PPg=new PatientPg(driver);
	AddNew=new AddNewPatient(driver);
}
@BeforeClass
public void driverInitialization() {
	 initObject();
}
@Test(priority = 1,testName="Patient Page Opening",enabled =true)
public void launchPatientPage() throws InterruptedException {
	PPg.ClickPatient();
	Thread.sleep(1000);
	AddNew.AddPatient();
}
@Test(priority = 2,testName="Enter New Patient Data",enabled =true)
public void AddNewPatientData() {
	AddNew.EnterNewPatentData();
	
	
}
}
