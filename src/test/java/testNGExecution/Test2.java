package testNGExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
	  @Test
	  public void method1() {
		  Reporter.log("Method1 of Test2",true);
	  }
	  @Test
	  
	  public void method2()
	  {
		  Reporter.log("Method2 of Test2",true);

	  }
	}
