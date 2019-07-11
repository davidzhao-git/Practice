package practice.data.structures;

import java.util.HashMap;
import java.util.Map;

public class DogObjectMap {

	public static void main(String[] args) {
		
		// key = Integer
		// value = Dog objects
		Map<Integer, Dog> dogMap = new HashMap<Integer, Dog>();
		dogMap.put(1, new Dog("Bobby", 30.0));
		dogMap.put(2, new Dog("Sammy", 25.6));
		dogMap.put(3, new Dog("Mike", 37.2));		// this replace the previous value
		
		for (Map.Entry<Integer, Dog> entry : dogMap.entrySet()) {
			System.out.println("Key: " + entry.getKey() + ", Value(Dog's name) " +
								entry.getValue().getName() + " weight is " + 
								entry.getValue().getWeight()); 
		}
		
		System.out.print(dogMap.keySet());
		// System.out.print(dogMap.values());
		
	}
}
