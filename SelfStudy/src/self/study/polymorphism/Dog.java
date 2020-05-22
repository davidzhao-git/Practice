package self.study.polymorphism;

public class Dog extends Animal {
	
	@Override
	public void sound() {
		System.out.println("Sound from Dog");
	}

	public void sound(int volume) {
		System.out.println("High Volume : " + volume + " WOLF from Dog");
	}
	
	public void sound(int volume1, int volume2) {
		System.out.println("Very High Volume : " + (volume1+volume2) + " WOLF from Dog");
	}
}
