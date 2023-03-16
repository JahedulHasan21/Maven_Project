package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		//PageFactory help to instantiated WebElements
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id = "ntt-placeholder")
	WebElement searchField;
	
	public void clickSearchField() throws InterruptedException {
	 
	   searchField.click();
	   Thread.sleep(5000);
		
	}

}
