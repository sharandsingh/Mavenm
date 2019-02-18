package com.facebook.TestCases;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.Qa.testbasedemo.TestBaseJava;
import com.facebook.pages.LoginPage;

public class LoginPageTest extends TestBaseJava {
	
	LoginPage loginPage;
	public LoginPageTest()
	{
		super();
	}

	@BeforeSuite
	public void setup()
	{
		intialization();
		loginPage = new LoginPage();
	}
	@Test
	public void verifyTitleTest()
	{
		String title = loginPage.verifyTitle();
		//Assert
	}
	
	@Test
	public void verifyLoginTest()
	{
		loginPage.verifyLogin();
	}
	
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}
	}

