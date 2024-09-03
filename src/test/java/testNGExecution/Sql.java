package testNGExecution;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Sql {
	@Test
	  public void java_method() throws InterruptedException {
		  WebDriver driver=new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.get("https://www.google.co.in/"); 
		  Thread.sleep(2000);
		  driver.switchTo().activeElement().sendKeys("sql",Keys.ENTER);
		  driver.close();
		  }
	}