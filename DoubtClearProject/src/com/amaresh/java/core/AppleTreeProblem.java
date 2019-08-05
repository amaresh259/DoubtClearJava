package com.amaresh.java.core;

import java.util.Arrays;
import java.util.Scanner;



public class AppleTreeProblem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter no. of tree");
		int noOfTree = sc.nextInt();
		int[] noOfAppleInEachTree = new int[noOfTree];
		for(int i = 0; i<noOfTree; i++) {
			noOfAppleInEachTree[i] = sc.nextInt();
		}
		//Sort the array on asc order
		Arrays.sort(noOfAppleInEachTree);
		int outputMangoes  = 0;
		System.out.println("Please enter from which location/position of tree you want to pull");
		int postion = sc.nextInt();
		
		for(int j = postion; j<noOfTree; j++) {
			outputMangoes += noOfAppleInEachTree[postion];
		}
		System.out.println("Final Mangoes pull from tree is "+outputMangoes);
		
		
	}

}
