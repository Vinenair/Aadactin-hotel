package Testing;
import java.io.IOException;
import java.util.Date;
import org.base.Basecl;
import org.login.AddressDetails;
import org.login.Loginpage;
import org.login.Searchhotel;
import org.login.SelectHotel;
import org.openqa.selenium.devtools.v85.page.Page.GetAppManifestResponse;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class Testing extends Basecl {
	@BeforeClass
	public static void beforeclass1() {
		Basecl.Browserlaucnch("Chrome");
		URLlaunch("http://adactinhotelapp.com");
		
		Assert.assertTrue(geturl().contains("adactinhotel"));
		windows();
	}
	@BeforeMethod
	public void datebefore() {
		Date d = new Date();
		System.out.println(d);
	}
	@Parameters({"user","password"})
	@Test
	public void before(String name, String pass) throws IOException {
		Loginpage li = new Loginpage();
		send(li.getUsername(), name);
		send(li.getPassword(), pass);
		click(li.getLogin());
		Searchhotel h = new Searchhotel();
		select(h.getLocation(), 3);
		selectvalue(h.getHotels(), "Hotel Sunshine");
		select(h.getRoom(), 2);
		select(h.getNumberofRoom(), 3);
		h.click(h.getDatein());
		h.clear(h.getDatein());
		send(h.getDatein(), "05/07/2022");
		h.click(h.getDateout());
		h.clear(h.getDateout());
		send(h.getDateout(), "15/07/2022");
		select(h.getAdultroom(), 1);
		select(h.getChildroom(), 2);
		h.click(h.getSubmit());
		SelectHotel sl = new SelectHotel();
		click(sl.getRadio());
		click(sl.getContinue());
		AddressDetails ad = new AddressDetails();
		send(ad.getFirstname(), "Robert");
		send(ad.getLastname(), "Bob");
		send(ad.getBillingaddress(), "845 southshower Road, new Jesery");
		send(ad.getCreditcard(), "4567 8241 1527 6598");
		select(ad.getCreditCardType(), 3);
		select(ad.getExpirydate(), 5);
		selectvalue(ad.getExpiryyear(), "2022");
		send(ad.getCVV(), "543");
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

