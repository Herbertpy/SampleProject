package org.framework;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebElement;

public class BaseAdactin {
	public static void main(String[] args) throws AWTException, IOException {
		Base base = new Base();
		base.driverLaunch("https://adactinhotelapp.com/");
		
		base.maximizeMethod();
		base.implicitwait(30);
		WebElement userName = base.findelementsById("username");
		String data1 = base.getData("Adactin", 1, 0);
		base.sendKeysTxt(userName, data1);
		WebElement passWord = base.findelementsById("password");
		String data2 = base.getData("Adactin", 1, 1);
		base.sendKeysTxt(passWord, data2);
		WebElement login = base.findelementsById("login");
		base.click(login);
		
		WebElement location = base.findelementsById("location");
		String data3 = base.getData("Adactin", 1, 2);
		base.sendKeysTxt(location, data3);
		
		WebElement hotel = base.findelementsById("hotels");
		String data4 = base.getData("Adactin", 1, 3);
		base.sendKeysTxt(hotel, data4);
		
		WebElement roomType = base.findelementsById("room_type");
		String data5 = base.getData("Adactin", 1, 4);
		base.sendKeysTxt(roomType, data5);
		
		WebElement roomNos = base.findelementsById("room_nos");
		String data6 = base.getData("Adactin", 1, 5);
		base.sendKeysTxt(roomNos, data6);
	
		WebElement adultroom = base.findelementsById("adult_room");
		String data8 = base.getData("Adactin", 1, 8);
		base.sendKeysTxt(adultroom, data8);
		
		WebElement childroom = base.findelementsById("child_room");
		String data9 = base.getData("Adactin", 1, 9);
		base.sendKeysTxt(childroom, data9);
		
		WebElement submit = base.findelementsById("Submit");
		base.click(submit);
		
		WebElement radiobutton = base.findelementsById("radiobutton_0");
		base.click(radiobutton);
		
		WebElement continuebtn = base.findelementsById("continue");
		base.click(continuebtn); 
		
		WebElement firstname = base.findelementsById("first_name");
		String data10 = base.getData("Adactin", 4, 0);
		base.sendKeysTxt(firstname, data10);
		
		WebElement lastname = base.findelementsById("last_name");
		String data11 = base.getData("Adactin", 4, 1);
		base.sendKeysTxt(lastname, data11);
		
		WebElement addressspace = base.findelementsById("address");
		String data12 = base.getData("Adactin", 4, 2);
		base.sendKeysTxt(addressspace, data12);
		
		WebElement ccnum = base.findelementsById("cc_num");
//		String data13 = base.getData("Adactin", 4, 3);
//		base.sendKeysTxt(ccnum, data13); 
		
		WebElement cctype = base.findelementsById("cc_type");
		String data14 = base.getData("Adactin", 4, 4);
		base.sendKeysTxt(cctype, data14);
		
		WebElement ccexpmonth = base.findelementsById("cc_exp_month");
		String data15 = base.getData("Adactin", 4, 5);
		base.sendKeysTxt(ccexpmonth, data15);
		
		WebElement ccexpyear = base.findelementsById("cc_exp_year");
		String data16 = base.getData("Adactin", 4, 6);
		base.sendKeysTxt(ccexpyear, data16);
		
		WebElement cccvv = base.findelementsById("cc_cvv");
		String data18 = base.getData("Adactin", 4, 7);
		base.sendKeysTxt(cccvv, data18); 
		
		
	}

}
