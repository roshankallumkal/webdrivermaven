package webdrivermaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Logintest {
	public static WebDriver driver;
	
	@BeforeSuite
	public void setup() {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Roshan\\eclipse-workspace\\webdrivermaven\\src\\test\\resources\\browserdrivers\\geckodriver.exe");
		
		driver = new FirefoxDriver();
			
	}
	
	@Test
	public void login() {
		driver.get("http://gmail.com");
	}
	
	@AfterSuite
	public void teardown() {
		driver.quit();
	}

}