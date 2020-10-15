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
		    public static  WebElement login_btn;

		   @FindBy(xpath="//*[@id=\'email-error\']/strong")
		   public static  WebElement email_err;
		   
		   @FindBy(xpath="//*[@id=\'email-error\']/strong")
		   public static  WebElement password_w;
		   
		   @FindBy(xpath=" //*[@id=\"root\"]/div/div[2]/div/form/div[2]/div[2]")
		   public static  WebElement password_err;
		   
		   
		   @FindBy(xpath="//*[@id=\'email-error\']/strong")
		   public static  WebElement  userid_lable;
		   
		   
		   @FindBy(xpath=" //*[@id=\"root\"]/div/div[2]/div/form/div[1]/div/div[1]/label")
		   public static  WebElement  userid_placeholder;
		   
		   @FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/form/h5")
		   public static  WebElement  login_page_title;
		   
		
		   
		   
		   @FindBy(xpath="//*[@id=\'email-error\']/strong")
		   public static  WebElement  forgot_password;
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		
		

		}
	


