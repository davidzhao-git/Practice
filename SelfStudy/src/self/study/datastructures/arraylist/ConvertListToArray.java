package self.study.datastructures.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ConvertListToArray {

	public static void main(String[] args) {

		int[] nums = {1,2,3,4};
		int i = 0;
		int j = 1;

		List<Integer> list = new ArrayList<>();
		while (j < nums.length) {
			int counter = nums[i];
			for (int k = 0; k < counter; k++) {
				list.add(nums[j]);
			}

			i += 2;
			j += 2;
		}
		
		
		

	}

}
