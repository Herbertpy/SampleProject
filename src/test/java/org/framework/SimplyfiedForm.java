package org.framework;

import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SimplyfiedForm {
	public static void main(String[] args) throws IOException, AWTException {
		Base base = new Base();
		base.driverLaunch("https://adactinhotelapp.com/");

		base.maximizeMethod();
		base.implicitwait(30);
		WebElement username = base.findelementsById("username");
		String name = base.getData("SheetOne", 0, 3);
		base.sendKeysTxt(username, name);
		
		
		
		
		
	}

}
