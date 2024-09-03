package javaScriptExcuiter;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Omayoblogspot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://omayo.blogspot.com/");
		WebElement text=driver.findElement(By.xpath("//input[@id='tb2']"));
		
		//get the location
		Point loc=text.getLocation();
		int xaxis=loc.getX();
		int yaxis=loc.getY();
		//scrolling
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+xaxis+","+yaxis+")");
		//passing the value
		jse.executeScript("document.getElementById('tb2').value='jayshree'");
		//taking screenshot
		File src=text.getScreenshotAs(OutputType.FILE);
		File dest=new  File("./screenshot/enabledtext.png");
		Files.copy(src,dest);
		

	}

}
