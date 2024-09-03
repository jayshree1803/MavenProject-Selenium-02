package synchronizationPackage;

import java.time.Duration;
import java.util.Set;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		driver.findElement(By.xpath("//input[@class='Pke_EE' and  (@name='q')]")).sendKeys("iphone");
		driver.findElement(By.xpath("//button[contains(@title,'Search for Products, Brands and More')]")).click();
		String ParentHandle=driver.getWindowHandle();
		driver.findElement(By.xpath("//div[@class='_4rR01T']) [2]")).click();
		Set<String>allHandles=driver.getWindowHandles();
		for(String wh:allHandles)
		{
			if(!ParentHandle.equals(wh))
			{
				System.out.println("Address of child window"+wh);
				
			}
			else
			{
				System.out.println("Address of Parent Window"+wh);
			}
		}
		Thread.sleep(2000);
	//	driver.findElement(By.xpath(""))
		
		
	}

	
	}

