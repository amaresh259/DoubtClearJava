package com.amaresh.java.core;

public class ParentImpl implements AgeInterface{
	static int i = 6;
	protected ParentImpl test(String abc) {
		
		System.out.println("ParentAbc");
		return null;
	}

	@Override
	public AgeInterface getAge() {
		return null;
	}
	
	public static void add() {
		System.out.println("parent");
	}
	
	
}
