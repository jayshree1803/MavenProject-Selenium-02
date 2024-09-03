package synchronizationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Omayoblogspot {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.xpath("//button[@class='dropbtn' and (text()='Dropdown')]")).click();
		driver.findElement(By.xpath("//a[text()='Flipkart']")).click();
	}

}
