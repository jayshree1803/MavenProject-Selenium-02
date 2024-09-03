package dropDownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElement {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/shree/Desktop/wcsm9html/Multiple.html");
		WebElement dropdown=driver.findElement(By.id("id1"));
		Select sel=new Select(dropdown);
		//get all the options from dropdown by using getWrappedElement
		WebElement allops=sel.getWrappedElement();
		System.out.println(allops.getText());
		
		List<WebElement> options=sel.getOptions();
		for(WebElement opt:options)
		{
			if(opt.getText().equals("Poha"));
			System.out.println(opt.getText());
			
		} 
		
	}

}
