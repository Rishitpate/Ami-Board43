package Ami;

import java.awt.List;
import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
	ArrayList <Integer> array =new ArrayList<Integer>(5);
	for(int i=0;i<5;i++){
		array.add(i);
	}
		System.out.println(array);
		array.remove(3);
		System.out.println(array);
		//for(int i=0;i<array.size();i++) {
		//	System.out.print(array.get(i)+"  ");
			
		//}
		for(int i:array) {
			System.out.print(i+"  ");
		}
		
	}
	
	

	}
	
	
	

	


