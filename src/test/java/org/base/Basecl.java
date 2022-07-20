package org.base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basecl {

	public static WebDriver driver;

	// Browser launch
	public static void Browserlaucnch(String Browser) {

		switch (Browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		default:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		}

	}

	// Windows maximize and Timeout
	public static  void windows() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	// URl launch
	public static  void URLlaunch(String url) {
		driver.get(url);
	}

	// Get url which we entered
	public static   String geturl() {
		String url = driver.getCurrentUrl();
		return url;
		
	}

	// Get title from the webpage
	public  String gettitle(String title) {
		driver.getTitle();
		return title;
	}

	public  void send(WebElement s, String value) {
		s.sendKeys(value);
	}

	public  void click(WebElement c) {
		c.click();
	}
	public   void clear(WebElement e) {
		 e.clear();

	}

	public  void close() {
		driver.close();
	}

	public static  void Quit() {
		driver.quit();
	}

	public  void action() {

		Actions a = new Actions(driver);
		a.contextClick().perform();
	}

	public  void actiontwoclick() {
		Actions b = new Actions(driver);
		b.doubleClick().perform();
	}

	public  void Graganddrop(WebElement from, WebElement to) {
		Actions b = new Actions(driver);
		b.dragAndDrop(from, to).perform();
	}

	public  void select(WebElement sl, int t) {
		Select s = new Select(sl);
		s.selectByIndex(t);
	}

	public  void selectvalue(WebElement ss, String value) {
		Select s = new Select(ss);
		s.selectByValue(value);
	}

	public void Time() throws InterruptedException {
		Thread.sleep(3000);
	}

	public static  void Takescreen() throws IOException {
		long ti = System.currentTimeMillis();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sk = ts.getScreenshotAs(OutputType.FILE);
		File f = new File("D:\\Screenshots\\" + ti + "\\Vineesh.png");
		FileUtils.copyFile(sk, f);
	}

	// Browser launch
	public  void navigator(String url) {
		driver.navigate().to(url);
	}

	public  void navigatorforward() {
		driver.navigate().forward();
	}

	public  void navigatorback() {
		driver.navigate().back();
	}

	//private void Date() {

	
	
	public  String gettext(WebElement e) {
String tx = e.getText();
return tx;

	}
}


