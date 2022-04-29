package OverloadingMehtod;

public class MethodOverload {
	public int multiple(int x, int y) {
		return(x*y);
		
	}
	public int multiple(int x, int y, int z) {
		return(x*y*z);
	}
	public  double multiple(double x, double y) {
		return(x*y);
	}
	public static void main(String[] args) {
		MethodOverload math= new MethodOverload();
		System.out.println(math.multiple(10, 20));
		System.out.println(math.multiple(10, 20,30));
		System.out.println(math.multiple(10.5, 20.3));

	}

}
