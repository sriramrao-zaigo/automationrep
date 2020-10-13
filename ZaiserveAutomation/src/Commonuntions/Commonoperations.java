package Commonuntions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;



public class Commonoperations 

{
	
	public  WebDriver driver;
	
	
	@BeforeSuite
	public void Startbrowser()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

 		driver.get("http://dev.zaicrm.com/#/");
 		driver.manage().window().maximize();
		
	}
	@AfterSuite
	public void close()

	{
		
		driver.quit();
	}
	
	

}
