package dropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class IsMultipale {
	public static void main(String [] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://demoapps.qspiders.com/"); 
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//single select dropdown
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		WebElement dropdown1=driver.findElement(By.xpath("//label[text()='Phone Number']/following-sibling::section/select"));
		Select sel=new Select(dropdown1);
		boolean status=sel.isMultiple();
		System.out.println(status);
		Thread.sleep(2000);
		
		//multiselect dropdown
		driver.findElement(By.xpath("//a[text()='Multi Select']")).click();
		WebElement dropDown2=driver.findElement(By.xpath("//label[text()='Country']/following-sibling::select"));
		Select sel2=new Select(dropDown2);
		for(int i=0;i<=3;i++)
		{	Thread.sleep(2000);
			sel2.selectByIndex(i);
			
		}
		boolean status1=sel2.isMultiple();
		System.out.println(status1);
		Thread.sleep(2000);
		
		
		
	}

}
