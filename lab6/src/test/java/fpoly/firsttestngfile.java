package fpoly;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class firsttestngfile {
	public String baseUrl = "https://lms.poly.edu.vn//"; // http://lms.poly.
	String driverPath = "C:\\Users\\dinhh\\OneDrive\\Desktop\\ktnc\\advance_test\\edgedriver_win64\\msedgedriver.exe";
	public WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		System.out.println("launching edge browser");
		System.setProperty("webdriver.edge.driver", driverPath);

		driver = new EdgeDriver();
		driver.get(baseUrl);
	}

	@Test
	public void verifyHomepageTitle() {
	String expectedTitle = "FPT Polytechnic";
	String actualTitle = driver.getTitle();
	Assert.assertEquals (actualTitle, expectedTitle);
	}

	@AfterTest
	public void terminateBrowser() {
		driver.close();
	}
}