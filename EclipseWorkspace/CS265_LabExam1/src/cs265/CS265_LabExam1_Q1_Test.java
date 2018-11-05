package cs265;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

public class CS265_LabExam1_Q1_Test {
	
	private static Object[][] testData = new Object[][] {
		{"T1", -1073941824, "INVALID" },
		{"T2", 30, "THANK YOU"},
		{"T3", 70, "SLOW DOWN"},
		{"T4", 1073941824, "TOO FAST"},
		{"T2.1", -2147483648, "INVALID" },
		{"T2.2", -1, "INVALID"},
		{"T2.3", 0, "THANK YOU"},
		{"T2.4", 60, "THANK YOU"},
		{"T2.5", 61, "SLOW DOWN" },
		{"T2.6", 80, "SLOW DOWN"},
		{"T2.7", 81, "TOO FAST"},
		{"T2.8", 147483648, "TOO FAST"}
	};
	@DataProvider (name = "EP")
	public Object[][] getTestData() {
		return testData;
	}
	@Test(dataProvider = "EP")
	public void test_speed (String id, int speed, String expectedValue) {
		AssertJUnit.assertEquals(expectedValue, CS265_LabExam1_Q1.speedMonitor(speed) );
	}
}
