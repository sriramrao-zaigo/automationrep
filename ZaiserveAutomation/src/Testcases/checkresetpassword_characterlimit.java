package Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.Loginobjects;
import PageObjects.Resetpassword;

public class checkresetpassword_characterlimit extends Commonoperations

{
	
	@Test
	public void checkcharacterlimit()
	{
		//check confirm password field exist
		
		PageFactory.initElements(driver, Resetpassword.class);
		Resetpassword.password.sendKeys("co");
		Resetpassword.confirm_password.sendKeys("co");
		Resetpassword.reset.click();
		String user_text=Loginobjects.password.getText();
		Assert.assertEquals(user_text,"Enter Minimum 6 characters." );
		
	}
	
	
}