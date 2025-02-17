package org.book.pro;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriverLogLevel;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	static WebDriver driver;

	
	

	public static WebDriver BrowserName(String BrowserName) {

		switch (BrowserName) {
		case "Chrome":

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

			break;
		case "Edge":

			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("Invalid Broswer name");
			break;
		}
		return driver;
	}

	public static void launchURL(String enterURL) {
		driver.get(enterURL);

	}

	public static void quitBrowser() {
		driver.quit();
	}

	public static WebElement searchElement(String locatorType, String value) {
		WebElement e = null;
		if (locatorType.equalsIgnoreCase("Xpath")) {
			e=driver.findElement(By.xpath(value));
		} else if (locatorType == "id") {
			e=driver.findElement(By.id(value));
		} else if (locatorType == "byName") {
			e=driver.findElement(By.name(value));
		} else {
			System.out.println("incoorect locator type");
		}
		return e;
	}
	
	public static WebElement searchMultipleElement(String locatorType, String value,int num) {
		WebElement e = null;
		if (locatorType.equalsIgnoreCase("Xpath")) {
			e=driver.findElements(By.xpath(value)).get(num);
		} else if (locatorType == "id") {
			e=driver.findElements(By.id(value)).get(num);
		} else if (locatorType == "byName") {
			e=driver.findElements(By.name(value)).get(num);
		} else {
			System.out.println("incoorect locator type");
		}
		return e;
	}


	public static void clk(WebElement e) {
		e.click();
	}
	
	public static void enterText(WebElement e, String enterText) {
		e.sendKeys(enterText);
		
	}
	
	public static void snapShot() throws IOException {
		
		TakesScreenshot ts= (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des= new File("C:\\Users\\surya\\eclipse-workspace\\Project FlipKart\\pics\\tom.png");
		FileUtils.copyFile(src, des);
		
		
	}
	
	public static WebElement clickandHole(WebElement point) {
		WebElement e= null;
		Actions a =new Actions(driver);
		a.clickAndHold();
		return e;
		
	}
	
	public static WebElement dragandDrop(WebElement src, WebElement des) {
		WebElement e= null;
		Actions a =new Actions(driver);
		a.dragAndDrop(src, des).perform();;
return e;
	}
	
public static void WindowHandel(int inxdex) {
		
		String windowHandle = driver.getWindowHandle();
	
		System.out.println(windowHandle.toString());
		  Set<String> windowHandles = driver.getWindowHandles();
		  List<String> l= new ArrayList<String>(windowHandles);
		 driver.switchTo().window(l.get(inxdex));
		
	}

public static WebElement explisitwaits(String passElement){
	WebElement e= null;
		
	  WebDriverWait webDriverWait =new WebDriverWait(driver, Duration.ofSeconds(30, 20));
	  e = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(passElement)));
	  
	   return e;
	
	
}

public static void FluentWait(int sec,int sec2) {
	FluentWait<WebDriver> f =new FluentWait<WebDriver>(driver)
	.withTimeout(Duration.ofSeconds(sec))
	.pollingEvery(Duration.ofSeconds(sec2))
	.ignoring(Throwable.class);
	
	f.until(ExpectedConditions.elementToBeClickable(By.className("sa")));
}

	public static WebDriver hardassertion() {
assert.assertTrue(driver.getCurrentUrl().equals("edqweq"));
	}
}
