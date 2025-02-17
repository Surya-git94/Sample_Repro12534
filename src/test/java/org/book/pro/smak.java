package org.book.pro;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.bouncycastle.jcajce.provider.symmetric.DES;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class smak {

	
	static WebDriver driver;
	

		
		
		
		public static void main() {
			
		System.setProperty("webdriver.driver.chrome","browserPath");	
			 driver=new ChromeDriver();

			
		}
		
		public static File snap() {
			// TODO Auto-generated method stub
			
TakesScreenshot tk=(TakesScreenshot)driver;

File src=tk.getScreenshotAs(OutputType.FILE);
File des=new File("ertyui");
//SimpleDateFormat("yyyyMMddHHMMSS")
try {
	FileUtils.copyFile(src, des);
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

			return des;
		}

public static void main(String[] args) throws InterruptedException {

Thread.sleep(5000);	

driver.findElement(By.xpath("dsd"));
}
		


}
