package self.study.enumstudy;

public class EnumApp {

	public static void main(String[] args) {
		
		Color red = Color.RED;
		System.out.println(red.name());

		for (Color color : Color.values()) {
			System.out.println(color);
		}
		
		
	}

}
