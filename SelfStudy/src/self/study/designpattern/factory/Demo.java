package self.study.designpattern.factory;

public class Demo {

	public static void main(String[] args) {
	
		ShapeFactory shapeFactory = new ShapeFactory(); 
				
		Shape shape1 = shapeFactory.getShape("circle");
		shape1.draw();
		
		Shape shape2 = shapeFactory.getShape("rectangle");
		shape2.draw();
	
		AdminFactory adminFactory = new AdminFactory();
		User user1 = adminFactory.createUser();
		user1.printUserType();
		
		BrokerFactory brokerFactory = new BrokerFactory();
		User user2 = brokerFactory.createUser(); 
		user2.printUserType();
		
		System.out.println(user1);
		System.out.println(user2);

	}

}
