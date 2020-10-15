package AddDepartment;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonuntions.Commonoperations;
import PageObjects.Adddepartmentobjects;
import PageObjects.Loginobjects;
import PageObjects.Resetpassword;

public class  CheckDepartmentName_Empty extends Commonoperations

{
	
	@Test
	public void checkcharacterinpassword()
	{
		//check characters entered in the password field
		
		PageFactory.initElements(driver, Adddepartmentobjects.class);
		Adddepartmentobjects.Add_department.click();
		Adddepartmentobjects.department_name.sendKeys("");
		Adddepartmentobjects.dep_popup_add.click();
		String text_user=Adddepartmentobjects.name_err.getText();
		
	
		Assert.assertEquals(text_user,"Enter the department name" );
		
	}
	
}