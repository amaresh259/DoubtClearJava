package com.amaresh.java.core;

public class StringReplaceFunction {

	public static void main(String[] args) {

		//String str = "ABCDABCDEABC";
		
		String str = "I am very ouch happy about you";
		//str.
		
		String x = str.replace("ou", "XY");
		System.out.println("x::"+x);
		
		//Without using replace method -- in progress
		String[] arr = str.split("ou");
		
		
		
		
		System.out.println("size of array::"+arr.length);
		StringBuffer sb = new StringBuffer();
		
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
			sb.append(arr[i]).append("XY");
		}
		
		System.out.println("Final:::"+sb.toString());
		/*StringBuffer sb = new StringBuffer();
		for(int i = 0; i<str.length(); i++) {
			if("ABC".equals(str.substring(i, i+3))) {
				sb.append("XY");
				i = i+3;
			}
		}*/
	}

}
