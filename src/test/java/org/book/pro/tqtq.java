package org.book.pro;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tqtq {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\surya\\eclipse-workspace\\Project FlipKart\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://practice.expandtesting.com/dynamic-table");
		List<WebElement> tablesize = driver.findElements(By.xpath("//tbody//tr"));

		int size = tablesize.size();

		for (int i = 1; i < size; i++) {

			WebElement element = driver.findElement(By.xpath("//tbody//tr[" + i + "]//td[1]"));
			System.out.println("no");
			String text = element.getText();
//			System.out.println(text);

			if (text.equalsIgnoreCase("Chrome")) {
				WebElement element2 = driver.findElement(
						By.xpath("//tbody//tr//td[text()='Chrome']//following-sibling::td[contains(text(),'%')]"));

				System.out.println(element2.getText());
			} else {
				System.out.println("no");
			}

//			if (condition) {
//				
//			}
		}

	}

}