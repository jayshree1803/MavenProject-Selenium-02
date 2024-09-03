package methodsOfWebelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {
	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://desktop-2lhagot/login.do");
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("username")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).sendKeys("manager");
	WebElement lgn = driver.findElement(By.xpath("//a[@class='logout']"));
	
		System.out.println(lgn.isDisplayed());
	
	
	
	
	}

}