package self.study.designpattern.factory;

public class ShapeFactory {
	
	public Shape getShape(String shapeType) {
		
		if (shapeType == null) {
			return null; 
		}
		
		if (shapeType.equalsIgnoreCase("Circle")) {
			return new Circle(); 
		}
		else if (shapeType.equalsIgnoreCase("Rectangle")) {
			return new Rectangle(); 
		}
		else {
			System.out.println("Invalid Shape");
		}
		return null;
	}
}
