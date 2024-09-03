package dropDownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelected {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/shree/Desktop/wcsm9html/Multiple.html");
		WebElement dropdown=driver.findElement(By.id("id1"));
		Select sel=new Select(dropdown);
		sel.selectByValue("v5");
		Thread.sleep(2000);
		WebElement firstop=sel.getFirstSelectedOption();
		System.out.println(firstop.getText());
		
		//multiple select dropdown
		driver.navigate().to("file:///C:/Users/shree/Desktop/wcsm9html/Multiple.html");
		WebElement dropdown2=driver.findElement(By.id("id1"));
		Select sel2=new Select(dropdown2);
		Thread.sleep(2000);
		for(int i=0;i<=3;i++)
		{
			sel2.selectByIndex(i);
		} 
		Thread.sleep(2000);
		System.out.println(sel2.getFirstSelectedOption().getText());
	}

}
