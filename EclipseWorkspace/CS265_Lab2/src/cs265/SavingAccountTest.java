package cs265;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class SavingAccountTest {

	//BVA Testing.

	 @Test
	  public void deposit_test1() {
		   double expectedValue = 0.03;
		   
		  AssertJUnit.assertEquals(expectedValue,SavingAccount.discountRate(1),0.0001);
	  }
	 @Test
	  public void deposit_test2() {
		   double expectedValue = 0.03;
		   
		  AssertJUnit.assertEquals(expectedValue,SavingAccount.discountRate(100),0.0001);
	  }
	 @Test
	  public void deposit_test3() {
		   double expectedValue = 0.05;
		   
		  AssertJUnit.assertEquals(expectedValue,SavingAccount.discountRate(101),0.0001);
	  }
	 @Test
	  public void deposit_test4() {
		   double expectedValue = 0.05;
		   
		  AssertJUnit.assertEquals(expectedValue,SavingAccount.discountRate(1000),0.0001);
	  }
	 @Test
	  public void deposit_test5() {
		   double expectedValue = 0.07;
		   
		  AssertJUnit.assertEquals(expectedValue,SavingAccount.discountRate(1001),0.01);
	  }
	 @Test
	 public void deposit_test6() {
		   double expectedValue = 0.00;
		   
		  AssertJUnit.assertEquals(expectedValue,SavingAccount.discountRate(-2147483648),0.01);
	  }
	 @Test
	 public void deposit_test7() {
		   double expectedValue = 0.00;
		   
		  AssertJUnit.assertEquals(expectedValue,SavingAccount.discountRate(0),0.01);
	  }
	 @Test
	 public void deposit_test8() {
		   double expectedValue = 0.07;
		   
		  AssertJUnit.assertEquals(expectedValue,SavingAccount.discountRate(2147483647),0.01);
	  }
}
