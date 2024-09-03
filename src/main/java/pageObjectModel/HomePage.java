package pageObjectModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	//store all the modulesof HomePage
	@FindBy(xpath="//div[text()='Time-Track']/following-sibling::div/img")private WebElement timeTrack;
	@FindBy(xpath="//div[text()='Tasks']/following-sibling::img")private WebElement TaskModule;
	@FindBy(xpath="//div[text()='Reports']/following-sibling::img")private WebElement Reports_Module;
	@FindBy(xpath="//div[text()='Users']/following-sibling::img")private WebElement Users_Module;
	@FindBy(xpath="//div[text()='Work Schedule']/following-sibling::img")private WebElement Works_Schedule_Module;
	@FindBy(xpath="//div[text()='Settings']/following-sibling::img")private WebElement Settings_Module;
	
	
	
	//Initialization
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	//getter setter methods
	
	
	
	
	//operational methods
	public void click_on_Time_Track_Module()
	{
		timeTrack.click();
		
	}
	public void click_On_Task_Module()
	{
		TaskModule.click();
		
	}
	public void click_on_Reports_Module()
	{
		Reports_Module.click();
		
	}
	public void click_on_Users_Module()
	{
		Users_Module.click();
		
	}
	public void click_on_Work_Schedule_Module()
	{
	Works_Schedule_Module.click();	
		
	}
	public void click_on_Settings_Module()
	{
		
		Settings_Module.click();
	}
	
}