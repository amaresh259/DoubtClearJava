package com.amaresh.java.core;

@FunctionalInterface
public interface FIntefaceA {
	
	String test(int a);
	
	//void test(long b);
	
	int A = 5;
	
	
	default void test() {
		System.out.println("FIntefaceA");
	}

}
