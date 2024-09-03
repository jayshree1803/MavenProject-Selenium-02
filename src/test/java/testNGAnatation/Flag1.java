package testNGAnatation;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1 {
  @Test(description="flag1",enabled = true)
  public void method() {
	  Reporter.log("method for flag",true);
  }
  @Test(description="flag1",enabled = true)
  public void method1() {
	  Reporter.log("method for flag",true);
  }
  @Test(description="flag1",enabled = false)
  public void method2() {
	  Reporter.log("method for flag",true);
  }

  
}
