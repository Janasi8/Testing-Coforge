package com.Easycalulation.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NopCommerceLoginPage {

    WebDriver driver;

    public NopCommerceLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Username
    @FindBy(id = "Username")
    WebElement username;

    // Password
    @FindBy(id = "Password")
    WebElement password;

    // Remember Me
    @FindBy(id = "RememberMe")
    WebElement rememberMe;

    // Login Button
    @FindBy(xpath = "//input[@value='Log in']")
    WebElement loginButton;

    public void login_NopCommerce(String uname, String pass) {

        username.sendKeys(uname);
        password.sendKeys(pass);

        if (!rememberMe.isSelected()) {
            rememberMe.click();
        }

        loginButton.click();
    }
}