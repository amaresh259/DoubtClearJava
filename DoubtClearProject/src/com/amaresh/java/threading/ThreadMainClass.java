package com.amaresh.java.threading;

public class ThreadMainClass {

	public static void main(String[] args) {
		CustomThread ct = new CustomThread();
		Thread t1 = new Thread(ct, "1st");
		Thread t2 = new Thread(ct, "2nd");
		Thread t3 = new Thread(ct, "3rd");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
