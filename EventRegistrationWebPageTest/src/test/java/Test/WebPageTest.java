package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebPageTest {

	public static void main(String[] args) throws Exception {

		String expectedTitle1 = "Event Registration";
		String expectedTitle2 = "Confirmation Page";
		String expectedTitle3 = "Home Page";

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//		JavascriptExecutor js = ((JavascriptExecutor) driver);

		//		WebDriverManager.firefoxdriver().setup();
		//		WebDriver driver = new FirefoxDriver();

		//		driver.get("https://www.bing.com/");
		driver.get("http://localhost/eventregistration/login.php");

		String actualTitle1 = driver.getTitle();
		System.out.println("\n Title fetched: "+ actualTitle1);

		// Validate/Compare Page Title
		if(expectedTitle1.equals(actualTitle1)) {
			System.out.println("Test Passed : Event Registration Page successfully appeared on the screen ");
		}
		else {
			System.out.println("Test Failed : Event Registration Page did not appeared on the screen");
		}
		
		Thread.sleep(2000);

		// to find element name of "First Name"
		WebElement FirstName = driver.findElement(By.name("firstname"));

		// To enter First Name
		FirstName.sendKeys("Thoku");
		
		Thread.sleep(1500);


		// to find element name of "Last Name"
		WebElement LastName = driver.findElement(By.name("lastname"));

		// To enter Last Name
		LastName.sendKeys("Singh");
		
		Thread.sleep(1500);


		// To find element of gender
		WebElement Gender = driver.findElement(By.id("sexMale"));

		// To select the gender
		Gender.click();
		
		Thread.sleep(1500);


		// to find element name of "Age"
		WebElement Age = driver.findElement(By.name("age"));

		// To enter Age
		Age.sendKeys("25");

		Thread.sleep(1500);

		// to find element name of "Email"
		WebElement Email = driver.findElement(By.name("email"));

		// To enter Email
		Email.sendKeys("thoku@pornsab.xx");

		Thread.sleep(1500);

		// to find element name of "Username"
		WebElement Username = driver.findElement(By.name("username"));

		// To enter  Username
		Username.sendKeys("User123");

		Thread.sleep(1500);
		
		// to find element name of "Password"
		WebElement Password = driver.findElement(By.name("password"));

		// To enter First Name
		Password.sendKeys("abcd1234");

		Thread.sleep(1500);
		
		// To click on register button for creating new account
		driver.findElement(By.id("registerButton")).click();

		// To get page title of confirmation page
		String actualTitle2 = driver.getTitle();
		System.out.println("\n Title fetched: "+ actualTitle2);

		// Validate/Compare Page Title
		if(expectedTitle2.equals(actualTitle2)) {
			System.out.println("Test Passed : Confirmation page with message successfully appeared on the screen \n Registration Successful.");
		}
		else {
			System.out.println("Test Failed : Confirmation page with message did not appeared on the screen \n Registration Failed");
		}

		Thread.sleep(2000);
		
		
		// to click on the web link which redirects to the home page
		driver.findElement(By.linkText("Click Here")).click();

		// To get the page title of home page
		System.out.println("\n Title fetched: "+ actualTitle1);


		// Validate/Compare Page Title
		if(expectedTitle1.equals(actualTitle1)) {
			System.out.println("Test Passed: Redirected to Registration Page successfully on the screen");
		}
		else {
			System.out.println("Test Failed :  Did not redirected to Registration Page on the screen");
		}

		Thread.sleep(1500);

		// to find element name of User name to login
		WebElement LoginUsername = driver.findElement(By.name("loginUsername"));

		// To enter  User name
		LoginUsername.sendKeys("User123");
		
		Thread.sleep(1500);


		// to find element name of password to login
		WebElement LoginPassword = driver.findElement(By.name("loginPassword"));

		// To enter password
		LoginPassword.sendKeys("abcd1234");
		
		Thread.sleep(1500);


		// To click on register button for creating new account
		driver.findElement(By.id("loginButton")).click();

		String actualTitle3 = driver.getTitle();
		System.out.println("\n Title fetched: "+ actualTitle3);

		// Validate/Compare Page Title
		if(expectedTitle3.equals(actualTitle3)) {
			System.out.println("Test Passed : Home Page successfully appeared on the screen \n Login Successful ");
		}
		else {
			System.out.println("Test Failed : Home Page did not appeared on the screen \n Login Failed");
		}

		Thread.sleep(2000);

		// to click on the web link which redirects to the home page
		driver.findElement(By.linkText("LOGOUT")).click();

		// To get the page title of home page
		System.out.println("\n Title fetched: "+ actualTitle1);


		// Validate/Compare Page Title
		if(expectedTitle1.equals(actualTitle1)) {
			System.out.println("Test Passed : Redirected to Registration Page successfully on the screen");
		}
		else {
			System.out.println("Test Failed : Did not redirected to Registration Page successfully on the screen");
		}

		//		driver.findElement(By.id("h.4zdgjzzduvj7")).click();
		//		driver.findElement(By.linkText("Powertrain Portfolio")).click();
		//		Thread.sleep(2000);
		//		js.executeScript("window.scrollBy(0,1000)");
		//		Thread.sleep(2000);

		//		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		//		WebElement textBox = driver.findElement(By.id("sb_form_q"));

		//		textBox.sendKeys("Pornhub");

		//		driver.findElement(By.id("sb_form_q")).sendKeys(Keys.RETURN);
		Thread.sleep(2000);

		driver.close();
		driver.quit();
	}


}
