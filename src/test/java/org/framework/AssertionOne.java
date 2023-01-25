package org.framework;


import java.awt.AWTException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class AssertionOne extends Base {

	// Assertion

//	@BeforeClass
//	public static void executionStageOne() throws AWTException {
//		driverLaunch("https://adactinhotelapp.com/");
//		maximizeMethod();
//		implicitwait(30);
//
//	}

	
	@Test
	public void TestOne() {
		WebElement userName = findelementsById("username");
		sendKeysTxt(userName, "Herbert8489");
		WebElement passWord = findelementsById("password");
		sendKeysTxt(passWord, "Sam8489752875");
		WebElement logBtn = findelementsById("login");
		click(logBtn);
		WebElement text = driver.findElement(By.xpath("//td[text()='Welcome to Adactin Group of Hotels']"));
		String text2 = text.getText();
		System.out.println(text2);
		boolean contains = text2.contains("Welcome to Adactin");
		System.out.println(contains);
		// Assert introduction
		Assert.assertEquals("LoginPass", "Welcome to Adactin Group of Hotels", text2);
		//Assert.assertTrue("LoginPass", contains);

		WebElement location = driver.findElement(By.name("location"));
		location.sendKeys("Melbourne");
	}
	@Ignore
	@Test
	public void TestTwo() {
		WebElement userName = findelementsById("username");
		sendKeysTxt(userName, "Herbert8489");
		WebElement passWord = findelementsById("password");
		sendKeysTxt(passWord, "Sam8489752875");
		WebElement logBtn = findelementsById("login");
		click(logBtn);
		WebElement text = driver.findElement(By.xpath("//td[text()='Welcome to Adactin Group of Hotels']"));
		String text2 = text.getText();
		System.out.println(text2);
		boolean contains = text2.contains("Welcome to Adactin");
		System.out.println(contains);
		// Assert introduction
		//Assert.assertEquals("LoginPass", text2, contains);
		Assert.assertTrue("LoginPass", contains);

		WebElement location = driver.findElement(By.name("location"));
		location.sendKeys("Melbourne");

	}
	
	@Before
	public void executionStageTwo() throws AWTException {
		driverLaunch("https://adactinhotelapp.com/");
		maximizeMethod();
		implicitwait(30);
		
	}
	
	@After
	public void screeShotOne() throws InterruptedException {
		Thread.sleep(2500);
		quitDriver();

	}
//	@AfterClass
//	public static void browserClose() throws InterruptedException {
//		Thread.sleep(2500);
//		quitDriver();
//		
//	}
	

}
