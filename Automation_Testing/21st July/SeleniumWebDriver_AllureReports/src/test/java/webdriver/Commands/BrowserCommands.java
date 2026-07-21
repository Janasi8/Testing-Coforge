package webdriver.Commands;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrowserCommands {
	@Test(priority=0)
	public void ChromeBrowserTest() {
		ChromeDriver driver =  new ChromeDriver();
		driver.get("https://www.hollandandbarrett.com/");
		driver.manage().window().maximize();
		
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		String expectedTitle = "Holland & Barrett - UK's Leading Health & Wellbeing Store"; 
		
		String BrowserURL = driver.getCurrentUrl();
		System.out.println(BrowserURL);
		
		Assert.assertEquals(actualTitle, expectedTitle, "Chrome title verification failed!");
		
		driver.quit();
	}
	
	@Test(priority=2)
	public void FirefoxBrowserTest() {
		FirefoxDriver driver =  new FirefoxDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		String expectedTitle = "Selenium";
		
		String BrowserURL = driver.getCurrentUrl();
		System.out.println(BrowserURL);
		
		Assert.assertEquals(actualTitle, expectedTitle, "Firefox title verification failed!");
		
		driver.quit();
	}
	
	@Test(priority=1)
	public void EdgeBrowserTest() {
		EdgeDriver driver =  new EdgeDriver();
		driver.get("https://mvnrepository.com/");
		driver.manage().window().maximize();
		
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		String expectedTitle = "Maven Repository: Search/Browse/Explore";
		
		String BrowserURL = driver.getCurrentUrl();
		System.out.println(BrowserURL);
		
		Assert.assertEquals(actualTitle, expectedTitle, "Edge title verification failed!");
		
		driver.quit();
	}
}
	
