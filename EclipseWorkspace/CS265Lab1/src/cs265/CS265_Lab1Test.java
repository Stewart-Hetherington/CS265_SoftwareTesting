package cs265;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

//All tests are set to pass except for method1_Test6()

public class CS265_Lab1Test {

	  @Test
	  public void method1_test1() {
		   int expectedValue = 70;
		   
		  AssertJUnit.assertEquals(expectedValue,CS265_Lab1.method1(35,10));
	  }
	  @Test
	  public void method1_test2() {
		   int expectedValue = 30;

		  AssertJUnit.assertEquals(expectedValue,CS265_Lab1.method1(5,6));
	  }
	  @Test
	  // Test to fail.
	  public void method1_test3() {
		   int expectedValue = 100;

		  AssertJUnit.assertEquals(expectedValue,CS265_Lab1.method1(3,10));
	  }
	  @Test
	  public void method1_test4() {
		   int expectedValue = 5;

		  AssertJUnit.assertEquals(expectedValue,CS265_Lab1.method1(1,5));
	  }
	  @Test
	  public void method1_test5() {
		   int expectedValue = 35;

		  AssertJUnit.assertEquals(expectedValue,CS265_Lab1.method1(7,5));
	  }
	  // Test to fail.
	  @Test
	  public void method1_test6() {
		   int expectedValue = 18;

		  AssertJUnit.assertEquals(expectedValue,CS265_Lab1.method1(3,6));
	  }
	  public void method2_test6() {
		   int expectedValue = 1;
		   String[] myStringArray = {"a","b","c"};
		  AssertJUnit.assertEquals(expectedValue,CS265_Lab1.method2(myStringArray, "a"));
	  }
}
