package org.book.pro;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Durations;
import io.github.bonigarcia.wdm.WebDriverManager;

public class praqtise {
	
	private static WebElement element2;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
		
		WebElement element = driver.findElement(By.tagName("table"));
//		System.out.println(element.getText());
	List<WebElement>	element2 = element.findElements(By.tagName("th"));
	List<WebElement>	element3 = element.findElements(By.tagName("tr"));
	
	for(int i=1;i<element2.size();i++) {
		
		System.out.print(element2.get(i).getText());
		System.out.print("  ");
	}
	
	System.out.println();
for(int i=1;i<element3.size();i++) {
		
		System.out.print(element3.get(i).getText());
		System.out.print("  ");
	System.out.println();
	}
	
		
		
		driver.close();
		
		
	}

}
