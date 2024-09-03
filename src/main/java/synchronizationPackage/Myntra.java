package synchronizationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.myntra.com/");
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("black shirt");
		driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconSearch sprites-search']")).click();
	//	String ParentHandle=driver.getWindowHandle();
		driver.findElement(By.xpath("//img[@title='HIGHLANDER Black Ethnic Motifs Printed Spread Collar Cotton Casual Shirt']")).click();
	driver.findElement(By.xpath("//button[contains(@class,'size-button size-buttons-size-button-default')]")).click();
	}

}
