package cs265;

public class AirlineSeatReservation {
	
	public static boolean seatsAvailable(int freeSeats, int seatsRequired) {
		boolean rv=false;
		if ( (freeSeats>=0) && (seatsRequired>=1) && (seatsRequired<=freeSeats) )
			rv=true;
		return rv;
	}

}
