package Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.Loginobjects;

public class checkwithnumalphabetsspecialcharacters extends Commonoperations {
	
	
	
	@Test
	public void checkuseridfield()
	{
		//check with number alphabets special characters
		
		PageFactory.initElements(driver, Loginobjects.class);
		Loginobjects.userName.sendKeys("hello1993@zaiserve.com");
		Loginobjects.login_btn.click();
		String user_text=Loginobjects.email_err.getText();
		Assert.assertEquals(user_text,"hello1993@zaiserve.com");
	}
	
	

}



