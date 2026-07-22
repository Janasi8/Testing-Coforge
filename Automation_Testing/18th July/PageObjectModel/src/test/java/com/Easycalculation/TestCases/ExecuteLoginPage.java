package com.Easycalculation.TestCases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Easycalulation.Pages.LoginEasyCal;

import Helpers.BrowseFactory;
public class ExecuteLoginPage {
@Test
public void CheckValidUser() {
	WebDriver driver= BrowseFactory.BrowserOptions("chrome","https://www.login.hiox.com/login?referrer=easycalculation.com");
	 LoginEasyCal loginPageEasyCal =
             PageFactory.initElements(driver, LoginEasyCal.class);

     loginPageEasyCal.login_EasyCal("9740673180", "raghubn@123");
}

}
