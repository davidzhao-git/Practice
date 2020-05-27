package self.study.dynamicprogramming;

public class UglyNumber {

	public static void main(String[] args) {
	
		// Example: 10th ugly number is 12, 
		// because first 10 ugly numbers are 1, 2, 3, 4, 5, 6, 8, 9, 10, 12.
		int n = 10; 
        System.out.println(getNthUglyNumber(n)); 

	}
	
	public static int getNthUglyNumber(int num) {
		int[] ugly = new int[num];
		int i2 = 0, i3 = 0, i5 = 0;
		
		int next_multiple_of_2 = 2; 
		int next_multiple_of_3 = 3;
		int next_multiple_of_5 = 5; 
		
		int next_ugly_num = 1; 
		
		ugly[0] = 1; 
		
		for (int i = 1; i < num; i++) {
			next_ugly_num = Math.min(next_multiple_of_2, 
                            Math.min(next_multiple_of_3, next_multiple_of_5)); 
			
			ugly[i] = next_ugly_num;
			
			if (next_ugly_num == next_multiple_of_2) {
				i2++; 
	            next_multiple_of_2 = ugly[i2]*2; 
			}
			if (next_ugly_num == next_multiple_of_3) {
				i3++; 
				next_multiple_of_3 = ugly[i3]*3; 
			}
			if (next_ugly_num == next_multiple_of_5) {
				i5++; 
				next_multiple_of_5 = ugly[i5]*5; 
			}
		}
        return next_ugly_num; 
	}

}
