package popupHandling;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class NotificationPopup {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter The Browser Value");
			String browserValue=sc.next();
			
			if(browserValue.equalsIgnoreCase("chrome"))
			{
				ChromeOptions co=new ChromeOptions();
				co.addArguments("--disable-notifications");
				driver=new ChromeDriver(co);
				
				driver.manage().window().maximize();
					Thread.sleep(2000);
			
			
			}
			else if(browserValue.equalsIgnoreCase("firefox"))
			{
				FirefoxOptions fo=new FirefoxOptions();
			fo.addArguments("--disable-notifications");
				driver=new FirefoxDriver(fo);
				
				driver.manage().window().maximize();
					Thread.sleep(2000);
				
			
			}
			else if(browserValue.equalsIgnoreCase("edge"))
			{
				EdgeOptions eo=new EdgeOptions();
				eo.addArguments("--disable-notifications");
				driver=new EdgeDriver(eo);
				
				driver.manage().window().maximize();
					Thread.sleep(2000);
	
			}
			else
			{
				System.out.println("Ënter Valid Input");
			}

			driver.get("https://www.irctc.co.in/nget/train-search");

	}

}
