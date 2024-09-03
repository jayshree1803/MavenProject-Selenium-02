package popupHandling;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://desktop-nt35em5/login.do");
		Thread.sleep(2000);
		WebElement usnTB = driver.findElement(By.name("username"));
	    usnTB.sendKeys("admin");	
		Thread.sleep(2000);
		WebElement passTB = driver.findElement(By.name("pwd"));
		passTB.sendKeys("manager");
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Settings']/following-sibling::img")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Logo & Color Scheme']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='uploadNewLogoOption']")).click();
		Thread.sleep(2000);
	
		WebElement fileButton = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
	    
		//perform double click on fileButton which open the file
		Actions act = new Actions(driver);
		act.doubleClick(fileButton).perform();
		File file=new File("./auotoit/scit1.exe");
		String path=file.getAbsolutePath();
		
		Runtime.getRuntime().exec(path);
		Thread.sleep(6000);
		Runtime.getRuntime().exec(path);
		Thread.sleep(2000);
		//driver.quit();
	}

}
