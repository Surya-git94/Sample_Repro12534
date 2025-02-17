package org.book.pro;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Flipkartcheck2windo extends BaseClass {
	@Parameters({"username","pass"})
	@Test
	public static void sd(String username, String pass) throws Throwable {

		BrowserName("Edge");
		launchURL(
				"https://www.flipkart.com/tyy/4io/~cs-dqz7spslkw/pr?sid=tyy,4io&collection-tab-name=POCO+M6+5G+&param=2343&otracker=CLP_BannerX3&fm=organic&ppt=hp&ppn=homepage&ssid=yc490shk1s0000001730533003107");
		Thread.sleep(599);
		Assert.assertTrue(driver.getCurrentUrl().equals("https:q//www.flipkart.com/tyy/4io/~cs-dqz7spslkw/pr?sid=tyy,4io&collection-tab-name=POCO+M6+5G+&param=2343&otracker=CLP_BannerX3&fm=organic&ppt=hp&ppn=homepage&ssid=yc490shk1s0000001730533003107"));
		WebElement searchElement = searchElement("Xpath", "//div[text()='POCO M6 5G (Orion Blue, 64 GB)']");
		clk(searchElement);
		snapShot();
		WindowHandel(1);
		
		WebElement explisitwaits = explisitwaits("//button[text()='Buy Now']");
		explisitwaits.click();
		
		
//		clk(newphone);

	}

}
