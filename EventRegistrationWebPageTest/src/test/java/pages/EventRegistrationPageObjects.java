package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EventRegistrationPageObjects {

	WebDriver driver = null;

	By textbox_firstname = By.name("firstname");

	By textbox_lastname = By.name("lastname");

	By button_gender = By.id("sexMale");

	By intbox_age = By.name("age");

	By textbox_email = By.name("email");

	By textbox_username = By.name("username");

	By textbox_password = By.name("password");

	By button_register = By.id("registerButton");

	By textbox_loginusername = By.name("loginUsername");

	By textbox_loginpassword = By.name("loginPassword");

	By button_login = By.id("loginButton");


	public EventRegistrationPageObjects(WebDriver driver) {

		this.driver = driver;
	}


	public void setTextInFirstName(String text) {

		driver.findElement(textbox_firstname).sendKeys(text);
	}

	public void setTextInLastName(String text) {

		driver.findElement(textbox_lastname).sendKeys(text);
	}

	public void clickGenderButton() {	

		driver.findElement(button_gender).click();
	}

	public void setAge(String text) {

		driver.findElement(intbox_age).sendKeys(text);
	}

	public void setTextInEmail(String text) {

		driver.findElement(textbox_email).sendKeys(text);
	}

	public void setTextInUserName(String text) {

		driver.findElement(textbox_username).sendKeys(text);
	}

	public void setTextInPassword(String text) {

		driver.findElement(textbox_password).sendKeys(text);
	}

	public void clickRegisterButton() {

		driver.findElement(button_register).click();
	}
	
	public void setTextInLoginUsername(String text) {

		driver.findElement(textbox_loginusername).sendKeys(text);
	}
	
	public void setTextInLoginPassword(String text) {

		driver.findElement(textbox_loginpassword).sendKeys(text);
	}
	
	public void clickLoginButton() {

		driver.findElement(button_login).click();
	}


}
