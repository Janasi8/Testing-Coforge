package com.Easycalulation.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AltoroLoginPage {

    WebDriver driver;

    public AltoroLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Username
    @FindBy(id = "uid")
    WebElement username;

    // Password
    @FindBy(id = "passw")
    WebElement password;

    // Login Button
    @FindBy(name = "btnSubmit")
    WebElement loginButton;

    public void login_Altoro(String uname, String pass) {

        username.sendKeys(uname);
        password.sendKeys(pass);
        loginButton.click();

    }
}