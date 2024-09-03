package popupHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Authentication {
	public static void main(String [] args) throws InterruptedException, AWTException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demoapps.qspiders.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//section[text()='Popups']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//section[text()='Authentication']")).click();
	Thread.sleep(2000);
	
	String aut_pagewindow=driver.getWindowHandle();
	WebElement admin = driver.findElement(By.xpath("//b[text()='admin'][1]"));
	
	//double click on admin
	Actions act=new Actions(driver);
	act.doubleClick(admin).perform();
	Thread.sleep(2000);
	act.clickAndHold(admin).perform();
	
	//copy the admin text
	Robot robot = new Robot();
	
	Thread.sleep(2000);
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_C);
	
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_C);
	

	driver.findElement(By.xpath("//a[text()='Login']")).click();
	Set<String> allwindowhandle=driver.getWindowHandles();
	for(String wh:allwindowhandle)
	{
			if(!aut_pagewindow.equals(wh))
					{
						driver.switchTo().window(wh);
					}
	}
	Thread.sleep(2000);
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);

	}

		
	}
