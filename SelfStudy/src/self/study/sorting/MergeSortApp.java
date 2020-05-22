package self.study.sorting;

public class MergeSortApp {

	public static void main(String[] args) {
	
		int[] arr1 = {10, 8, 6, 5, 7, 3, 4};
		int[] arr2 = {14, 7, 3, 12, 9, 11, 6, 2};
		
//		print(arr1);
		mergeSort(arr1, arr1.length);
		print(arr1);
		
//		print(arr2);
//		mergeSort(arr2, arr2.length);
//		print(arr2);
		
	}

	public static void print(int[] arr) {
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
	
	public static void mergeSort(int[] arr, int length) {
		if (length < 2) {
			return; 
		}
		
		int mid = length / 2; 
		int[] leftArr = new int[mid];
		int[] rightArr = new int[length-mid];
		
		for (int i = 0; i < mid; i++) {
			leftArr[i] = arr[i];
		}
		
		for (int j = mid; j < length; j++) {
			rightArr[j-mid] = arr[j];
		}
		
		System.out.println("print left: ");
		print(leftArr);
		
		mergeSort(leftArr, mid);
		
		System.out.println("print right: ");
		print(rightArr);
		
		mergeSort(rightArr, length-mid);
		
		System.out.println("print left before merge: ");
		print(leftArr);
		System.out.println("print right before merge: ");
		print(rightArr);

		merge(arr, leftArr, rightArr, mid, length-mid);
		
	}
	
	public static void merge(int[] arr, int[] leftArr, int[] rightArr, int leftLength, int rightLength) {
		
		System.out.println("inside merge function...");
		int i = 0;
		int j = 0;
		int k = 0;
		
		while (i < leftLength && j < rightLength) {
			if (leftArr[i] <= rightArr[j]) {
				arr[k] = leftArr[i];
				k++; 
				i++;
			}
			else {
				arr[k] = rightArr[j];
				k++;
				j++; 
			}
		}
		
		while (i < leftLength) {
			arr[k] = leftArr[i];
			k++;
			i++;
		}
		
		while (j < rightLength) {
			arr[k] = rightArr[j];
			k++; 
			j++;
		}
		System.out.println("merge function...print Array: ");
		print(arr);
		System.out.println("end of the merge function...\n");
		
	}
}
