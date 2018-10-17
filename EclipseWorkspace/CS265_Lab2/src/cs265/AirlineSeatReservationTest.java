package cs265;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class AirlineSeatReservationTest {

	 @Test
	  public void seatsAvailable_test1() {
		   boolean expectedValue = false;
		   
		  AssertJUnit.assertEquals(expectedValue,AirlineSeatReservation.seatsAvailable(50,75));
	  }
	  @Test
	  public void seatsAvailable_test2() {
		  boolean expectedValue = true;
		   
		  AssertJUnit.assertEquals(expectedValue,AirlineSeatReservation.seatsAvailable(50,25));
	  }
	  @Test
	  public void seatsAvailable_test3() {
		  boolean expectedValue = false;
		   
		  AssertJUnit.assertEquals(expectedValue,AirlineSeatReservation.seatsAvailable(-100,25));
	  }
	  //test to fail.
	  @Test
	  public void seatsAvailable_test4() {
		  boolean expectedValue = false;
		   
		  AssertJUnit.assertEquals(expectedValue,AirlineSeatReservation.seatsAvailable(200,25));
	  }
	  @Test
	  public void seatsAvailable_test5() {
		  boolean expectedValue = false;
		   
		  AssertJUnit.assertEquals(expectedValue,AirlineSeatReservation.seatsAvailable(50,-100));
	  }
	  @Test
	  public void seatsAvailable_test6() {
		  boolean expectedValue = false;
		   
		  AssertJUnit.assertEquals(expectedValue,AirlineSeatReservation.seatsAvailable(50,200));
	  }
}
