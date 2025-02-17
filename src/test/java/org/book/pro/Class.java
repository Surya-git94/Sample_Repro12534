package org.book.pro;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class {

	
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://practice.expandtesting.com/dropdown");
		driver.manage().window().maximize();
		WebElement s = driver.findElement(By.id("country"));
		Select s2 =new  Select(s);
		List<WebElement> options = s2.getOptions();
        for (WebElement op: options) {
        	
System.out.println(op.getText());        	
        }		
        
        
        WebDriverWait wdw=new WebDriverWait(driver, Duration.ofMillis(2000));
        
        wdw.until(ExpectedConditions.visibilityOfAllElements(options));
        
		driver.quit();
		
		
	}

	
}
