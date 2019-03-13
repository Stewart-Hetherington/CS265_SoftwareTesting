package cs335;

import java.util.ArrayList;

public class TestPrototypePattern {

	public static void main(String[] args) {
		
		ArrayList<User> users = new ArrayList<User>();
		
		AccessControl userAccessControl = AccessControlProvider.getAccessControlObject("USER");
		User user = new User("User A", "USER Level", userAccessControl);
		users.add(user);
		System.out.println("************************************");
		System.out.println(user);
		
		userAccessControl = AccessControlProvider.getAccessControlObject("USER");
		user = new User("User B", "USER Level", userAccessControl);
		users.add(user);
		System.out.println("Changing access control of: "+user.getUserName());
		user.getAccessControl().setAccess("READ REPORTS");
		System.out.println(user);
		
		System.out.println("************************************");
		
		AccessControl managerAccessControl = AccessControlProvider.getAccessControlObject("MANAGER");
		user = new User("User C", "MANAGER Level", managerAccessControl);
		users.add(user);
		System.out.println(user);
		
		System.out.println("************************************");
		// Create a new class of AccessContorl for SuperUser 
		AccessControl superUserAccessControl = AccessControlProvider.getAccessControlObject("SUPERUSER");
		// Create new User with SUPERUSER level access
		user = new User("MegaBoss", "SUPERUSER Level", superUserAccessControl);
		users.add(user);
		System.out.println("Changing access control of: "+user.getUserName());
		System.out.println(user);
		
		System.out.println("************************************");
		// loop through list + if statement 
		for (int i = 0; i < users.size(); i++) {
			if( users.get(i).getLevel() == "SUPERUSER Level") {
				System.out.println(users.get(i).getUserName() + " is a SUPERUSER and he is watching you all.");
				System.out.println("For SUPERUSER'S EYES ONLY");
				users.forEach( (e) -> System.out.println(e) );
			}
		} 
	}
}