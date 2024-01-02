package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utils.TestContextSetUp;

public class LandingPageStepDefination {
	public TestContextSetUp testContextSetUp;
	public WebDriver driver;
	public String offerPageProductName;
	public String productName;
	public String landingPageproductName;
	
	
	public LandingPageStepDefination(TestContextSetUp testContextSetUp) {
		this.testContextSetUp=testContextSetUp;
	}
	
	@Given("User is on GreenCart Landing page")
	public void user_is_on_green_cart_landing_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\000T13744\\Downloads\\chromedriver-win32 (4)\\chromedriver-win32");
		testContextSetUp.driver =new ChromeDriver();
		testContextSetUp.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	    
	}
	@When("User search with shortname {string} and extracted actual home of product")
	public void user_search_with_shortname_and_extracted_actual_home_of_product(String shortName) throws InterruptedException {
		LandingPage new=landingPage(testContextSetUp.driver);
		landingPage.search(shortName);
		
		//testContextSetUp.driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortName);
		Thread.sleep(2000);
		String landingPageproductName = driver.findElement(By.cssSelector("h4.product-name")).getText();
		System.out.print(productName + "is expanded");
	    
	}

}
