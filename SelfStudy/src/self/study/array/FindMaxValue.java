package self.study.array;

public class FindMaxValue {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 55, 0, -1, 39};
		// int[] arr = {};
		
		System.out.println(findMax(arr));

	}
	
	public static int findMax(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
}
