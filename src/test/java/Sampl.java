import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sampl {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30000));
		driver.manage().window().maximize();
		driver.get("https://practice.expandtesting.com/dynamic-table");

		WebElement Table = driver.findElement(By.tagName("table"));
		List<WebElement> elements = Table.findElements(By.tagName("tr"));
		List<WebElement> elements2 = driver.findElements(By.xpath("//tbody/tr//td[1]"));
		

		int size = elements.size();
		System.out.println(size);

//		for (WebElement e : elements) {
//			System.out.println(e.getText());
//
//		}
//		
		for(int i=1; i<=elements2.size()-1;i++) {
			WebElement elements3 = driver.findElement(By.xpath("//tbody/tr["+i+"]//td[1]"));
			String text = elements3.getText();
			if (text.equalsIgnoreCase("Chrome")) {
				String text2 = driver.findElement(By.xpath("//tbody/tr[*]//td[1]//following-sibling::td[contains(text(),\"%\")]")).getText();
				System.out.println(text2);
				String text3 = driver.findElement(By.id("chrome-cpu")).getText();
			if (text3.contains(text)) {
				System.out.println("done");
			}else {
				
				System.out.println("sssssssssss");
			}
			break;
			}
		}

	}
}
