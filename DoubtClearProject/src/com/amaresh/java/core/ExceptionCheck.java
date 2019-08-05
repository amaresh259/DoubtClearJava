package com.amaresh.java.core;
import static java.lang.System.out;

public class ExceptionCheck {
	
	public static int anyMethod() {
		try {
			out.println("1");
			return 1;
		}catch(Exception e) {
			out.println("2");
			return 2;
		}finally{
			out.println("3");
			return 3;
		}
	}

	public static void main(String[] args) {

		int x = anyMethod();
		out.println("Application::"+x);
	}

}
