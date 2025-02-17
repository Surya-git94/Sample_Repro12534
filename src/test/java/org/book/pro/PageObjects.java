package org.book.pro;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.This;

public class PageObjects extends BaseClass {
	
	public PageObjects() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "sa") 
	private WebElement textname;
	
@FindBys({@FindBy(xpath = "//div[text()='POCO M6 5G (Orion Blue, 64 GB)']"),
	@FindBy(id = "sa")})
private List<WebElement> textUser;

public List<WebElement> getTextUser() {
	return textUser;
}


}
