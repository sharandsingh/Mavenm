package com.Qa.testbasedemo;


import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class TestBaseJava {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBaseJava()
	{
		try
		{
			FileInputStream ip = new FileInputStream("D:\\New folder\\account\\src\\main\\java\\com\\facebbok\\config.properties");
					prop = new Properties();
			prop.load(ip);
		}
		catch(Exception e)
		{
		System.out.println(e.getMessage());
		}
		}

	public static void intialization()
	{
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty(prop.getProperty("systemproperty_1"),prop.getProperty("systemproperty_2"));
			driver = new ChromeDriver();
		}
		//driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}
}
