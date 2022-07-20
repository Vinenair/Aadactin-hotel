package org.login;

import org.base.Basecl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends Basecl {

	public SelectHotel() {
PageFactory.initElements(driver, this);

	}
	
	@FindBy(id="radiobutton_0")
	public  WebElement Radio;
	
	@FindBy(name="continue")
	public  WebElement Continue;

	public  WebElement getRadio() {
		return Radio;
	}

	public  WebElement getContinue() {
		return Continue;
	}
}
