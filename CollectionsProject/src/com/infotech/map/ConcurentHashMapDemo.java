package com.infotech.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ConcurentHashMapDemo {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "guru");
		map.put(2, "chelli");
		map.put(3, "venky");
		
		
		
		Set<Entry<Integer, String>> set = new HashSet<>(map.entrySet());
		List<Entry<Integer, String>> list = new ArrayList<>(set);
		
		Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
		
		for(Map.Entry<Integer, String> mm: list)
		{
			map.put(4, "ashok");
			System.out.println(mm.getKey()+" :: "+mm.getValue());
		}
		System.out.println("------------------------------------");
		/*while(it.hasNext())
		{
			Entry<Integer, String> entry = it.next();
			System.out.println(entry.getKey()+"  ::  "+entry.getValue());
			map.put(5, "Mohan");
		}*/

	}

}
