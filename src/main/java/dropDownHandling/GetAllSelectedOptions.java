package dropDownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/shree/Desktop/wcsm9html/Multiple.html"); 
		driver.manage().window().maximize();
		
		//Identify dropdown option and click
		WebElement dropDown=driver.findElement(By.id("id1"));
		Select sel=new Select(dropDown);
		
		//selecting multiple dropdown
		Thread.sleep(2000);
		for(int i=0;i<=4;i++)
		{
			sel.selectByIndex(i);
		} 
		
		//read the selected options
		List<WebElement> allOpts=sel.getAllSelectedOptions();
		for(int i=0;i<=allOpts.size();i++)
		{
			String op=allOpts.get(i).getText();
			System.out.println(op);
		}
		
		}

	}