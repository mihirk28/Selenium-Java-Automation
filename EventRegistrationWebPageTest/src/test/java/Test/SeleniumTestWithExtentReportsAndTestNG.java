package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.ConfirmationPageObjects;
import pages.EventRegistrationPageObjects;
import pages.HomePageObjects;

public class SeleniumTestWithExtentReportsAndTestNG {

	static ExtentSparkReporter htmlReporter;
	static ExtentReports extent;
	static WebDriver driver = null;

	String expectedTitle1 = "Event Registration";
	String expectedTitle2 = "Confirmation Page";
	String expectedTitle3 = "Home Page";

	static EventRegistrationPageObjects searchPageObj1; 
	static ConfirmationPageObjects searchPageObj2; 
	static HomePageObjects searchPageObj3; 

	static ExtentTest test1 = null;
	static ExtentTest test2 = null; 
	static ExtentTest test3 = null; 


	@BeforeSuite
	public void setupTest() {

		// Start Reporters
		String projectpath = System.getProperty("user.dir");
		htmlReporter = new ExtentSparkReporter(projectpath + "/extent.html");

		// Create ExtentReports and attach reporter(s)
		extent = new ExtentReports();
		//		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);


		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();


	}

	@BeforeTest
	public void setupTestConfig() {

		test1 = extent.createTest("Navigate to Event Registration Website", "This is a test to validate Event Registration Form");
		test2 = extent.createTest("Fill the event registration form", "This test is to fill the  Event Registration Form");
		test3 = extent.createTest("Fill the Login Form", "This test is to fill the login form with username and password to access to personal profile page");


		searchPageObj1 = new EventRegistrationPageObjects(driver);
		searchPageObj2 = new ConfirmationPageObjects(driver);
		searchPageObj3 = new HomePageObjects(driver);

	}

	@Test
	public void Test1() throws Exception {

		//	ExtentTest test1 = extent.createTest("Navigate to Event Registration Website", "This is a test to validate Event Registration Form");
		
		test1.generateLog(Status.INFO, "To access registration page");

		test1.log(Status.INFO, "Starting Test case");
		driver.get("http://localhost/eventregistration/login.html");
		String actualTitle1 = driver.getTitle();

		// Validate/Compare Page Title
		test1.log(Status.INFO, "Accessing to Event registration page");
		if(expectedTitle1.equals(actualTitle1)) {
			test1.pass("Event Registration Page successfully appeared on the screen");
		}
		else {
			test1.fail("Event Registration Page did not appeared on the screen");
			System.out.println("Test Failed : Event Registration Page did not appeared on the screen");
		}

//		Thread.sleep(2000);

	}

	@Test
	public void Test2_01() {

		//		ExtentTest test2 = extent.createTest("Fill the event registration form", "This test is to fill the  Event Registration Form");

		test2.generateLog(Status.INFO, "To type the first name in textbox");
		
		test2.log(Status.INFO, "Typing the first name in textbox");
		searchPageObj1.setTextInFirstName("FIRSTNAME");
		test2.pass("First name succussfully written in the textbox");


	}

	@Test
	public void Test2_02() {

		//		ExtentTest test2 = extent.createTest("Fill the event registration form", "This test is to fill the  Event Registration Form");

		test2.generateLog(Status.INFO, "To type the last name in textbox");
		
		test2.log(Status.INFO, "Typing the last name in textbox");
		searchPageObj1.setTextInLastName("LASTNAME");
		test2.pass("Last name succussfully written in the textbox");


	}

	@Test
	public void Test2_03() {

		//		ExtentTest test2 = extent.createTest("Fill the event registration form", "This test is to fill the  Event Registration Form");

		test2.generateLog(Status.INFO, "To Select the gender");
		
		test2.log(Status.INFO, "Selecting the gender");
		searchPageObj1.clickGenderButton();
		test2.pass("Gender selected succussfully");


	}

	@Test
	public void Test2_04() {

		//		ExtentTest test2 = extent.createTest("Fill the event registration form", "This test is to fill the  Event Registration Form");

		test2.generateLog(Status.INFO, "To type the age in textbox");
		
		test2.log(Status.INFO, "Typing the age in textbox");
		searchPageObj1.setAge("25");
		test2.pass("Age succussfully written in the textbox");


	}

	@Test
	public void Test2_05() {

		//		ExtentTest test2 = extent.createTest("Fill the event registration form", "This test is to fill the  Event Registration Form");

		test2.generateLog(Status.INFO, "To type the email in textbox");
		
		test2.log(Status.INFO, "Typing the email in textbox");
		searchPageObj1.setTextInEmail("user01@testmail.com");
		test2.pass("Email succussfully written in the textbox");


	}

	@Test
	public void Test2_06() {

		//		ExtentTest test2 = extent.createTest("Fill the event registration form", "This test is to fill the  Event Registration Form");

		test2.generateLog(Status.INFO, "To type the username in textbox");
		
		test2.log(Status.INFO, "Typing the username in textbox");
		searchPageObj1.setTextInUserName("user01");
		test2.pass("Username succussfully written in the textbox");


	}

	@Test
	public void Test2_07() throws Exception {

		//		ExtentTest test2 = extent.createTest("Fill the event registration form", "This test is to fill the  Event Registration Form");

		test2.generateLog(Status.INFO, "To type the password in textbox");
		
		test2.log(Status.INFO, "Typing the password in textbox");
		searchPageObj1.setTextInPassword("abcd1234");
		test2.pass("Password succussfully written in the textbox");

//		Thread.sleep(2000);

	}

	@Test
	public void Test2_08() {

		//		ExtentTest test2 = extent.createTest("Fill the event registration form", "This test is to fill the  Event Registration Form");

		test2.generateLog(Status.INFO, "To click on the register button");
		
		test2.log(Status.INFO, "Clicking on the register button");
		searchPageObj1.clickRegisterButton();
		test2.pass("Clicked on register button succussfully ");


	}

	@Test
	public void Test2_09() throws Exception {

		//		ExtentTest test2 = extent.createTest("Fill the event registration form", "This test is to fill the  Event Registration Form");

		String actualTitle2 = driver.getTitle();

		// Validate/Compare Page Title
		test2.generateLog(Status.INFO, "To access confirmation page");
		
		test2.log(Status.INFO, "Accessing to confirmation page");
		if(expectedTitle2.equals(actualTitle2)) {
			test2.pass("Registration Successful: Confirmation page with message successfully appeared on the screen");
		}
		else {
			test2.fail("Registration Failed: Confirmation page with message did not appeared on the screen");
		}

//		Thread.sleep(2000);

	}

	@Test
	public void Test2_10() {

		//		ExtentTest test2 = extent.createTest("Fill the event registration form", "This test is to fill the  Event Registration Form");

		test2.generateLog(Status.INFO, "To click on textlink 'Click Here'");
		
		test2.log(Status.INFO, "Clicking on textlink 'Click Here'");
		searchPageObj2.clickTextLink();
		test2.pass("Clicked on textlink succussfully ");


	}

	@Test
	public void Test2_11() {

		//		ExtentTest test2 = extent.createTest("Fill the event registration form", "This test is to fill the  Event Registration Form");

		String actualTitle3 = driver.getTitle();
		// Validate/Compare Page Title
		test2.generateLog(Status.INFO, "To Redirect to registration page");
		
		test2.log(Status.INFO, "Redirecting to registration page");
		if(expectedTitle1.equals(actualTitle3)) {
			test2.pass("Redirected to Registration Page successfully on the screen");
		}
		else {
			test2.fail("Did not redirected to Registration Page on the screen");
		}


	}

	@Test
	public void Test3_01() {

		//		ExtentTest test3 = extent.createTest("Fill the Login Form", "This test is to fill the login form with username and password to access to personal profile page");

		test3.generateLog(Status.INFO, "To type the username in login textbox");
		
		test3.log(Status.INFO, "Typing the username in login textbox");
		searchPageObj1.setTextInLoginUsername("user01");
		test3.pass("Username succussfully written in the login textbox");

	}

	@Test
	public void Test3_02() throws Exception {

		//		ExtentTest test3 = extent.createTest("Fill the Login Form", "This test is to fill the login form with username and password to access to personal profile page");

		test3.generateLog(Status.INFO, "To type the password in login textbox");
		
		test3.log(Status.INFO, "Typing the password in login textbox");
		searchPageObj1.setTextInLoginPassword("abcd1234");
		test3.pass("Password succussfully written in the textbox");

	//	Thread.sleep(2000);
	}

	@Test
	public void Test3_03() {

		//		ExtentTest test3 = extent.createTest("Fill the Login Form", "This test is to fill the login form with username and password to access to personal profile page");

		test3.generateLog(Status.INFO, "To click on login button");
		
		test3.log(Status.INFO, "Clicking on login button");
		searchPageObj1.clickLoginButton();
		test3.pass("Clicked on login button succussfully ");

	}

	@Test
	public void Test3_04() throws Exception {

		//		ExtentTest test3 = extent.createTest("Fill the Login Form", "This test is to fill the login form with username and password to access to personal profile page");

		String actualTitle4 = driver.getTitle();

		// Validate/Compare Page Title
		test3.generateLog(Status.INFO, "To access profile page");
		
		test3.log(Status.INFO, "Accessing to profile page");
		if(expectedTitle3.equals(actualTitle4)) {
			test3.pass("Login Successful: Profile Page (Home Page) successfully appeared on the screen");
		}
		else {
			test3.fail("Login Failed: Profile Page (Home Page) did not appeared on the screen");
		}

	//	Thread.sleep(2000);
	}

	@Test
	public void Test3_05() {

		//		ExtentTest test3 = extent.createTest("Fill the Login Form", "This test is to fill the login form with username and password to access to personal profile page");

		test3.generateLog(Status.INFO, "To click on 'LOGOUT' button");
		
		test3.log(Status.INFO, "Clicking on 'LOGOUT' button");
		searchPageObj3.clickLogoutButton();
		test3.pass("Clicked on 'LOGOUT' button succussfully");

	}

	@Test
	public void Test3_06() throws Exception {

		//		ExtentTest test3 = extent.createTest("Fill the Login Form", "This test is to fill the login form with username and password to access to personal profile page");

		String actualTitle5 = driver.getTitle();
		// Validate/Compare Page Title
		test3.generateLog(Status.INFO, "To redirect to registration page");
		
		test3.log(Status.INFO, "Redirecting to registration page");
		if(expectedTitle1.equals(actualTitle5)) {
			test3.pass("Redirected to Registration Page successfully on the screen");
		}
		else {
			test3.fail("Did not redirected to Registration Page successfully on the screen");
		}

	//	Thread.sleep(3000);
	}


	@AfterSuite
	public void closeBrowser() {

		driver.close();
		driver.quit();

		// calling flush writes everything to the log file
		extent.flush();
	}


}
