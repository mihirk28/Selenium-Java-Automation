package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageObjects {
	
	WebDriver driver = null;

	By textlink_logout = By.linkText("LOGOUT");

	public HomePageObjects(WebDriver driver) {

		this.driver = driver;
	}
	
	public void clickLogoutButton() {

		driver.findElement(textlink_logout).click();
	}

}
