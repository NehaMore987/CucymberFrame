package StepDefinition;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import utils.TestContextSetUp;

public class OfferPageStepDefination {
	public TestContextSetUp textContextSetUp;
	public String offerPageProductName;
	
	
	public OfferPageStepDefination(TestContextSetUp textContextSetUp) {
		this.textContextSetUp=textContextSetUp;
	}
	
	
	@Then("User searched for shortname {string} shorname is offers page to check is product exist with same name")
	public void user_searched_foe_some_shorname_is_offers_page_to_check_is_product_exist(String shortName) {
		
		switchToOfferPage();
		OfferPage offerPage=new OfferPage();
		textContextSetUp.driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortName);
		String offerPageProductName=textContextSetUp.driver.findElement(By.cssSelector("tr td:nth-child(1)")).getText();    
	}
	public void switchToOfferPage() {
		textContextSetUp.driver.findElement(By.linkText("Top Deals")).click();
		Set<String> s=textContextSetUp.driver.getWindowHandles();
		Iterator<String> i1=s.iterator();
		String parentWindow=i1.next();
		String childWindow=i1.next();
		
		textContextSetUp.driver.switchTo().window(childWindow);
		
	}
	@Then("validate product name in offeres matches with Landing page")
	public void validatie_product_in_offers() {
		Assert.assertEquals(offerPageProductName, textContextSetUp.landingPageproductName);		
	}

}
