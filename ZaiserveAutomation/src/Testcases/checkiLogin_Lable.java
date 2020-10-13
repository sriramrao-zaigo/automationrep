package Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.Loginobjects;

public class checkiLogin_Lable extends Commonoperations {
	
	
	@Test
	public void checklogin_lable()
	{
		//check Login lable
		
		PageFactory.initElements(driver, Loginobjects.class);
		String login_lable=Loginobjects.login.getText();
		Assert.assertEquals(login_lable,"Enter a valid e-mail address");
	}
	
	

}
