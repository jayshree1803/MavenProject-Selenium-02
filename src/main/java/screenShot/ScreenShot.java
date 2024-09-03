package screenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.selenium.dev/");
		
		TakesScreenshot ts=(TakesScreenshot)driver;

		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new  File("./screenshot/selenium_ss.png");
		Files.copy(src,dest);
		
		

	}

}
