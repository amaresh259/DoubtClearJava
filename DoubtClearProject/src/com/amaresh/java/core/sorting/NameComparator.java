package com.amaresh.java.core.sorting;

import java.util.Comparator;

public class NameComparator implements Comparator<EmployeePoJo> {

	@Override
	public int compare(EmployeePoJo o1, EmployeePoJo o2) {
			return o1.getName().compareTo(o2.getName());
	}

}
