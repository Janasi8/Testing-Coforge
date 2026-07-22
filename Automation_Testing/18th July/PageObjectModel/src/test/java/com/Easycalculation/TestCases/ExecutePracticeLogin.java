package com.Easycalculation.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Helpers.BrowseFactory;
import com.Easycalulation.Pages.PracticeLoginPage;

public class ExecutePracticeLogin {

    @Test
    public void CheckValidUser() {

        WebDriver driver = BrowseFactory.BrowserOptions(
                "chrome",
                "https://practicetestautomation.com/practice-test-login/");

        PracticeLoginPage loginPage =
                PageFactory.initElements(driver, PracticeLoginPage.class);

        loginPage.login_Practice(
                "student",
                "Password123");

    }

}