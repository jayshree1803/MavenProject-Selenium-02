package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriver	driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//section[text()='Drag And Drop']")).click();
		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		//store the all the drag element
		WebElement src1=driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement src2=driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		WebElement src3=driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		WebElement src4=driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		//store the all drop elememt
		WebElement target1=driver.findElement(By.xpath("//div[@class='drop-column min-h-[200px] bg-slate-100'][1]"));
		WebElement target2=driver.findElement(By.xpath("//div[@class='drop-column min-h-[200px] bg-slate-100'][1]"));
		WebElement target3=driver.findElement(By.xpath("//div[@class='drop-column min-h-[200px] bg-slate-100'][2]"));
		WebElement target4=driver.findElement(By.xpath("//div[@class='drop-column min-h-[200px] bg-slate-100'][2]"));
		//perform drag and drop action for mobile
		Actions act=new Actions(driver);
		act.dragAndDrop(src1, target1).perform();
		act.dragAndDrop(src3, target1).perform();
		act.dragAndDrop(src2, target3).perform();
		act.dragAndDrop(src4, target4).perform();
		

	}

}
