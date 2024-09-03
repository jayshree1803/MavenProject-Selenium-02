package testNGAnatation;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag7 {
  @Test(groups="function Test case")
  public void functionTestCase1() {
	  Reporter.log("ft1",true);
  }
  
  @Test(groups="integration Test case")
  public void integrationTestCase() {
	  Reporter.log("it1",true);
  }

  @Test(groups="Smoke Test case")
  public void smokeTestCase() {
	  Reporter.log("st1 ", true);
  }
  
  
  @Test(groups="function Test case")
  public void functionTestCase2() {
	  Reporter.log("ft2",true);
  }
  
  @Test(groups="integration Test case")
  public void integrationTestCase2() {
	  Reporter.log("it2",true);
  }

  @Test(groups="Smoke Test case")
  public void smokeTestCase2() {
	  Reporter.log("st3",true);
}
  
  @Test(groups="function Test case")
  public void functionTestCase3() {
	  Reporter.log("ft3",true);
  }
  
  @Test(groups="integration Test case")
  public void integrationTestCase3() {
	  Reporter.log("it3",true);
  }

  @Test(groups="Smoke Test case")
  public void smokeTestCase3() {
	  Reporter.log("st3 ", true);
  }
}

