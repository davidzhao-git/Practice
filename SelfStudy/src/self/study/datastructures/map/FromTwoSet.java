package self.study.datastructures.map;

import java.util.HashMap;
import java.util.Map;

public class FromTwoSet {

	public static void main(String[] args) {
		
		Map<Integer, Integer> map = new HashMap<>();
		
		map.put(1, 10);
		map.put(2, 15);
		map.put(3, 10);
		
		Map<Integer, Integer> map2 = new HashMap<>();
		
		map2.put(4, 1);
		map2.put(5, 15);
		map2.put(6, 14);
		
		for (Map.Entry mapElement : map.entrySet()) { 
			System.out.println(mapElement.getValue());
		}
		System.out.println(".....................................");
		
		boolean match = map.containsValue(map2.get(5));
		if (match) {
			map.values().remove(map2.get(5));
		}
		
		for (Map.Entry mapElement : map.entrySet()) { 
			System.out.println(mapElement.getValue());
		}

	}

}
