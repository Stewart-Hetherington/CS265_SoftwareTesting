package cs265;

import org.testng.AssertJUnit;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CS265_LabExam1_Q2Test {
	
	private static Object[][] testData = new Object[][] {
		{"T1", null, "INVALID" },
		{"T2", "", "INVALID"},
		{"T3", "1234", "INVALID"},
		{"T4", "192.123.123.123", "LOCAL"},
		{"T5", "130.123.123.123", "EXTERNAL"},
		{"T6", "127.0.0.1", "LOCAL" },
		{"T7", "1301.123.123.123", "EXTERNAL"},
	};
	@DataProvider (name = "IPTests")
	public Object[][] getTestData() {
		return testData;
	}
	@Test(dataProvider = "IPTests")
	public void test_speed (String id, String IP, String expectedValue) {
		AssertJUnit.assertEquals(expectedValue, CS265_LabExam1_Q2.isIPAddress(IP) );
	}
}
