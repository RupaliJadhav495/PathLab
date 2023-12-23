package testPathLab;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pagesPathLab.PatientPg;

public class PatientPageTest extends BaseTest {
public PatientPg PPg;
public void initObject() {
	PPg=new PatientPg(driver);
}
@BeforeClass
public void driverInitialization() {
	 initObject();
}
@Test(priority = 5,testName="Patient Page Opening",enabled =true)
public void launchPatientPage() throws InterruptedException {
	PPg.ClickPatient();
	Thread.sleep(1000);
}
}
