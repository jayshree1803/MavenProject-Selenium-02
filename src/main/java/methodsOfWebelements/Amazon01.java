package methodsOfWebelements;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon01 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Browser Value");
		String browserValue=sc.next();
		
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
				Thread.sleep(2000);
		}
		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
				Thread.sleep(2000);
		}
		else if(browserValue.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
			driver.manage().window().maximize();
				Thread.sleep(2000);
		}
		else
		{
			System.out.println("Ënter Valid Input");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		searchProduct("Apple Watches");
	}
	public static void searchProduct(String product) throws InterruptedException
	{
		WebElement searchBox=driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));
		searchBox.sendKeys(product);
		Thread.sleep(2000);
		driver.findElement(By.name("url")).click();
		driver.findElement(By.xpath("//option[text(    )='Watches']")).click();
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	}
}