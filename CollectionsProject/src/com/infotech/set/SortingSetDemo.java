package com.infotech.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class SortingSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> set = new HashSet<>();
		set.add(5);
		set.add(10);
		set.add(9);
		set.add(2);
		
		Set<String> set1 = new HashSet<>();
		set1.add("guru");
		set1.add("ashok");
		set1.add("venky");
		
		System.out.println(set1);
		
		System.out.println(set);
		
		List<String> list = new ArrayList<>();
		list = new LinkedList<>();
		list = new Vector<>();
		list.add("guru");
		list.add("ashok");
		list.add("venky");
		//Collections.sort(list);
		System.out.println("list "+list);
	}

}
