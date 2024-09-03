package screenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class SS_WebElement {
	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//launch the web application
		driver.get("https://www.bluestone.com/");
		//handle the popup
		driver.findElement(By.xpath("//span[@id='denyBtn']")).click();

		WebElement coins=driver.findElement(By.xpath("//a[@title='Coins'] "));
		//to perform mouse over
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(coins).perform();
		
		driver.findElement(By.xpath("//span[text()='1 gram'] ")).click();
		//identify webelement to take screen shot
		WebElement coins2=driver.findElement(By.xpath("//div[@class='mousetrap']"));
		//store into the file
		File src=coins2.getScreenshotAs(OutputType.FILE);
		File dest=new  File("./screenshot/selenium_ss2.png");
		Files.copy(src,dest);
		
		

}
}