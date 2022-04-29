package InterfaceDemo;

public class InterfaceDemo12 {

	public static void main(String[] args) {
		MountainBike mountain= new MountainBike(20,10,3);
		System.out.println("gear is ;-"+mountain.getGear());
		System.out.println("speed is:"+ mountain.getSpeed());
		System.out.println("seat height is"+mountain.getSeatHeight());
		mountain.applyBrake(2);
		System.out.println("bike speed after applying break:-"+mountain.getSpeed());
		mountain.speedUp(4);
		System.out.println("bike speed after speedup;"+mountain.getSpeed());
		mountain.canDrive();
		mountain.canRotateTwoWheels();

	}

}
