package com.amaresh.java.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CollectionCheck {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		for(int i = 0; i < 5; i++) {
			list.add(sc.nextLine());
		}
		HashMap<String, Integer> map = new HashMap<>();
		
		for(String s : list) {
			Integer lastValue = map.put(s, 1);
			if(lastValue != null) {
				map.put(s, lastValue + 1);
			}
		}
		
		System.out.println(map.toString());
		
	}

}
