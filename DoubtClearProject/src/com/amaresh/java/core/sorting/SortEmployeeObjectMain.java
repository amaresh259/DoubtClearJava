package com.amaresh.java.core.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class SortEmployeeObjectMain {

	public static void main(String[] args) {

		EmployeePoJo e1 = new EmployeePoJo("xAmaresh", 29, 650000d);
		EmployeePoJo e2 = new EmployeePoJo("tAmaresh", 24, 450000d);
		EmployeePoJo e3 = new EmployeePoJo("zAmaresh", 28, 400000d);
		
		ArrayList<EmployeePoJo> empList = new ArrayList<>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		
		
		System.out.println("Before Sorting according to age"+empList);
		Collections.sort(empList, new AgeComparator());
		System.out.println("After Sorting according to age"+empList);
		
		System.out.println("Before Sorting according to name"+empList);
		Collections.sort(empList, new NameComparator());
		System.out.println("After Sorting according to name"+empList);
		
		System.out.println("Before Sorting according to salary"+empList);
		Collections.sort(empList, new SalaryComparator());
		System.out.println("After Sorting according to salary"+empList);
	}

}
