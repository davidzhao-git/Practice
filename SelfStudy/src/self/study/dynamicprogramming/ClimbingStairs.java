package self.study.dynamicprogramming;

public class ClimbingStairs {

	public static void main(String[] args) {
		
		int num = 6;
		int result = climbStairs(num);
	}

	public static int climbStairs(int n) {

		int size = n + 1;
		int[] arr = new int[size];

		arr[0] = 1;
		arr[1] = 1;

		for (int i = 2; i < size; i++) {
			arr[i] = 0;
			for (int j = 1; j <= 2 && j <= i; j++) {
				arr[i] += arr[i - j];
				System.out.println("arr[" + i + "]" + arr[i]);
			}
		}

		return arr[n];
	}

}
