package com.infotech.myinterface;

import java.util.Collections;
import java.util.List;

import com.infotech.model.Student;

public interface MyInterface {
	
	default public List<Student> getSortedList(List<Student> list)
	{
		Collections.sort(list);
		return list;
	}
	
	public static void greet()
	{
		System.out.println("Welcome to static method in interface");
	}
	
	Integer getMinElement(List<Integer> intList);

}
