package javaScriptExcuiter;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TwiterSymbol {
	public static void main(String[] args) throws InterruptedException, IOException
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.selenium.dev/");
	Thread.sleep(2000);
	
	//find the webelement
	WebElement twit=driver.findElement(By.xpath("//i[@class='fab fa-twitter']"));
	
	//get the location
	Point loc=twit.getLocation();
	int xaxis=loc.getX();
	int yaxis=loc.getY();
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	Thread.sleep(4000);
	jse.executeScript("window.scrollBy("+xaxis+","+yaxis+")");
	//TakesScreenshot ts=(TakesScreenshot)driver;

	Thread.sleep(2000);
	File src=twit.getScreenshotAs(OutputType.FILE);
	File dest=new  File("./screenshot/twit3.png");
	Files.copy(src,dest);
	}
}