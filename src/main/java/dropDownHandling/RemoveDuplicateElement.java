package dropDownHandling;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemoveDuplicateElement {
	public static void main(String [] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/shree/Desktop/wcsm9html/Multiple.html"); 
		driver.manage().window().maximize();
		//Identification of dropdown
		WebElement dropDown=driver.findElement(By.id("id1"));
		//handle the dropdown
		Select sel=new Select(dropDown);
		//get all options
		List<WebElement> allOps=sel.getOptions();
		//to eliminate we use hashset
		HashSet <String> hs=new HashSet<String>();
		{
				//read the list by using for loop
			for(int i=0;i<allOps.size();i++)
			{
				WebElement opt=allOps.get(i);
				String dropDownOption=opt.getText();
				hs.add(dropDownOption);
			}
				Thread.sleep(2000);
				for(String opt:hs)
				{
					System.out.println(opt);			
				}
			
				}
	}
}