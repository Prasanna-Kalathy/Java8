package com.Streams.Intro;

import java.util.ArrayList;
import java.util.List;

import com.PreFunIntref.ArrLstProvider;
import java.util.function.UnaryOperator;

public class MapDemo {
	// Conventional way of Doubling elements in a List
	public static UnaryOperator<List<Integer>> DoubleAll = lst -> {
		// New list to store the doubled output
		List<Integer> Newlst = new ArrayList<>();
		// Doubling values from list and adding them to new list
		for (Integer i : lst) {
			Newlst.add(i * 2);
		}
		return Newlst;
	};

	// Java 8 way of filtering a List
	public static UnaryOperator<List<Integer>> DoubleAll2 = lst -> lst.stream().map(i -> i * 2).toList();

	public static void main(String[] args) {
		// Math Random applied List
		List<Integer> lst1 = ArrLstProvider.ArrRdmMath.apply(10);
		// Random Class applied List
		List<Integer> lst2 = ArrLstProvider.ArrRdmCls.apply(10);

		System.out.println(lst1);
		System.out.println(DoubleAll.apply(lst1));
		System.out.println(lst2);
		System.out.println(DoubleAll2.apply(lst2));
	}
}
