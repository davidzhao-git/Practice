package self.study.inheritance;

public class BikeApp {

	public static void main(String[] args) {
		
		Bicycle mountainBike1 = new MountainBike(10, 20, 5);
		
//		System.out.println(mountainBike1);
		System.out.println("calling parent's methods\n" + "Gear " + mountainBike1.getGear() + " Speed " + mountainBike1.getSpeed());		
		
		if (mountainBike1 instanceof MountainBike) {
			System.out.println("downcasting... seat height " + ((MountainBike) mountainBike1).getSeatHeight());
		}

		MountainBike mountainBike2 = new MountainBike(12, 22, 6);		
//		System.out.println(mountainBike2);
		System.out.println("\ncalling parent's methods\n" + "Gear " + mountainBike2.getGear() + " Speed " + mountainBike2.getSpeed());		
		System.out.println("Do NOT need to downcas... seat height " + mountainBike2.getSeatHeight());
		
	}

}
