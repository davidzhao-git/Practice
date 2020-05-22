package self.study.constructor;

public class UserApp {

	public static void main(String[] args) {
	
		User user = new User();
		System.out.println(user.getFirstName() + " " + user.getLastName());

		Admin admin = new Admin();
		System.out.println(admin.getFirstName() + " " + admin.getLastName());
		
		
	}

}
