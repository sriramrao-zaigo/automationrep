package Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.Forgotpassword;

public class Checkforgotpassword_page_title extends Commonoperations{
	
	
	@Test
	public void checkemailnotexist()
	{
		//check Forgot Password lable
		
		PageFactory.initElements(driver, Forgotpassword.class);
		String lable_msg= Forgotpassword.forgotpassword_title.getText();
		Assert.assertEquals(lable_msg,"Forget Password");
		
		
		
		
	}
	
	

}
