package org.book.pro;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class flipkartcheck extends BaseClass {
	@Test
	public static void sd() throws Throwable {

		BrowserName("Edge");
		launchURL("https://www.flipkart.com/tyy/4io/~cs-dqz7spslkw/pr?sid=tyy,4io&collection-tab-name=POCO+M6+5G+&param=2343&otracker=CLP_BannerX3&fm=organic&ppt=hp&ppn=homepage&ssid=yc490shk1s0000001730533003107");
		Thread.sleep(599);
		WebElement searchElement = searchElement("Xpath", "//span[text()='Electronics']");
		clk(searchElement);
		snapShot();
		WebElement src = searchElement("Xpath", "//img[@alt='Mobiles']");
//		 clickandHole(src);
	  WebElement des= searchElement ("Xpath", "//input[@placeholder='Search for Products, Brands and More']");
	 
	  dragandDrop(src, des);
	
		
	}

}
