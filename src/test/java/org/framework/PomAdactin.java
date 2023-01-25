package org.framework;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomAdactin extends Base {

	public PomAdactin() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement username;
	@FindBy(id = "password")
	private WebElement password;
	@FindBy(id = "login")
	
	private WebElement login;
	@FindBy(id = "location")
	private WebElement location;
	@FindBy(id = "hotels")
	private WebElement hotels;
	@FindBy(id = "room_type")
	private WebElement roomtype;
	@FindBy(id = "room_nos")
	private WebElement roomnos;
	@FindBy(id = "adult_room")
	private WebElement adultroom;
	@FindBy(id = "child_room")
	private WebElement childroom;
	@FindBy(id = "Submit")
	private WebElement Submit;
	@FindBy(id = "radiobutton_0")
	private WebElement radiobutton0;
	@FindBy(id = "continue")
	private WebElement contine;
	@FindBy(id = "first_name")
	private WebElement firstname;
	@FindBy(id = "last_name")
	private WebElement lastname;
	@FindBy(id = "address")
	private WebElement address;
	@FindBy(id = "cc_num")
	private WebElement ccnum;
	@FindBy(id = "cc_type")
	private WebElement cctype;
	@FindBy(id = "cc_exp_month")
	private WebElement ccexpmonth;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomnos() {
		return roomnos;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getSubmit() {
		return Submit;
	}

	public WebElement getRadiobutton0() {
		return radiobutton0;
	}

	public WebElement getContine() {
		return contine;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcnum() {
		return ccnum;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getCcexpmonth() {
		return ccexpmonth;
	}

	

	Base base = new Base();

	public void loginAdactin() throws IOException, InterruptedException {

		String name = getData("Adactin", 1, 0);
		sendKeysTxt(getUsername(), name);
		String password = getData("Adactin", 1, 1);
		sendKeysTxt(getPassword(), password);
		click(login);
		String location = getData("Adactin", 1, 2);
		sendKeysTxt(getLocation(), location);
		String hotels = getData("Adactin", 1, 3);
		sendKeysTxt(getHotels(), hotels);
		String roomType = getData("Adactin", 1, 4);
		sendKeysTxt(getRoomtype(), roomType);
//		String location = getData("Adactin", 1, 2);
//		String location = getData("Adactin", 1, 2);
//		String location = getData("Adactin", 1, 2);
//		String location = getData("Adactin", 1, 2);
//		String location = getData("Adactin", 1, 2);
//		String location = getData("Adactin", 1, 2);
//		String location = getData("Adactin", 1, 2);
//		String location = getData("Adactin", 1, 2);
//		String location = getData("Adactin", 1, 2);
//		String location = getData("Adactin", 1, 2);

	}

}
