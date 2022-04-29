package Ami;

 class InheritanceDemo {

	public static void main(String[] args) {
		MountBikeBicyle mountain =new MountBikeBicyle(20,10,1);
		System.out.println("Gear is:="+mountain.gear);
		System.out.println("seatHeight:-"+ mountain.seatHeight);
		System.out.println("Bike speed:-"+mountain.speed);
		mountain.applyBrake(1);
		
		System.out.println("Bike speed after applying break is:-" + mountain.speed);
		mountain.speedUp(2);
		System.out.println("Bike speed after applying speed is:" + mountain.speed);
		
		

	}

}
