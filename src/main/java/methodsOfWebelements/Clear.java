package methodsOfWebelements;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("http://desktop-nt35em5/login.do");
	    
	WebElement usnTB = driver.findElement(By.name("username"));
		usnTB.sendKeys("admin");
		Thread.sleep(2000);
	WebElement pwdTB=driver.findElement(By.name("pwd"));
		pwdTB.sendKeys("manager");
		Thread.sleep(2000); 
		usnTB.clear();
		pwdTB.clear();
		
	}
}
