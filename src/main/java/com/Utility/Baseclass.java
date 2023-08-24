package com.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static WebDriver driver;
	
	@BeforeMethod
	public void SetUp() {
		WebDriverManager.edgedriver().setup();
	    WebDriver driver=new EdgeDriver();
	    driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void teardown() {
		driver.close();
	}

}
