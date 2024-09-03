package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Remo {
  @Test
  public void method1() {
	  Reporter.log("Method1 of Remo",true);
  }
  @Test
  
  public void method2()
  {
	  Reporter.log("Method2 of Remo",true);

  }
}
