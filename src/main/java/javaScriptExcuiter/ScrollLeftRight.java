package javaScriptExcuiter;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollLeftRight {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://dashboards.handmadeinteractive.com/");
		Thread.sleep(2000);
		//perform scrolldown
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(5000,0)");
		
		for(int i=0;i<2;i++)
		{
		  Thread.sleep(2000);
	    	jse.executeScript("window.scrollBy(-5000,0)");
		}
		
	}
		
	}
