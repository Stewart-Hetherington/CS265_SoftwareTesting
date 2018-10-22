package cs265;

import org.testng.AssertJUnit;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CS265_Lab_Week05IntroWBTTest {
	
	@Test
	  public void SC_test1() {
		   boolean expectedValue = false;
		   
		  AssertJUnit.assertEquals(expectedValue,CS265_Lab_Week05_IntroWBT.isPalindrome(null));
	  }
	@Test
	  public void SC_test2() {
		   boolean expectedValue = true;
		   
		  AssertJUnit.assertEquals(expectedValue,CS265_Lab_Week05_IntroWBT.isPalindrome("Abba"));
	  }
	@Test
	  public void SC_test3() {
		   boolean expectedValue = false;
		   
		  AssertJUnit.assertEquals(expectedValue,CS265_Lab_Week05_IntroWBT.isPalindrome(""));
	  }
	@Test
	  public void SC_test4() {
		   boolean expectedValue = false;
		   
		  AssertJUnit.assertEquals(expectedValue,CS265_Lab_Week05_IntroWBT.isPalindrome("A A"));
	  }
	// Branch Test 1 for Line 44 if-else statement
	@Test
	  public void BC_test5() {
		   boolean expectedValue = false;
		   
		  AssertJUnit.assertEquals(expectedValue,CS265_Lab_Week05_IntroWBT.isPalindrome("Abbababy"));
	  }
}
