package com.amaresh.java.core;

import java.util.Scanner;

public class ChildImpl extends ParentImpl {

	@Override
	protected ParentImpl test(String abc) {
		
		System.out.println("ParentAbc");
		return null;
	}
	
	static int x = 10;
	
	static {
		
		x++;
		
	}
	
	public static void add() {
		System.out.println("child");
		System.out.println("value:::"+x);
	}
	
	
	public static void main(String[] args) {
		System.out.println("vale:::"+x);
		add();
		
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String s = sc.nextLine();
		}
		
		
		Employee e1 = new Employee();
		
	}
}
