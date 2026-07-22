package com.Easycalulation.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PracticeLoginPage {

    WebDriver driver;

    public PracticeLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Username
    @FindBy(id = "username")
    WebElement username;

    // Password
    @FindBy(id = "password")
    WebElement password;

    // Submit Button
    @FindBy(id = "submit")
    WebElement submitButton;

    public void login_Practice(String uname, String pass) {

        username.sendKeys(uname);
        password.sendKeys(pass);
        submitButton.click();

    }
}