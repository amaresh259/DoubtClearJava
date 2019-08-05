package com.amaresh.java.core;

public class AnonymousImpl {

	static final int i = 6;
	
	public static void main(String[] args) {
		AnonymousImpl anonymousImpl = new AnonymousImpl();
		//anonymousImpl.sum(anonymousImpl);
		//i = 6;
		anonymousImpl.sum(anonymousImpl);
		new AgeInterface() {
			
			@Override
			public AgeInterface getAge() {
				System.out.println("Success");
				return null;
				
			}
		}.getAge();
		
		AgeInterface a = new AgeInterface() {
			//final int i = 5;
			@Override
			public AgeInterface getAge() {
				System.out.println("Anonymous Class"+i);
				return null;
			}
		}.getAge();
		//a.getAge();
	}
	
	
	public void sum(AnonymousImpl obj) {
		//int x = obj.i;
		System.out.println(i);
	}

}
