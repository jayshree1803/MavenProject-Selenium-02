package testNGExecution;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium {
	@Test
	  public void java_method() throws InterruptedException {
		  WebDriver driver=new EdgeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.get("https://www.google.co.in/"); 
		  Thread.sleep(2000);
		  driver.switchTo().activeElement().sendKeys("selenium",Keys.ENTER);
		  driver.close();
		  }
	}
