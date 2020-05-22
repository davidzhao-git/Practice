package self.study.polymorphism;

public class AnimalApp {
	
	public static void main(String[] args) {
		
		Animal animal1 = new Animal();
		animal1.sound();
		
		Animal animal2 = new Dog();
		animal2.sound();
		
		Dog animal3 = new Dog();
		animal3.sound();
		animal3.sound(10);
		animal3.sound(20, 30);
	}

}
