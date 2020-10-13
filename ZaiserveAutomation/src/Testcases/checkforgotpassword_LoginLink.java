package Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.Forgotpassword;

public class checkforgotpassword_LoginLink extends Commonoperations
{
	
	
	@Test
	public void checkemailnotexist()
	{
		//check Link for the Login page in forgotpassword page
		
		PageFactory.initElements(driver, Forgotpassword.class);
		String text=Forgotpassword.login_link.getAttribute("href");
		Assert.assertEquals(text,"http://dev.zaicrm.com/#/");
		
		
		
		
	}
	
	

}
