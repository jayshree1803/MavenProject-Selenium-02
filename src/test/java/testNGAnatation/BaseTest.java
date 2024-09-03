package testNGAnatation;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest{
	static WebDriver driver;
	@BeforeMethod
	public void setup() throws InterruptedException
 {
			   driver=new ChromeDriver();
			  driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			  driver.get("https://www.google.co.in/"); 
			  Thread.sleep(2000);
 }
	@AfterMethod
	public void tearDown()
	{
			  driver.close();
  }
}