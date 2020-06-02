package tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGTest {
  SoftAssert softAssert=new SoftAssert();
	@Test(dataProvider = "dp", priority=1, dependsOnMethods="test2", groups="sanity")
  public void test1(Integer n, String s) {
 System.out.println("test1");
 softAssert.assertEquals("abc", "abc");
 softAssert.assertAll();
 
	}
  
  @Test(priority=2, groups="sanity")
  public void test2() {
 System.out.println("test2");
 softAssert.assertTrue(true);
 softAssert.assertAll();
  }
  
  @Test(priority=3, groups="smoke")
  public void test3() {
 System.out.println("test3");
 boolean b=false;
 softAssert.assertEquals(true, b);
 softAssert.assertAll();
  }
  
  @Test(priority=4, groups="smoke")
  public void test6() {
 System.out.println("test6");
 boolean b=true;
 softAssert.assertEquals(true, b);
 softAssert.assertAll();
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after method");
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After suite");
  }

}
