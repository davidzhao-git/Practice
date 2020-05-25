package self.study.datastructures.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListApp {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		List<Character> charList = new ArrayList<>(); 
		
		charList.add('h');
		charList.add('b');
		charList.add('u');
		charList.add('e');
	
		System.out.println(charList.get(1));
		charList.remove(1);
		System.out.println(charList.get(1));
		

		
	}

}
