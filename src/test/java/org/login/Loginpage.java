package org.login;

import org.base.Basecl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage extends Basecl {

	 public Loginpage() {
PageFactory .initElements(driver, this);

	}

@FindBy(xpath="//input[@type='text']")
	public  WebElement Username;

@FindBy(id="password")
public  WebElement Password;


@FindBy(id="login")
public  WebElement login;


public  WebElement getUsername() {
	return Username;
}


public  WebElement getPassword() {
	return Password;
}


public  WebElement getLogin() {
	return login;
}







}










