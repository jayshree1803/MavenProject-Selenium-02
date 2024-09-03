package methodsOfWebelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-2lhagot/login.do");
		WebElement chkbx = driver.findElement(By.name("remember"));
		System.out.println("before selecting check box:");
			System.out.println(chkbx.isSelected());
		Thread.sleep(2000);
		chkbx.click();
		System.out.println("before selecting check box:");
		System.out.println(chkbx.isSelected());
		
		
		
		}


}