package Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.Loginobjects;

public class checkiLogin_page_title extends Commonoperations {
	
	
	@Test
	public void checklogin_lable()
	{
		//check Login page title
		
		PageFactory.initElements(driver, Loginobjects.class);
		String login_lable=Loginobjects.login_page_title.getText();
		Assert.assertEquals(login_lable,"User Management Login");
	}
	
	

}
