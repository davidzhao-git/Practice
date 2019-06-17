class GuessingGame {
	public void startGame() {

		// 1. declare an array of Player class
		Player[] player = new Player[3];

		// 2. declare an object for each player in the array
		for (int i = 0; i < player.length; i++) {
			player[i] = new Player();
		}

		boolean[] playerIsRight = new boolean[player.length];

		int targetNumber = (int) (Math.random() * 10);

		System.out.println("I am thinking of a number between 0 and 9...");

		while(true) {
			System.out.println("Number to guess is " + targetNumber);
		
			// 3. call the function "guess()" for each object
			for (int i = 0; i < player.length; i++) {
				player[i].guess();
			}

			// 4. call the function "getGuessedNumber()" for each object 
			for (int i = 0; i < player.length; i++) {
				System.out.println("Player " + Integer.toString(i+1) + " guessed " + 
					player[i].getGuessedNumber());
			}

			boolean havingWinner = false; 
			for (int i = 0; i < player.length; i++) {
				if (player[i].getGuessedNumber == targetNumber) {
					playerIsRight[i] = true;
				}
				else {
					playerIsRight[i] = false;
				}

				if (!havingWinner && playerIsRight[i]) {
					havingWinner = true;
				}
			}

			if (havingWinner) {
				System.out.println("We have a winner!");
				for (int i = 0; i < player.length; i++) {
					System.out.println("Player " + Integer.toString(i+1) + " got it right? "
						+ playerIsRight[i]);
				}
				System.out.println("Game is over");
				break;
			}
			else {
				System.out.println("Players will have to try again");
			}

	}
}


