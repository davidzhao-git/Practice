package ShapeExample;

public class ShapeApp {
	public static void main(String[] args) {
		
		Circle circle = new Circle("circle", 10);
		System.out.println("Area for " + circle.getName() + " is " + circle.area());
		
		Square square = new Square("square", 20);
		System.out.println("Area for " + square.getName() + " is " + square.area());
	}
}
