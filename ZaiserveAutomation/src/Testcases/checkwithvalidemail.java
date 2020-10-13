package Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.Loginobjects;

public class checkwithvalidemail extends Commonoperations

{
	
	@Test
	public void checkwithvalidemailid()
	{
		//check with valid email id,and check error message displayed
		
		
		
		
		PageFactory.initElements(driver, Loginobjects.class);
		Loginobjects.userName.sendKeys("hell0@gmail.com");
		Loginobjects.login.click();
		String user_text=Loginobjects.email_err.getText();
		Assert.assertEquals(user_text,"");
	}
	
	
}
