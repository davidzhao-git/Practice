package practice.data.structures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BuiltInSorting {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, -4, 2, 66, 100, 87};
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("Hello");
		myList.add("Good Morning");
		myList.add("Good Bye");
		myList.add("ABC");
		System.out.println(myList);
		Collections.sort(myList);
		System.out.println(myList);
	}

}
