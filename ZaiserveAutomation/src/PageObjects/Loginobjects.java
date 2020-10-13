package PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginobjects

{
	
	
WebDriver driver;
		 
		 

		    @FindBy(name="email")
			public static  WebElement userName;

		    @FindBy(name="password")
            public static  WebElement password;    

		    @FindBy(xpath="/html/body/div/div/div/div/div/form/div/div[4]/div/a")
		    public static WebElement titleText;

		    @FindBy(tagName="button")
		    public static  WebElement login;

		   @FindBy(xpath="//*[@id=\'email-error\']/strong")
		   public static  WebElement email_err;
		   
		   @FindBy(xpath="//*[@id=\'email-error\']/strong")
		   public static  WebElement password_w;
		   
		   @FindBy(xpath="//*[@id=\'email-error\']/strong")
		   public static  WebElement  userid_lable;
		   
		   @FindBy(xpath="//*[@id=\'email-error\']/strong")
		   public static  WebElement  forgot_password;
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		
		

		}
	


