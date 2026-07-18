package com.SeleniumWebDriverLocatorsWebDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IDNameXpath {

    WebDriver driver;
    String baseURL = "https://practicetestautomation.com/practice-test-login";

    @Test(priority=0)
    public void tMLocatorsDemo() {
        driver = new ChromeDriver();
        driver.navigate().to(baseURL);
        driver.manage().window().maximize();

        // Locator ID, Name and Xpath
        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.name("password")).sendKeys("Password123");
        driver.findElement(By.xpath("//button[@id='submit']")).click();
        
        String expectedValue="Logged In Successfully";
        String actualValue=driver.getTitle();
        if(actualValue.equals(expectedValue)) {
        	
        System.out.println("Passed");
        
    }else {
    	System.out.println("Failed");
    }
  
    	
    	
    	
    }
}
