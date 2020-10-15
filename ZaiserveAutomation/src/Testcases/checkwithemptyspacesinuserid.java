package Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.Loginobjects;

public class checkwithemptyspacesinuserid extends Commonoperations

{
	
	@Test
	public void checkwithuserfieldempryspaces()
	{
		//check with user id spec
		
		
		PageFactory.initElements(driver, Loginobjects.class);
		Loginobjects.userName.sendKeys("     ");
		Loginobjects.login_btn.click();
		String user_text=Loginobjects.email_err.getText();
		Assert.assertEquals(user_text,"Enter a valid e-mail address");
	}
	
	
}

