package self.study.bitwise.operator;

public class BitwiseOperatorDemo {

	public static void main(String[] args) {

		int a = 60; 	/* 60 = 0011 1100 */
		int b = 13; 	/* 13 = 0000 1101 */

		int c = 0;
		c = a & b; 		/* 12 = 0000 1100 */
		System.out.println("a & b = " + c);

		c = a | b; 		/* 61 = 0011 1101 */
		System.out.println("a | b = " + c);

		c = a ^ b; 		/* 49 = 0011 0001 */
		System.out.println("a ^ b = " + c);

		c = ~a; 		/*-61 = 1100 0011 */
		System.out.println("~a = " + c);

		c = a << 2; 	/* 240 = 1111 0000 */
		System.out.println("a << 2 = " + c);
		
		c = a >> 2;    	/* 15 = 1111 */
	    System.out.println("a >> 2  = " + c );
	    
	    int d = 61;			/* 61 =	0011 1101 */
	    c = d >> 2;
	    System.out.println("d >> 2  = " + c );
	    
	    c = a >>> 2;      /* 15 = 0000 1111 */
	    System.out.println("a >>> 2 = " + c );

	    d = 63;				/* 63 = 0011 1111 */
	    c = d >>> 2;
	    System.out.println("d >>> 2  = " + c );

	    a = 8;
	    c = ~a; 
	    System.out.println("~a = " + c); 
//	    c = c >> 2; 
//	    System.out.println("c >> 2 " + c); 
//	    c = Math.abs(c);
//	    System.out.println("abs value " + c); 

	    
	}

}
