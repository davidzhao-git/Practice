package practice.data.structures;

import java.util.HashSet;

public class SampleHashSet {

	public static void main(String[] args) {
		
		HashSet<String> hSet = new HashSet<String>();

		hSet.add("USA");
		hSet.add("China");
		hSet.add("India");
		hSet.add("USA");
		System.out.println(hSet);
		
		hSet.remove("China");
		System.out.println(hSet);
	}
}
