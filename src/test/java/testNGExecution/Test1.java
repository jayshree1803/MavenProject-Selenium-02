package testNGExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;
public class Test1 {
	  @Test
	  public void method1() {
		  int a=10;
		  int b=1;
		  int res=(a/b);
		  Reporter.log("method of Test1",res);
	  }
	  @Test
	  
	  public void method2()
	  {
		  Reporter.log("Method2 of Test1",true);

	  }
	}
