package self.study.designpattern.singleton;

public class FilingCabinet {

	// private static variable of own type
	private static FilingCabinet instance = new FilingCabinet();
	
	// private constructor
	private FilingCabinet() {
		
	}
	
	// public static getInstance() method
	public static FilingCabinet getInstance() {
		return instance;
	}
	
	public void printCabinet() {
		System.out.println("Cabinet No.1");
	}
	
}
