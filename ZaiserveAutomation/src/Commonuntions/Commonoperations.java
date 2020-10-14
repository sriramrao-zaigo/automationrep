package Commonuntions;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.chrome.ChromeOptions;



public class Commonoperations 

{
	
	public  WebDriver driver;
	
	
	@BeforeSuite
	public void Startbrowser()
	{
		
		
		
		
		System.out.println(System.getProperty("os.name"));
		
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");

		ChromeOptions options = new ChromeOptions();
	  options.addArguments("--headless", "--no-sandbox", "--disable-dev-shm-usage");
	    
	
		driver = new ChromeDriver(options);
		
	   
		driver.get("http://dev.zaicrm.com/#/");

		driver.manage().window().maximize();
		
	
		
	}
	@AfterSuite
	public void close()

	{
		
		driver.quit();
	}
	
	

}
