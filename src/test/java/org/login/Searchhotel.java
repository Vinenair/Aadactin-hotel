package org.login;

import org.base.Basecl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchhotel extends Basecl{
	
	public Searchhotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="location")
	public  WebElement location;
	
	@FindBy(name="hotels")
	public  WebElement hotels;
	
	 
	@FindBy(name="room_type")
	public  WebElement Room;
	
	
	@FindBy(name="room_nos")
	public  WebElement NumberofRoom;
	
	@FindBy(name="adult_room")
	public  WebElement Adultroom;
	
	@FindBy(name="child_room")
	public  WebElement Childroom;
	
	public  WebElement getSubmit() {
		return submit;
	}

	@FindBy(xpath="(//input[@type='text'])[2]")
	public  WebElement Datein;
	
	@FindBy(name="datepick_out")
	public  WebElement Dateout;
	
	@FindBy(name="Submit")
	public  WebElement submit;
	
	
	
	
	
	public  WebElement getHotels() {
		return hotels;
	}


	public  WebElement getRoom() {
		return Room;
	}





	public  WebElement getNumberofRoom() {
		return NumberofRoom;
	}


	public  WebElement getAdultroom() {
		return Adultroom;
	}


	public  WebElement getChildroom() {
		return Childroom;
	}


	public  WebElement getDatein() {
		return Datein;
	}


	public  WebElement getDateout() {
		return Dateout;
	}

	
	public  WebElement getLocation() {
		return location;
	}

}
