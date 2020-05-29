package self.study.two.dimensional.array;

public class ThroughColumn {

	public static void main(String[] args) {
		
		int[][] twoDimArr = new int[3][2];

		twoDimArr[0][0] = 50;
		twoDimArr[0][1] = 20;
		twoDimArr[1][0] = 65;
		twoDimArr[1][1] = 40;
		twoDimArr[2][0] = 100;
		twoDimArr[2][1] = 22;
		
		// iterate column first and then row 
		for (int i = 0; i < twoDimArr[i].length; i++) {
			for (int j = 0; j < twoDimArr.length; j++) {
				System.out.print(twoDimArr[j][i] + " ");
			}
		}
		System.out.println("End Column First...");
	}

}
