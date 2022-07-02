package com.Test;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.LoginPom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class Test_1 extends BaseClass {
	
	@Test
	public void verifyTest_1() {
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		Library.custom_SendKeys(login.getTxt_emaiid(), "Test");
		Library.custom_SendKeys(login.getTxt_password(), "12345678");
		
		Library.custom_click(login.getBtn_login());
		
		String actualtitle=driver.getTitle();
		String expectedtitle="Facebook – log in or sign up";
		// verify
		Assert.assertEquals(actualtitle, expectedtitle);
		
	}

	@Test
	public void verifyTest_2() {
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		Library.custom_SendKeys(login.getTxt_emaiid(), "Test");
		Library.custom_SendKeys(login.getTxt_password(), "12345678");
		
		Library.custom_click(login.getBtn_login());
	
		String actualtitle=driver.getTitle();
		String expectedtitle="Facebook – log in or sign up";
		// verify
		Assert.assertEquals(actualtitle, expectedtitle);
		
	}
}
