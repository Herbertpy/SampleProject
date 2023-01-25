package org.framework;

import java.awt.AWTException;
import java.io.IOException;

import com.github.dockerjava.api.model.Driver;

public class PomExecution extends Base {

	public static void main(String[] args) throws AWTException, IOException, InterruptedException {
		driverLaunch("https://adactinhotelapp.com/");
		maximizeMethod();
		implicitwait(30);
		PomAdactin f = new PomAdactin();
		f.loginAdactin();
//		Refresh();
//		f.loginAdactin();
		
		
		
	}
}
