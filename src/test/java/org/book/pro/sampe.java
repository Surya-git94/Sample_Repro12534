package org.book.pro;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sampe {
	public static void main(String[] args) {

		// Setup WebDriver using WebDriverManager
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		// Maximize the browser window
		driver.manage().window().maximize();

		// Navigate to the desired URL
		driver.get("https://practice.expandtesting.com/dynamic-table");

		WebElement table = driver.findElement(By.tagName("table"));
		
		WebElement chrome = driver.findElement(By.xpath("//table/tbody/child::tr//td[text()=\"Chrome\"]"));
		
		
		List<WebElement> broswerlist = driver.findElements(By.xpath("//table/tbody/child::tr"));
		
		for (int i = 1; i < broswerlist.size(); i++) {
			
			WebElement broswerlists = driver.findElement(By.xpath("//table/tbody/child::tr["+i+"]"));
			if(broswerlist==chrome) {
				
				System.out.println("Hi");
				
				
			}
		}

	
	}
}
