package org.framework;

import java.awt.AWTException;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class JunitDemo extends Base {

	// @BeforeClass -- Driver launch
	// @Before -- Screenshot
	// @Test -- Coding
	// @After -- Screenshot
	// @AfterClass -- Close Window

//	@BeforeClass
//	public static void BeforeClassExection() throws AWTException {
//		driverLaunch("https://adactinhotelapp.com/");
//		maximizeMethod();
//		implicitwait(30);

	

	@Test
	public void TestOne()  {
		WebElement UserName = findelementsById("username");
		sendKeysTxt(UserName, "Herbert8489");
		WebElement Password = findelementsById("password");
		sendKeysTxt(Password, "Sam8489752875");
		WebElement Login = findelementsById("login");
		click(Login);
	}
	
	@Test
	public void testTwo() {
		WebElement UserName = findelementsById("username");
		sendKeysTxt(UserName, "Herbert8489");
		WebElement Password = findelementsById("password");
		sendKeysTxt(Password, "Sam8489752875");
		WebElement Login = findelementsById("login");
		click(Login);

	}
	
	@Test
	public void testThree() {
		WebElement UserName = findelementsById("username");
		sendKeysTxt(UserName, "Herbert8489");
		WebElement Password = findelementsById("password");
		sendKeysTxt(Password, "Sam8489752875");
		WebElement Login = findelementsById("login");
		click(Login);

	}

	@Before
	public void BeforeLogin() throws AWTException {
		
			driverLaunch("https://adactinhotelapp.com/");
			maximizeMethod();
			implicitwait(30);
		}
	

	@After
	public void closeMethod() {
		quitDriver();

	}
	

//	@AfterClass
//	public static void AfterExection() {
//		// driver.quit();

	}


