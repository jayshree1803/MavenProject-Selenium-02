package methodsOfWebelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled{
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.instagram.com/");
	WebElement lgnbtn = driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']"));
	Thread.sleep(2000);
	System.out.println("before value passing to username and password textfield:");
	
	System.out.println(lgnbtn.isEnabled());
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("password")).sendKeys("admin@123");
	System.out.println("after value passing to username and password textfield:");
	System.out.println(lgnbtn.isEnabled());
	}

}