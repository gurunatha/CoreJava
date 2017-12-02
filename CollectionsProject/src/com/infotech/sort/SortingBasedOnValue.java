package com.infotech.sort;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortingBasedOnValue {

	static <K, V extends Comparable<? super V>> List<Entry<K, V>> entriesSortedByValues(Map<K, V> map) {

		List<Entry<K, V>> sortedEntries = new ArrayList<Entry<K, V>>(map.entrySet());
		Collections.sort(sortedEntries, new Comparator<Entry<K, V>>() {
			@Override
			public int compare(Entry<K, V> e1, Entry<K, V> e2) {
				return e2.getValue().compareTo(e1.getValue());
				//return e1.getKey()-e2.getKey();
			}
		});

		System.out.println("after list of entries "+sortedEntries);
		return sortedEntries;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> mapList = new LinkedHashMap<>();

		String l1 = "1024586";
		String l2 = "1024587";
		String l3 = "1024585";
		String l4 = "1024588";
		mapList.put(l1, "12guru");
		mapList.put(l2, "guru25");
		mapList.put(l3, "256");
		mapList.put(l4, "zshoknaidu125");
		System.out.println("------------------------");
		System.out.println("sorting based on values " + entriesSortedByValues(mapList));
		System.out.println("------------------------");
		List<Entry<String, String>> ll = entriesSortedByValues(mapList);
		
		Map<String,String> newMap = new LinkedHashMap<>();
		for(Entry<String, String> en : ll)
		{
			newMap.put(en.getKey(), en.getValue());
		}
		System.out.println("New Sorted Map "+newMap);
	}
}





















