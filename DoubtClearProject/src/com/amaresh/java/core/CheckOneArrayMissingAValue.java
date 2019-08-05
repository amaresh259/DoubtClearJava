package com.amaresh.java.core;

public class CheckOneArrayMissingAValue {

	public static void main(String[] args) {
		int[] arr = {1,2,4,3,6,9,5,7,10};
		
		//Find out the missing element in the array
		int n=arr.length;
		int total=((n+1)*(n+2))/2;
		for(int i=0;i<n;i++) {
			total-=arr[i];
		}
		System.out.println("Missing element "+total);
	}

}
