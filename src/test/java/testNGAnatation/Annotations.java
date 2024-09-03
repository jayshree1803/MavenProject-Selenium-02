package testNGAnatation;

import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
  @Test
  public void anntation_method() {
	  Reporter.log("Test Annotation",true);  
	  }
  @BeforeMethod
  public void annotation_BeforeMethod()
  {
	  Reporter.log("BeforeMethod",true);  
  }
  @BeforeClass
  public void annotation_BeforeClass()
  {
	  Reporter.log("BeforeClass",true);
  }
  @BeforeTest
  public void annotation_BeforeTest()
  {
	  Reporter.log("BeforeTest",true);
  }
  @BeforeSuite
  public void annotation_BeforeSuite()
  {
	  Reporter.log("BeforeSuite",true);
  }
  @AfterSuite
  public void annotation_AfterSuite()
  {
	  Reporter.log("BeforeSuite",true);
  }

}
