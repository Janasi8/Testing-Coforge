package com.Easycalculation.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Helpers.BrowseFactory;
import com.Easycalulation.Pages.NopCommerceLoginPage;

public class ExecuteNopCommerceLogin {

    @Test
    public void CheckValidUser() {

        WebDriver driver = BrowseFactory.BrowserOptions(
                "chrome",
                "https://www.nopcommerce.com/en/login");

        NopCommerceLoginPage loginPage =
                PageFactory.initElements(driver, NopCommerceLoginPage.class);

        loginPage.login_NopCommerce(
                "your_username",
                "your_password");
    }
}