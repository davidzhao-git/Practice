package self.study.bitwise.operator;

public class FindComplement {

	public static void main(String[] args) {
		
		int num = 10;
		int result = complement(num); 
		System.out.println("result: " + result);

	}
	
	public static int complement(int num) {
		
		int temp = 1; 
		
		for (int i = num; i != 0; i /= 2) {
			temp *= 2;
			System.out.println(temp);
		}
		
		return temp - num - 1; 
	}

}
