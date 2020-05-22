package self.study.sorting;

public class BubbleSort {

	public static void main(String[] args) {
	
		int[] intArr = {10, 9, 7, 101, 23, 44, 12, 78, 34, 23};
		
		int temp; 
		
		for (int i = 0; i < intArr.length; i++) {
			for (int j = 0; j < intArr.length; j++) {
				if (intArr[i] < intArr[j]) {
					temp = intArr[i];
					intArr[i] = intArr[j];
					intArr[j] = temp;
				}
			}
		}
		
		System.out.println("Sorted Array...");
		for (int element : intArr) {
			System.out.print(element + " ");
		}

	}

}
