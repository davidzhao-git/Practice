package ShapeExample;

public class Square extends Shape {
	
	private double side;
	
	public Square(String name, double side) {
		super(name);
		this.side = side;
	}

	public double area() {
		return side * side;
	}
}
