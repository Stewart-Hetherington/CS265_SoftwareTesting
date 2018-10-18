package cs265;

public class CS265_Lab_Week04 {

	public int equipmentInsurance(boolean sportsEquipment, boolean musicEquipment){
		int insurance;
		if (sportsEquipment && musicEquipment){
			insurance = 20;
		} else {
			if (sportsEquipment || musicEquipment){
				insurance = 10;
			} else {
				insurance = 5;
			}
		}
		return insurance;
	}
	
	public double saleRate(int quantity, boolean cashPayment, boolean wholesale){
		double discount = 0.00;
		if (quantity < 50){
			if (cashPayment && wholesale){
				discount = 0.04;
			} else {
				if (cashPayment || wholesale){
					discount = 0.02;
				}
			}
		} else {
			discount = 0.04;
			if (cashPayment || wholesale){
				discount  = discount + 0.02;
			}
		}
		return discount;
	}
	
	public static String doMoodleLogon(String username, String password, boolean isStudent){
		String action = null;
		if ((username == null)|| (password == null)){
			action = "UNKNOWN";
		} else if ((username.length() <= 0) || (password.length() <= 0)){
			action = "UNKNOWN";
		} else {
			// if the username matches the pattern of a valid username
			// if the password matches the pattern of a valid password
			// as outlined in the specification. 
			if ((username.matches("[_A-Za-z0-9\\.]{4,}@nuim.ie"))  && (password.matches("[A-Za-z0-9]{5,}"))){
				// check the status of the isStudent variable
				// this will have to be considered if the username and password are valid. 
				if (isStudent){
					action = "STUDENT PAGE";
				} else {
					action = "STAFF PAGE";
				}
			} else { // invalid formatted string for username and/or password
				action = "UNKNOWN";
			}
		}
			
		return action;
	}
}
