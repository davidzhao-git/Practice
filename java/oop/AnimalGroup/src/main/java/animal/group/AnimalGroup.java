package animal.group;

public class AnimalGroup {
	
	public static void main(String[] args) {
		
		// Dove ginger = new Dove("Ginger");
		// ginger.fly(30., 20.);
		Animal ginger = new Dove("Ginger");
		((Dove)ginger).fly(25.5, 20.2);
		ginger.makeNoise();
		ginger.sleep();
		System.out.println(ginger.getName());
	}
}
