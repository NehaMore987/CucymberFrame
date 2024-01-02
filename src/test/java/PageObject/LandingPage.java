package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	
	WebDriver driver;
	
	By search =By.xpath("//input[@type='search']");
	By productName=By.cssSelector("h4.product-name");
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void searchItem(String name) {
		driver.findElement(search).sendKeys(name);
	}

}
