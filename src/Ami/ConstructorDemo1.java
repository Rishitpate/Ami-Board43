package Ami;

public class ConstructorDemo1 {
	int w;
	int h;
	int d;
	ConstructorDemo1(int w, int h, int d){
		this.w=w;
		this.h=h;
		this.d=d;
	}
	ConstructorDemo1(int w,int h){
		this.w=w;
		this.h=h;
		this.d=10;	
				
	}
	ConstructorDemo1(int dim){
		this.w=dim;
		this.h=dim;
		this.d=dim;	
	}
	ConstructorDemo1(){
		this.w=20;
		this.h=20;
		this.d=20;	
	}
	int volume() {
		return w*h*d;
		
		
	}
	public static void main(String[] args) {
		int volume;
		ConstructorDemo1 Demo =new ConstructorDemo1(10,20,30);
		volume =Demo.volume();
		System.out.println("Demo"+Demo);
		ConstructorDemo1 Demo1 =new ConstructorDemo1(10,20);
		volume =Demo1.volume();
		System.out.println("Demo1"+Demo);
		ConstructorDemo1 Demo2 =new ConstructorDemo1(20);
		volume =Demo2.volume();
		System.out.println("Demo2"+Demo);
		ConstructorDemo1 Demo3 =new ConstructorDemo1();
		volume =Demo3.volume();
		System.out.println("Demo3"+Demo);

			
		

	}

}
