package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	@Test
	  public void method1() {
		  Reporter.log("Method1 of Demo",true);
	  }
	  @Test
	  
	  public void method2()
	  {
		  Reporter.log("Method2 of Demo",true);

	  }
	}
