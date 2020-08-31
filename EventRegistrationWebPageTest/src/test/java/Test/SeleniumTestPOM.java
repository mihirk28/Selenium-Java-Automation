package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.ConfirmationPageObjects;
import pages.EventRegistrationPageObjects;
import pages.HomePageObjects;

public class SeleniumTestPOM {

	private static WebDriver driver = null;

	public static void main(String[] args) {

		setBrowser();
		webPageTest();
		closeBrowser();

	}
	
	public static void setBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}

	public static void webPageTest() {


		EventRegistrationPageObjects searchPageObj1 = new EventRegistrationPageObjects(driver);
		
		ConfirmationPageObjects searchPageObj2 = new ConfirmationPageObjects(driver);
		
		HomePageObjects searchPageObj3 = new HomePageObjects(driver);

		driver.get("http://localhost/eventregistration/login.html");

		searchPageObj1.setTextInFirstName("FIRSTNAME");

		searchPageObj1.setTextInLastName("LASTNAME");
		
		searchPageObj1.clickGenderButton();
		
		searchPageObj1.setAge("25");
		
		searchPageObj1.setTextInEmail("user01@testmail.com");
		
		searchPageObj1.setTextInUserName("user01");
		
		searchPageObj1.setTextInPassword("abcd1234");
		
		searchPageObj1.clickRegisterButton();
		
		searchPageObj2.clickTextLink();
		
		searchPageObj1.setTextInLoginUsername("user01");
		
		searchPageObj1.setTextInLoginPassword("abcd1234");
		
		searchPageObj1.clickLoginButton();
		
		searchPageObj3.clickLogoutButton();

	}
	
	public static void closeBrowser() {
		
		driver.close();
		driver.quit();
		
	}
	
}
