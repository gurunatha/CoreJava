package com.infotech.collection;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapSearchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConcurrentHashMap<Integer, UUID> ch = new ConcurrentHashMap<>();
		
		for(int i=0; i<50; i++)
		{
			ch.put(i, UUID.randomUUID());
		}
		
		String result = ch.search(3, (k,v) -> {
			if(k.equals(10))
			{
				return new String(k+"\t"+v);
			}
			return null;
		});
		
		System.out.println(result);
		
		String searchEntries = ch.searchEntries(3, (e) -> {
			if(e.getKey()==15)
			{
				return new String(e.getKey()+"\t"+e.getValue());
			}
			return null;
		});
		System.out.println(searchEntries);

	}

}
