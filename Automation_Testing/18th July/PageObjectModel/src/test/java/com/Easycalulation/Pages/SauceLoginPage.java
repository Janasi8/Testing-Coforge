package com.Easycalulation.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SauceLoginPage {

    WebDriver driver;

    // Constructor
    public SauceLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Username
    @FindBy(id = "idToken1")
    WebElement username;

    // Password
    @FindBy(id = "idToken2")
    WebElement password;

    // Login Button
    @FindBy(id = "loginButton_0")
    WebElement loginButton;

    // Login Method
    public void login_SauceLabs(String uname, String pass) {

        username.sendKeys(uname);
        password.sendKeys(pass);
        loginButton.click();

    }

}