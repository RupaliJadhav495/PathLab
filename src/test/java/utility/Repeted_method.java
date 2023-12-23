package utility;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class Repeted_method {

	public static void swipe(WebElement element ,String direction,AppiumDriver driver  ) {
		//direction =up is for swipe
		//direction =up/down for scroll
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Map<String ,Object>params=new HashMap<>();
		params.put("direction",direction);
		//params.put("element" ,((RemoteWebElement) element).getId());
		//params.put("toVisible", true);
		js.executeScript("mobile: swipe", params);
	}
public static void pickerWheel(AppiumDriver driver,WebElement element) {
	List<WebElement>val=driver.findElements(By.xpath("//XCUIElementTypeOther[@name=\"web dialog\"]/XCUIElementTypeOther[3]/XCUIElementTypeOther"));
	Map<String ,Object>params=new HashMap<>();
	params.put("order", "next")	;
	params.put("offset", 0.30);
	params.put("element" ,((RemoteWebElement) val.get(0)).getId());
	//params.put("toVisible", true);
	driver.executeScript("mobile: selectPickerWheelValue", params);

}

 public static WebElement addindexXpath(WebElement ele,String add,AppiumDriver driver) {
	 String existingXpath=ele.getAttribute("xpath");
	 System.out.println(existingXpath);
	 String newXpath=existingXpath+"["+add+"]";
	 System.out.println(newXpath);
	 WebElement newElement=driver.findElement(AppiumBy.xpath(newXpath));
	 System.out.println(newElement);
	 return newElement;
 }
 public static void multipleChoiceGeneric( List<WebElement> elements, String... values) throws InterruptedException {
	    try {
	        if (!values[0].equalsIgnoreCase("all")) {
	        	Thread.sleep(200);
	            for (WebElement element : elements) {
	                String text = element.getAttribute("name");
	               
	                for (String value : values) {
	                	System.out.println(value+" "+values);
	                    if (text.equalsIgnoreCase(value)) {
	                    
	                    	Thread.sleep(200);
	                        element.click();
	                        break;
	                    }
	                }
	            }
	        } else {
	            for (WebElement element : elements) {
	                element.click();
	            }
	        }
	    } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
	        System.err.println("Exception occurred: " + e.getMessage());
	    }
	}












}
