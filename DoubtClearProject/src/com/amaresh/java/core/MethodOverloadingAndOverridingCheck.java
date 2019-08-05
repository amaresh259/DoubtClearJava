package com.amaresh.java.core;

public class MethodOverloadingAndOverridingCheck {
	static int a;
	
	/*final static void a(){
		a =5;
		a++;
	}*/
	
	public static void test(String abc) {
		a = 6;
		System.out.println("abc::"+a);
	}
	
	public void test(Object obj) {
		System.out.println("Obj");
	}
	public static void main(String[] args) {

		/*MethodOverloadingAndOverridingCheck obj = new MethodOverloadingAndOverridingCheck();
		obj.test(null);*/
		
		test(null);
	}

}
