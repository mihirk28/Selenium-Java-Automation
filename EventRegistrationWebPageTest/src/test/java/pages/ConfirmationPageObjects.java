package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmationPageObjects {

	WebDriver driver = null;

	By textlink_return = By.linkText("Click Here");

	public ConfirmationPageObjects(WebDriver driver) {

		this.driver = driver;
	}
	
	public void clickTextLink() {

		driver.findElement(textlink_return).click();
	}


}
