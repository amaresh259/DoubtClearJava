package com.amaresh.java.core;

public interface FInterfaceB {
	
	String test(int a);
	
	default void test() {
		System.out.println("FInterfaceB");
	}

}
