package com.Streams.Intro;

import java.util.ArrayList;
import java.util.List;

import com.PreFunIntref.ArrLstProvider;
import java.util.function.UnaryOperator;

public class FilterDemo {
	// Conventional way of filtering a List
	public static UnaryOperator<List<Integer>> FilterEven = lst -> {
		// New list to store the filtered output
		List<Integer> Newlst = new ArrayList<>();
		// Filtering values from list2 and adding them to new list
		for (Integer i : lst) {
			if (i % 2 == 0) {
				Newlst.add(i);
			}
		}
		return Newlst;
	};
	
	// Java 8 way of filtering a List
	public static UnaryOperator<List<Integer>> FilterEven2 = lst -> lst.stream().filter(i -> i % 2 == 0).toList();

	public static void main(String[] args) {
		// Math Random applied List
		List<Integer> lst1 = ArrLstProvider.ArrRdmMath.apply(10);
		// Random Class applied List
		List<Integer> lst2 = ArrLstProvider.ArrRdmCls.apply(10);

		System.out.println(lst1);
		System.out.println(FilterEven.apply(lst1));
		System.out.println(lst2);
		System.out.println(FilterEven2.apply(lst2));
	}
}
