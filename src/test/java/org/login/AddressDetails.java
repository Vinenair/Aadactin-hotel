package org.login;

import org.base.Basecl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressDetails extends Basecl {

	public AddressDetails() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="first_name")
	public  WebElement Firstname;
	
	@FindBy(name="last_name")
	public  WebElement Lastname;
	
	@FindBy(name="address")
	public  WebElement Billingaddress;
	
	@FindBy(name="cc_num")
	public  WebElement Creditcard;
	
	@FindBy(name="cc_type")
	public  WebElement CreditCardType;
	
	@FindBy(id="cc_exp_month")
	public  WebElement Expirydate; 
	
	@FindBy(name="cc_exp_year")
	public  WebElement Expiryyear;
	
	@FindBy(name="cc_cvv")
	public  WebElement CVV;
	
	@FindBy(name="book_now")
	public  WebElement Booknow;

	public  WebElement getFirstname() {
		return Firstname;
	}

	public  WebElement getLastname() {
		return Lastname;
	}

	public  WebElement getBillingaddress() {
		return Billingaddress;
	}

	public  WebElement getCreditcard() {
		return Creditcard;
	}

	public  WebElement getCreditCardType() {
		return CreditCardType;
	}

	public  WebElement getExpirydate() {
		return Expirydate;
	}

	public  WebElement getExpiryyear() {
		return Expiryyear;
	}

	public  WebElement getCVV() {
		return CVV;
	}

	public  WebElement getBooknow() {
		return Booknow;
	}
	
}
