package popupHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OmayoPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='ClickToGetAlert']")).click();
		Alert al=driver.switchTo().alert();
		//al.accept();
		String altype=al.getText();
		System.out.println(altype);
		Thread.sleep(2000);
		al.dismiss();
	}

}
