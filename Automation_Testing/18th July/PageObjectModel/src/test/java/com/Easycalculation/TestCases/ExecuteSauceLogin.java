package com.Easycalculation.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Easycalulation.Pages.SauceLoginPage;

import Helpers.BrowseFactory;

public class ExecuteSauceLogin {

    @Test
    public void CheckValidUser() {

        WebDriver driver = BrowseFactory.BrowserOptions(
                "chrome",
                "https://accounts.saucelabs.com/am/XUI/#login/");

        SauceLoginPage loginPage =
                PageFactory.initElements(driver, SauceLoginPage.class);

        loginPage.login_SauceLabs("9740673180", "raghubn@123");

    }
}