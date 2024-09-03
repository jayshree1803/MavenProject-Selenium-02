package dropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selection
{
	public static void main(String [] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://demoapps.qspiders.com/"); 
		driver.manage().window().maximize();
		//Identify dropdown option and click
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		// Identify Phone number dropdown
		WebElement dropDown1=driver.findElement(By.xpath("//select[contains(@class,'  ease-linear transition-all duration-150 w-5/12')]"));
		Select sel=new Select(dropDown1);
		Thread.sleep(2000);
		//select option
		sel.selectByIndex(2);
		
		
		//Identify country dropdown
		WebElement dropDown2=driver.findElement(By.xpath("//label[text()='Country']/following-sibling::select"));
		Select sel2=new Select(dropDown2);
		Thread.sleep(2000);
		sel2.selectByValue("India");
		
		//Identify state dropdown
		WebElement dropDown3=driver.findElement(By.xpath("//label[text()='State']/following-sibling::select"));
		Select sel3=new Select(dropDown3);
		Thread.sleep(2000);
		sel3.selectByVisibleText("Maharashtra");
		
		//Identify city dropdown
		WebElement dropDown4=driver.findElement(By.xpath("//label[text()='City']/following-sibling::select"));
		Select sel4=new Select(dropDown4);
		Thread.sleep(2000);
		sel4.selectByVisibleText("Mumbai");
		
		//Handle Multiselectdropdown
		Thread.sleep(2000);
		driver.navigate().to("file:///C:/Users/shree/Desktop/wcsm9html/Multiple.html");
		WebElement dropDown5=driver.findElement(By.id("id1"));
		Select sel5=new Select(dropDown5);
		//selecting multiple dropdown
		Thread.sleep(2000);
		for(int i=0;i<=3;i++)
		{
			sel5.selectByIndex(i);
		} 
		//deselecting multiple dropdown
		Thread.sleep(2000);
		for(int i=0;i<=3;i++)
		{
			sel5.deselectByIndex(i);
	}
		//navigate to other appliction
		driver.navigate().to("http://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		//Selecting multi select dropdown
		driver.findElement(By.xpath("//a[text()='Multi Select']")).click();
		WebElement dropDown6=driver.findElement(By.xpath("//label[text()='Country']/following-sibling::select"));
		Select sel6=new Select(dropDown6);
		
		for(int i=0;i<=3;i++)
		{	Thread.sleep(2000);
			sel6.selectByIndex(i);
			
		}
}
}