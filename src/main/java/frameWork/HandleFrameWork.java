package frameWork;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrameWork {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bluestone.com/jewellery/divaine+diamonds+collection.html");
		Thread.sleep(2000);
		
		WebElement frameElement=driver.findElement(By.id("fc_widget"));
		driver.switchTo().frame(frameElement);
		driver.findElement(By.xpath("//div[@id='chat-icon']")).click();
		// switch back to main page
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("chat-fc-name")).sendKeys("jayshree");
		Thread.sleep(2000);
		driver.findElement(By.id("chat-fc-email")).sendKeys("gore@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("chat-fc-phone")).sendKeys("9876543210");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Start Chat']")).click();
	}

}
