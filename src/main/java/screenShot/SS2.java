package screenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class SS2 {
	public static void main(String[] args) throws IOException {
		
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.selenium.dev/");

	File src=driver.getScreenshotAs(OutputType.FILE);
	File dest=new  File("./screenshot/selenium_ss1.png");
	Files.copy(src,dest);
}
}