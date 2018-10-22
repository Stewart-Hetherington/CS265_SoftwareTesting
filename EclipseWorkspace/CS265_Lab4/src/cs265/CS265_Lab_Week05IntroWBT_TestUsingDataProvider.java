package cs265;

import org.testng.AssertJUnit;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CS265_Lab_Week05IntroWBT_TestUsingDataProvider {
	
	private static Object[][] testData = new Object[][] {
	      //  test, bonuspoints, goldCustomer, expected output
	      { "T1.1",         null,        false },
	      { "T1.2",         "abba",       true },
	      { "T1.3",         "",          false },
	      { "T1.4",         "A A",       false },
	      { "T2.1",         "abbaBaby",  false },
	   };

	   @DataProvider(name="ep_bva_comb")
	   public Object[][] getTestData() {
	      return testData;
	   }

	   @Test(dataProvider="ep_bva_comb")
	   public void test_giveDiscount( String id, String palindrome, boolean isPalindrome) {
	      equals(CS265_Lab_Week05_IntroWBT.isPalindrome(palindrome));
	   }
}
	
