package com.amaresh.java.core.sorting;

import java.util.Comparator;

public class AgeComparator implements Comparator<EmployeePoJo> {

	@Override
	public int compare(EmployeePoJo o1, EmployeePoJo o2) {
		return o1.getAge() - o2.getAge();
	}

}
