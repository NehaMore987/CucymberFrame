package utils;

import org.openqa.selenium.WebDriver;

public class TestBase {
	public WebDriver driver;
	
	public WebDriver WebDriverManager() {
		
		System.setProperty("");
		driver =new ChromeDriver();
		driver.get("google.com");
		return driver;
	}
	

}
