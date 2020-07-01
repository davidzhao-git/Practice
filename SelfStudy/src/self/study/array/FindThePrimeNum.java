package self.study.array;

import java.util.ArrayList;
import java.util.List;

public class FindThePrimeNum {

	public static void main(String[] args) {
		// int[] arr = {10,20,-22,0,1,33,11,5,7,98,97};
		
		int[] arr = {10,11,12,13,14,15,16,17,18,19,20}; 
		List<Integer> myList = isPrimeList(arr);
		System.out.println(myList); 
		
		int[] arr2 = new int[100];
		for (int j = 1; j <= 100; j++) {
			arr[j-1] = j;
		}
		
		
	}
	
	public static boolean isPrime(int num) {
		if (num < 2) {
			return false; 
		}
		for (int i = 2; i <= num/2; i++) {
			if (num % i == 0) {
				return false; 
			} 
		}
		return true;
	}
	
	public static List<Integer> isPrimeList(int[] arr) {
		List<Integer> list = new ArrayList<>(); 
		for (int i : arr) {
			boolean found = isPrime(i);
			if (found) {
				list.add(i); 
				System.out.println(i + " is prime"); 
			}
		}
		return list;
	}
	
}
