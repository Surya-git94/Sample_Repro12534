package org.book.pro;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TableHandelling {
	
	public static void main(String[]arg) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\surya\\eclipse-workspace\\Project FlipKart\\Drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://www.flipkart.com/mobiles/pr?sid=tyy,4io&otracker=categorytree");
			String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);
			String windowHandle = driver.getWindowHandle();
			WebElement element = driver.findElement(By.xpath("//div[text()='POCO X7 5G (Cosmic Silver, 128 GB)']"));
			element.click();
			
			
			
		Set<String>w1=driver.getWindowHandles();
		List<String> a=new ArrayList(w1);
		//driver.switchTo().window( a.get(1));
			
		for(String allid:w1) {
		if (!(windowHandle==allid)) {
				driver.switchTo().window(allid);
			}
		}
			
		@Nullable
		String currentUrl2 = driver.getCurrentUrl();
		System.out.println(currentUrl2);
		
		
}}
