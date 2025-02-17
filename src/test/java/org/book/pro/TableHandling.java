package org.book.pro;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import javax.lang.model.util.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableHandling {
@Test
	public static void main(String[] args) {

		// Setup WebDriver using WebDriverManager
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		// Maximize the browser window
		driver.manage().window().maximize();

		// Navigate to the desired URL
		driver.navigate().to("https://practice.expandtesting.com/dynamic-table");

		WebElement table = driver.findElement(By.tagName("table"));

		List<WebElement> numofROW = driver.findElements(By.xpath("//tbody//tr"));
		System.out.print(numofROW.size());

		for (int i = 1; i <= numofROW.size(); i++) {

			WebElement chrome = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[1]"));
			String text = chrome.getText();
			System.out.println(text);
			
			if (text.equalsIgnoreCase("Chrome")) {
				System.out.println("In side loop"+text);
				
				System.out.println(driver.findElement(By.xpath("//table/tbody/tr[*]//td[text()=\"Chrome\"]//following-sibling::td[contains(text(),\"%\")]")).getText());
				
				String element = driver.findElement(By.id("chrome-cpu")).getText();
				
				System.out.println(element+"finall");
				
				if (text.contains(element)) {
					
					
					System.out.print("Pass");
				}
				
				break;
			} else {

			}

		}

//		driver.close();
	}
}
