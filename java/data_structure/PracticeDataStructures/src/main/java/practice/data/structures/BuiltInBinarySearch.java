package practice.data.structures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BuiltInBinarySearch {

	public static void main(String[] args) {
		
		int[] arr = {20, 1, 0, -2, 100, 40, 55, 7};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		int key = 55;
		int result = Arrays.binarySearch(arr, key);		// find the index location
		if (result >= 0) {
			System.out.println("found the number at position " + result);
		} else {
			System.out.println("number is not found");
		}
		
		
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("Hello");
		myList.add("Good Morning");
		myList.add("Good Bye");
		myList.add("ABC");
		Collections.sort(myList);
		System.out.println(myList);
		
		String str = "Good Bye";
		int strResult = Collections.binarySearch(myList, str);	
		if (strResult >= 0) {
			System.out.println("found the word at position " + strResult);
		} else {
			System.out.println("word is not found");
		}
	}

}
