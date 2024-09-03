package javaScriptExcuiter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnabledWebelemet {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='Disabled Mode']")).click();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("document.getElementById('name').value='jayshree'");
		jse.executeScript("document.getElementById('email').value='gore.jayshree1803@gmail.com'");
		jse.executeScript("document.getElementById('password').value='Shivarth@2108'");
		
WebElement ele	=driver.findElement(By.xpath("driver.findElement(By.xpath(//button[text()='Register']"));
Thread.sleep(2000);
if(ele.isDisplayed())
{
	jse.executeScript("arguments[0].click()",ele);
	Thread.sleep(2000);
	jse.executeScript("arguments[0].click()",driver.findElement(By.xpath("//a[contains(@class,'bg-orange-5')]")));
	
	System.out.println("Click");
}
else 
{
	System.out.println("Not Click");
}
}

}
