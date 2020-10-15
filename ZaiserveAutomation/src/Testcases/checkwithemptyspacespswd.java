package Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.Loginobjects;

	
	
	public class checkwithemptyspacespswd extends Commonoperations

	{
		
		@Test
		public void checkwithuserfieldempryspaces()
		{
			//check with password empty spaces
			
			
			PageFactory.initElements(driver, Loginobjects.class);
			Loginobjects.password.sendKeys("     ");
			Loginobjects.login_btn.click();
			String user_text=Loginobjects.password_err.getText();
			Assert.assertEquals(user_text,"Enter your password");
		}
		
		
	}



