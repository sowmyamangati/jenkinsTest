import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SFDCTestClass {
	public static void main(String[] args) {
		int a;
		WebDriver driver;
	    WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		

		System.out.println("LoginErrorMessage");
		// WebDriverManager.chromedriver().setup();
		// WebDriver driver;
		// driver = new ChromeDriver();
		driver.get("https://login.salesforce.com"); //1 for loading browser with a given url
		
		String currenturl = driver.getCurrentUrl();//2returns the loaded url	
		System.out.println("current page url is"+currenturl);
		//returns the current page title
		String title=driver.getTitle();
		System.out.println("current page Title is:"+title);
		
		title=driver.getPageSource();
		System.out.println("current page Source is:"+title);
		
		//<input class="input r4 wide mb16 mt8 username" type="email" value="" name="username" id="username" aria-describedby="error">
		WebElement uname = driver.findElement(By.id("username"));
		uname.sendKeys("Sowmya@atoz.com");
		
		WebElement pswd = driver.findElement(By.id("password"));
		pswd.sendKeys("Welcome01");
		//WebElement loginbtn = driver.findElement(By.xpath("//*[@id=\"Login\"]"));
		WebElement loginbtn = driver.findElement(By.id("Login"));
		
		loginbtn.click();
	}
	 
	
	
	
	
	
	
	
	
	
	
	
	
}