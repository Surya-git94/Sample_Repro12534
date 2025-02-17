package org.book.pro;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicTableHandelling {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.navigate().to("https://cosmocode.io/automation-practice-webtable/");

		WebElement table = driver.findElement(By.tagName("table"));
		
		WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td[1]"));
		
	element.click();
	
	boolean enabled = element.isEnabled();
	
	System.out.println(!enabled);

		
	}

}
