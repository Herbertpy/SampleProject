package org.framework;

import java.awt.AWTException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;





public class TrialOne extends Base {
//	@BeforeClass
//		
//	public static void beforeClassExe() {
//		driverLaunch("https://adactinhotelapp.com/");
//		maximizeMethod();
//		implicitwait(30);
//
//	}
		
	@Test
	public void TestOne()  {
		WebElement UserName = findelementsById("username");
		sendKeysTxt(UserName, "Herbert8489");
		WebElement Password = findelementsById("password");
		sendKeysTxt(Password, "Sam8489752875");
		WebElement Login = findelementsById("login");
		click(Login);
		//Assertion
		WebElement confirmTxt = driver.findElement(By.xpath("//td[text()='Welcome to Adactin Group of Hotels']"));
		String text = confirmTxt.getText();
		System.out.println(text);
		//Assert.assertEquals("Login page success", "Welcome to Adactin Group", text);
		boolean contains = text.contains("im in chennai");
		System.out.println(contains);
		Assert.assertTrue("Login page success", contains);
		
		WebElement location = findelementsById("location");
		sendKeysTxt(location, "Sydney");
		
	}
	
	@Before
	public void beforeConfim() throws AWTException {
		driverLaunch("https://adactinhotelapp.com/");
		maximizeMethod();
		implicitwait(30);

	}
	
	@After
	public void afterConfim() throws InterruptedException {
		Thread.sleep(2500);
		quitDriver();
	}
}
	
	
	
	

	

	

