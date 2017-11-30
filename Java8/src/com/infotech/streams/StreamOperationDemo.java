package com.infotech.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamOperationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<>();
		list.add("guru");
		list.add("mohan");
		list.add("venky");
		list.add("linga");
		// untill 1.7
		for(String s :list)
		{
			if(s.contains("guru")){
				System.out.println("true");
			}
		}
		
		// 1.8 onwards
		boolean anyMatch = list.stream().anyMatch((element) -> element.contains("guru"));
		System.out.println(anyMatch);
	}

}
