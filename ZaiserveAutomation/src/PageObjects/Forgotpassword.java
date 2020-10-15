package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Forgotpassword {
	
	
	
	
	
	WebDriver driver;
	 
	 

    @FindBy(name="email")
	public static  WebElement Email;

   @FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/form/div[2]/button")
   public static WebElement send_btn;
   
   
   @FindBy(name="err_msg")
   public static WebElement err_msg;

   @FindBy(name="login")
   public static WebElement login_link;
   
   @FindBy(name="lable")
   public static WebElement Forgotpassword_lable;
   
   @FindBy(name="login_link")
   public static WebElement loginPage_link;
   
   @FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/form/h5")
   public static WebElement forgotpassword_title;
   



}


