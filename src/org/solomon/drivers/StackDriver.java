package org.solomon.drivers;

import org.solomon.ds.*;
public class StackDriver {
	
	public static void main(String []  a){
		
		Stack St = new Stack(20);
		
		St.Push(5);
		
		St.Push(7);
		
		St.Push(9);
		
		St.Push(0);
		St.Push(40);
		
		System.out.println(St.Pop());
		
		System.out.println(St.Pop());
		
		System.out.println(St.Pop());
		System.out.println(St.Pop());
		System.out.println(St.Pop());
		System.out.println(St.Pop());
		System.out.println(St.Pop());
	}

}
