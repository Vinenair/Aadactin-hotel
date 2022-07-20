package Testing;

import java.io.IOException;
import java.util.Date;

import org.base.Basecl;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testing2 extends Basecl{
	
	@BeforeClass
	public static void beforeclass1() {
		Basecl.Browserlaucnch("chrome");
		URLlaunch("http://adactinhotelapp.com");
		windows();
	}
	@BeforeMethod
	public void datebefore() {
		Date d = new Date();
		System.out.println(d);
	}
	@Parameters({"User" ,"Password"})
	@Test
	public void before() throws IOException {
		Loginpage li = new Loginpage();
		send(li.getUsername(), "Robertra");
		//Assert.assertEquals(li.getUsername(), "Robertra");
		send(li.getPassword(), "146WE6");
		click(li.getLogin());	
		Searchhotel h = new Searchhotel();
		select(h.getLocation(), 2);
		selectvalue(h.getHotels(), "Hotel Creek");
		select(h.getRoom(), 1);
		select(h.getNumberofRoom(), 2);
		h.click(h.getDatein());
		h.clear(h.getDatein());
		send(h.getDatein(), "13/07/2022");
		h.click(h.getDateout());
		h.clear(h.getDateout());
		send(h.getDateout(), "17/07/2022");
		select(h.getAdultroom(), 2);
		select(h.getChildroom(), 2);
		h.click(h.getSubmit());
		SelectHotel sl = new SelectHotel();
		click(sl.getRadio());
		click(sl.getContinue());
		AddressDetails ad = new AddressDetails();
		send(ad.getFirstname(), "Robert");
		send(ad.getLastname(), "Bob");
		send(ad.getBillingaddress(), "975 sam Road, new Jesery");
		send(ad.getCreditcard(), "4567 8241 9854 2564");
		select(ad.getCreditCardType(), 3);
		select(ad.getExpirydate(), 5);
		selectvalue(ad.getExpiryyear(), "2022");
		send(ad.getCVV(), "513");
		Takescreen();
		ad.click(ad.getBooknow());		
	}
	@AfterMethod
	public void dateafter() {
		Date d = new Date();
		System.out.println(d);
	}
	@AfterClass
	public static void afterclass() {
		Quit();
	}

}
