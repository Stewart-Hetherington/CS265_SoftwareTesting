package cs265;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.DataProvider;

public class CS265_Lab1TestUsingDataProvider {

	private static Object [][] testData = new Object [][] {
		// TestId        int a       int b    expectedValue
		{"method1_T1",     35,        10,       70 },
		{"method1_T2",      5,         6,       30 },
		{"method1_T3",      3,        10,       30 },
		{"method1_T4",      1,         5,        5 },
		{"method1_T5",      7,         5,       35 },
		//Test to fail.
		{"method1_T6",      3,         5,      100 },
		//Extra Branch Coverage Tests to achieve 100% Coverage of Method1().
		{"method1_BC7",    101,      101,       -1 },
		{"method1_BC8",      0,        0,       -1 },
		{"method1_BC9",     20,      101,       -1 },
		{"method1_BC10",    20,        0,       -1 },
	};
  
	@DataProvider(name="EPTesting")
	public Object[][] getTestData() {
		return testData;
	}
	
	@Test(dataProvider="EPTesting")
	public void test_Method1(String id, int a, int b, int expectedValue) {
		AssertJUnit.assertEquals(expectedValue,CS265_Lab1.method1(a, b) );
	}
}
