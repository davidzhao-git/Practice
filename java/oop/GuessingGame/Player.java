public class Player {
	
	private int number = 0;

	public void guess() {
		number = (int) (Math.random() * 10);
		System.out.println("I am guessing " + number);
	}

	public int getGuessedNumber() {
		return number;
	}
}