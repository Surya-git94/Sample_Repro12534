package org.book.pro;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class testdraganadrop extends BaseClass {
	@Test
	public static void sd() throws Throwable {

		BrowserName("Edge");
		launchURL("https://www.globalsqa.com/demo-site/draganddrop/");
		Thread.sleep(7000);
//		WebElement searchElement = searchElement("Xpath", "//img[@alt='The peaks of High Tatras']");
//		clk(searchElement);
//		snapShot();
		WebElement src = searchElement("Xpath", "//img[@alt='The peaks of High Tatras']");
		 clickandHole(src);
	  WebElement des= searchElement ("Xpath", "//span[text()='Trash']");
	 
	  dragandDrop(src, des);
		
	}
}
