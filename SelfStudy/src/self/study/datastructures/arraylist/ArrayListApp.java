package self.study.datastructures.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListApp {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(9);
		list.add(10);
		list.add(9);
		list.add(1);
		list.add(3);
		list.add(10);
		
		Collections.sort(list, Collections.reverseOrder());
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " "); 
		}
		System.out.println(); 
		list = list.subList(0, 2);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " "); 
		}
		
		List<Character> charList = new ArrayList<>(); 
		
		charList.add('a');
		charList.add('b');
		charList.add('c');
		charList.add('d');
	
//		System.out.println(charList.get(1));
//		charList.remove(1);
//		System.out.println(charList.get(1));
		
		
		
		
		

		
	}

}
