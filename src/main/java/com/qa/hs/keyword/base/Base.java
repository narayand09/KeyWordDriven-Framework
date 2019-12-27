package com.qa.hs.keyword.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {

	public WebDriver driver;
	public Properties prop;
	
	public WebDriver init_driver(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium3.4\\chromedriver.exe");
			
			if(prop.getProperty("headless").equals("yes"))
			{
				ChromeOptions options=new ChromeOptions();
				options.addArguments("--headless");
				driver=new ChromeDriver(options);	
			}
			else
			{
				driver=new ChromeDriver();
			}
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			return driver;
			
	}
	
	public Properties init_properties()
	{
		prop=new Properties();
		try {
		FileInputStream fis=new FileInputStream("D:\\Java_2019\\KeywordHubSpot\\src\\main\\java\\com\\qa\\hs\\keyword\\config.properties");
		prop.load(fis);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return prop;
		
	}
}
