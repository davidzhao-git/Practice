package self.study.search;

public class SearchRotatedSortedArray {

	public static void main(String[] args) {
		
//		int[] nums = {2,3,4,5,6,7,-2,-1,0};
		int[] nums = {5,6,7,-2,-1,0,1,2,3,4};
		int target = 6;
		
		int result = search(nums, target);
		System.out.println(result);

	}

	public static int search(int[] nums, int target) {
		
		int left = 0;
		int right = nums.length - 1;
		
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (nums[mid] >= nums[0]) {
				if (target > nums[0]) {
					if (target > nums[mid]) {
						left = mid + 1;
					}
					else if (target < nums[mid]) {
						right = mid - 1;
					}
					else {
						return mid;
					}
				} 
				else if (target < nums[0]) {
					left = mid + 1;
				}
				else {
					return 0;
				}
			} 
			else {
				if (target > nums[0]) {
					right = mid - 1;
				}
				else if (target < nums[0]) {
					if (target < nums[mid]) {
						right = mid - 1;
					}
					else if (target > nums[mid]) {
						left = mid + 1;
					}
					else {
						return mid;
					}

				} 
				else {
					return 0;
				}
			}
		}
		return -1;
	}
}
