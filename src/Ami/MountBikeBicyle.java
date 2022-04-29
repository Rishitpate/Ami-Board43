package Ami;

 class MountBikeBicyle extends Bicycle{
	 public int seatHeight;
	 
 
 public MountBikeBicyle (int startHeight,int startSpeed,int startGear)
 {
    super(startSpeed,startGear);
    this.seatHeight=startHeight;
}
public void setHeight(int newValue) {
	seatHeight=newValue;
}
	
}