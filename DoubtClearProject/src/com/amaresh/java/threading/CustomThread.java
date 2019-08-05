package com.amaresh.java.threading;

public class CustomThread implements Runnable {

	@Override
	public void run() {

		a();
		b();
		c();
	}

	public void a() {
		System.out.println("a::"+Thread.currentThread());
	}

	public synchronized void b() {
		System.out.println("b::"+Thread.currentThread());

	}

	public void c() {
		System.out.println("c::"+Thread.currentThread());
	}

}
