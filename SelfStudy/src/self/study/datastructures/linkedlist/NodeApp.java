package self.study.datastructures.linkedlist;

public class NodeApp {

	public static void main(String[] args) {

		ListNode head = new ListNode(9);

		ListNode head1 = new ListNode(1);
		ListNode head2 = new ListNode(9);
		ListNode head3 = new ListNode(9);
		ListNode head4 = new ListNode(9);
		ListNode head5 = new ListNode(9);
		ListNode head6 = new ListNode(9);
		ListNode head7 = new ListNode(9);
		ListNode head8 = new ListNode(9);
		ListNode head9 = new ListNode(9);
		ListNode head10 = new ListNode(9);
		
		head1.next = head2;
		head2.next = head3;
		head3.next = head4;
		head4.next = head5;
		head5.next = head6;
		head6.next = head7;
		head7.next = head8;
		head8.next = head9;
		head9.next = head10;
		

		long multiplier1 = 1;
		long sum1 = 0;

		long multiplier2 = 1;
		long sum2 = 0;

		while (head != null) {
			sum1 += head.val * multiplier1;
			head = head.next;
			multiplier1 *= 10;
		}

		while (head1 != null) {
			sum2 += head1.val * multiplier2;
			head1 = head1.next;
			multiplier2 *= 10;
		}

		long sumOfTwo = sum1 + sum2;
		System.out.println(sumOfTwo);
		
		long length = Long.toString(sumOfTwo).length();

		System.out.println(length);
		long[] numArr = new long[(int) length];

		int i = 0;
		while (sumOfTwo != 0) {
			long remainder = sumOfTwo % 10;
			numArr[i] = remainder;
			sumOfTwo = sumOfTwo / 10;
			i++;
		}
		
		for (long num : numArr) {
			System.out.print(num + " ");
		}
		
		ListNode currentHead = new ListNode((int) numArr[0]); 
        ListNode currentNode = currentHead; 
        
        System.out.println("\nloop..."); 
		for (int j = 1; j < length; j++) {
            ListNode node = new ListNode((int) numArr[j]); 
            System.out.println(node.val);
            currentNode.next = node; 
            currentNode = node; 
            
        }
		System.out.println("\npinrt all\n");
		while (currentHead != null) {
			System.out.print(currentHead.val + " ");
			currentHead = currentHead.next;
		}
		
		
	}

}
