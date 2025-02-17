package org.book.pro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass2 {
	
	static WebDriver driver;	
	public static WebDriver selectbrowser(String BrowserName) {


		switch (BrowserName){
			case "chrome":
		 driver = new ChromeDriver();
			break;	
			
			case "edge":
				 driver = new ChromeDriver();
					break;
		}
		
		return driver;
		
	}
	

	public static WebElement findelemetElement (String loactorType,String value) {
		WebElement e = null;
		if (loactorType.equalsIgnoreCase("name")) {driver.findElement(By.name(value));}
		return e;
		
//		
//		driver.findElement(By.tagName(""));
//		driver.findElement(By.id(""));
//		driver.findElement(By.xpath(""));
	}

}
