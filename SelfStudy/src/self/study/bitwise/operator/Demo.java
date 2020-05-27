package self.study.bitwise.operator;

public class Demo {

	public static void main(String[] args) {

		int x = Integer.bitCount(1);
		int y = Integer.bitCount(11);
		int z = Integer.bitCount(17);

		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

//		int bit1 = Integer.bitCount(5);		// 0110
//		System.out.println(bit1);
//		
//		int bit2 = Integer.bitCount(0);		// 0000
//		System.out.println(bit2);
//		
//		int bit3 = Integer.bitCount(1);		// 0001
//		System.out.println(bit3);
//		
//		int bit4 = Integer.bitCount(11);	// 1110
//		System.out.println(bit4);

		// 1 ^ 4
		// 0001
		// 0100
		// result: 0101

		// ^ Returns a 1 in each bit position for
		// which the corresponding bits of either
		// but not both operands are 1s.
		System.out.println(1 ^ 4);
		System.out.println(Integer.bitCount(5));

		System.out.println((5 & 13)); // 0101 & 1101 = 0101
		// expected output: 5;

		System.out.println(Integer.parseInt("0101", 2) & Integer.parseInt("1101", 2));
		// expected output: 5;

		System.out.println((5 & 13 & 3)); // 0101 & 1101 & 0011 = 0001
		// expected output: 1;

		System.out.println((5 | 13)); // 0101 | 1101 = 1101
		// expected output: 13

		System.out.println("bit count...");
		System.out.println(Integer.bitCount(7));
		System.out.println(Integer.bitCount(10));
		System.out.println(Integer.bitCount(17));
		System.out.println(Integer.bitCount(1024));

	}

}
