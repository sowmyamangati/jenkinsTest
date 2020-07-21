import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;


public class SFDCAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
IntializeDriver();
createReport();


	}

	private static void createReport() {
		
	}

	
	private static void IntializeDriver() {
		// TODO Auto-generated method stub
		
	}
	public static void TC_LoginErrorMessage() {
	ExtentReports e=new ExtentReports("./ExtentReportResults.htm");
    ExtentTest test= e.startTest("111111TC_2_LoginToSalesForce");


//OpenUrl("https://login.salesforce.com");
	}

}
