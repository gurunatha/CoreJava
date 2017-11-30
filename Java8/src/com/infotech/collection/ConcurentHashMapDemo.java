package com.infotech.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurentHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map2 = new ConcurrentHashMap<>();
		map2.put(101, "guru");
		map2.put(102, "venky");
		map2.put(103, "chelli");
		map2.forEach((k,v) -> System.out.println(k+"\t"+v));
		
		System.out.println("-------ConcurentHashMap");
		ConcurrentHashMap<Integer, String> map1 = new ConcurrentHashMap<>();
		map1.put(101, "guru");
		map1.put(102, "venky");
		map1.put(103, "chelli");
		map1.forEachEntry(5, k -> System.out.println(k.getKey()+"\t"+k.getValue()));
		//System.out.println(map1);
		System.out.println("----");
		map1.forEachKey(3,k -> System.out.println(k));
		System.out.println("");
		map1.forEachValue(3, v -> System.out.println(v));
		

	}

}
