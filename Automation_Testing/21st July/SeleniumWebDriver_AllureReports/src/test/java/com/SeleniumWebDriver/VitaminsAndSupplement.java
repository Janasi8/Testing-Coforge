package com.SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class VitaminsAndSupplement {
	public static void main(String[]args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.hollandandbarrett.com/shop/vitamins-supplements/vitamins/vitamin-drinks/");
		driver.manage().window().maximize();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {

		driver.findElement(By.id("onetrust-accept-btn-handler")).click();

		} catch (Exception e) {

			System.out.println("Cookie popup not displayed.");
		}



		driver.findElement(By.xpath("//div[@class='PLPTitleWidget-module_wrapper__AOqyC']")).click();
				driver.findElement(By.className("ProductCardImage-zodule_picture_QWY9P")).click();

		String BrowserTitle = driver.getCurrentUrl();

		System.out.println(BrowserTitle);

		driver.navigate().back();

		BrowserTitle = driver.getCurrentUrl();

		System.out.println(BrowserTitle);

		driver.navigate().refresh();

		BrowserTitle = driver.getCurrentUrl();

		System.out.println(BrowserTitle);
		driver.navigate().forward();

		BrowserTitle = driver.getCurrentUrl();

		System.out.println(BrowserTitle);
		
}
}
