package dropDownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://demoapps.qspiders.com/"); 
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		WebElement dropdown1=driver.findElement(By.xpath("//label[text()='Phone Number']/following-sibling::section/select"));
		Select sel=new Select(dropdown1);
		List<WebElement> allOps=sel.getOptions();
		{
			for(int i=0;i<=allOps.size();i++)
			{
				String opt=allOps.get(i).getText();
				Thread.sleep(2000);
				System.out.println(opt);
			}
		}
		

	}

}
