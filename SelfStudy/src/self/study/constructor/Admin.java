package self.study.constructor;

public class Admin extends User {
	
	public Admin() {
		this("admin_default_first", "admin_default_last");
	}
	
	public Admin(String firstName, String lastName) {
		super(firstName, lastName);
	}

}
