package user.password.hash.sample;

import java.util.HashMap;

public class UserPasswordHash{
	
	public static void main(String[] args) {
		
		HashMap<String, String> userPasswordMap = new HashMap<String, String>();
		userPasswordMap.put("klang", "34sadfo8@2");
		userPasswordMap.put("dmnia", "we4i900@abc");
		userPasswordMap.put("uamncaa", "2!unified@2");
		
		System.out.println(userPasswordMap);
		System.out.println(userPasswordMap.keySet());
		System.out.println(userPasswordMap.values());
	}
	
}
