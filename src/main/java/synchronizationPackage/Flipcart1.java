package synchronizationPackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Flipcart1 {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='✕']")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("q")).sendKeys("Laptop",Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Brand']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='HP']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Core i7']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Operating System']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Windows 11']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='4★ & above']")).click();
	Thread.sleep(2000);
	List<WebElement> allLaptops = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	List<WebElement> allPrices = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
	Thread.sleep(2000);
	for(int i=0;i<=allLaptops.size();i++)
	{
		
		String laptop =allLaptops.get(i).getText();
		Thread.sleep(2000);
		
		for(int j=i;j<=i;j++)
		{
			String price=allPrices.get(i).getText();
			Thread.sleep(2000);
			System.out.println(laptop+":"+price);
	}
	
	
	}
	}
}