package com.infotech.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapInterfaceDefaultMethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> map = new HashMap<String, Integer>();
		System.out.println("Before add "+map);
		
		map.merge("guru",2,(k,v) -> 10);
		map.merge("guru1",3,(k,v) -> 10);
		System.out.println(map);
		
		map.merge("guru", 5, (oldValue,newValue) -> 10);
		System.out.println(map);
		
		map.merge("guru12", 5, (oldValue,newValue) -> oldValue);
		System.out.println(map);
		
		map.put("venky", null);
		System.out.println(map);
		
		map.merge("venky", 12, Integer::sum);
		System.out.println(map);
		
		Integer orDefault = map.getOrDefault("guru", 121);
		System.out.println(map+" "+orDefault);
		System.out.println("------------------------------");
		
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		map1.put("guru", 12);
		
		map1.computeIfPresent("guru", (k,v) -> 1);
		System.out.println(map1);
		map1.computeIfPresent("guru1", (k,v) -> 1);
		System.out.println(map1);
		System.out.println("");
		Integer result = map1.computeIfPresent("guru", (k,v) -> 33);
		System.out.println(result);
		Integer result1 = map1.computeIfPresent("chelli", (k,v) -> null);
		System.out.println(result1);
		Integer result3 = map1.computeIfPresent("chellama", (k,v) -> 22);
		System.out.println(result3);
		System.out.println(map1);
		Integer result4 = map1.computeIfPresent("guru", (k,v) -> null);
		System.out.println(result4);
		System.out.println(map1);
		
		System.out.println("-----------");
		Map<Integer, String> map2 = new HashMap<>();
		map2.put(101, "guru");
		map2.put(102, "venky");
		map2.put(103, "chelli");
		System.out.println(map2);
		map2.computeIfAbsent(101, key -> null);
		System.out.println(map2);
		map2.computeIfAbsent(104, key -> "chellama");
		System.out.println(map2);
		
		Map<String,Collection<String>> multi = new HashMap<>();
		multi.computeIfAbsent("names", key -> new ArrayList<>()).add("guru");
		multi.computeIfAbsent("names", key -> new ArrayList<>()).add("guru1");
		multi.computeIfAbsent("names", key -> new ArrayList<>()).add("guru2");
		
		System.out.println(multi);
		
		
	}

}
