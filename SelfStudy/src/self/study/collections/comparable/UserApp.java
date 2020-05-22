package self.study.collections.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserApp {

	public static void main(String[] args) {
		
		List<User> userList = new ArrayList<User>();
		userList.add(new User("Ken", "Lin", 19));
		userList.add(new User("Jack", "Man", 8));
		userList.add(new User("Mike", "Chen", 76));
		userList.add(new User("Lisa", "Yun", 30));

		for (User user : userList) {
			System.out.println(user.getFirstName() + " " + user.getLastName() + " " + user.getAge());
		}

		Collections.sort(userList);

		System.out.println(); 
		for (User user : userList) {
			System.out.println(user.getFirstName() + " " + user.getLastName() + " " + user.getAge());
		}
		
		Collections.sort(userList, Collections.reverseOrder());
		System.out.println(); 
		for (User user : userList) {
			System.out.println(user.getFirstName() + " " + user.getLastName() + " " + user.getAge());
		}
		
	}

}
