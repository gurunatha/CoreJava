package com.infotech.collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;

public class IteratorDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = Arrays.asList("guru","venky","ashok","ling","chelli");
		System.out.println("  Iteratot forEach() ");
		list.forEach(System.out::println);
		
		System.out.println(" Iterator forEachRemaing()  ");
		Iterator<String> it =list.iterator();
		it.next();
		it.forEachRemaining(System.out::println);
		
		System.out.println("   Iterator for() loop");
		for(String str:list)
		{
			System.out.println(str);
		}
		
		System.out.println("   Iterator remove()   ");
		Iterator<String> it1 = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			it.remove();
		}
		list.forEach(System.out::println);
		
		Spliterator<String> spliterator = list.spliterator();
		System.out.println(spliterator.characteristics());
		
		System.out.println("--------------");
		//spliterator.tryAdvance(System.out::println);
		spliterator.forEachRemaining(System.out::println);
		
	}
}
















