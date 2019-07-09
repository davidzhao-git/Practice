package animal.group;

public class Dove extends Animal implements BirdMotion {

	public Dove(String name) {
		super(name);
		
	}

	// implement the method from interface 
	public void fly(double speed, double distance) {
		System.out.println("speed is " + speed + " distance " + distance);
	}
	
	// override the method from abstract class 
	@Override
	public void makeNoise() {
		System.out.println("Cooling");
	}

	
}
