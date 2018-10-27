package cs265;

// This Class uses all passing test cases from AirlineSeatReservationTest.java 
// but implements a DataProvider structure. 

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.DataProvider;

public class AirlineSeatReservationTest_DataProvider {

	private static Object [][] testData = new Object [][] {
		// TestId        freeSeats  seatsRequired    expectedValue
		{"method1_T1",     50,        75,       	false },
		{"method1_T2",     50,        25,      		 true },
		{"method1_T3",   -100,        25,      		false },
		{"method1_T4",     50,      -100,       	false },
		{"method1_T5",     50,       200,     		false },
	};
	@DataProvider(name="BVATesting")
	public Object[][] getTestData() {
		return testData;
	}
	
	@Test(dataProvider="BVATesting")
	public void test_Method1(String id, int a, int b, boolean expectedValue) {
		AssertJUnit.assertEquals(expectedValue, AirlineSeatReservation.seatsAvailable(a, b) );
	}
}
