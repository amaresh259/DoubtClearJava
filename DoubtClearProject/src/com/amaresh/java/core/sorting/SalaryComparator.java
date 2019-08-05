package com.amaresh.java.core.sorting;

import java.util.Comparator;

public class SalaryComparator implements Comparator<EmployeePoJo> {

	@Override
	public int compare(EmployeePoJo o1, EmployeePoJo o2) {
		return (int) (o1.getSalary() - o2.getSalary());
	}

}
