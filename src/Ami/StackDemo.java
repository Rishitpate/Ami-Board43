package Ami;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> stack= new Stack<>();
		stack.push("America");
		stack.push("India");
		stack.push("China");
		System.out.println(stack);
		String popelement= stack.pop();
		System.out.println(popelement);
		System.out.println(stack);
	 String peekelement= stack.peek();
	 System.out.println(peekelement);

	}

}
