package com.Easycalculation.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Helpers.BrowseFactory;
import com.Easycalulation.Pages.AltoroLoginPage;

public class ExecuteAltoroLogin {

    @Test
    public void CheckValidUser() {

        WebDriver driver = BrowseFactory.BrowserOptions(
                "chrome",
                "http://altoro.testfire.net/login.jsp");

        AltoroLoginPage loginPage =
                PageFactory.initElements(driver, AltoroLoginPage.class);

        loginPage.login_Altoro(
        		"9740673180", "raghubn@123");

    }

}