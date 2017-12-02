package com.infotech.iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student("guru", 25);
		Student s2 = new Student("guru", 25);
		Student s3 = new Student("venky", 25);
		Student s4 = new Student("ashok", 26);
		Student s5 = new Student("venky", 27);
		Student s6 = new Student("ling", 28);
		Student s7 = new Student("mohan", 29);
		
	//	List<Student> students = new ArrayList<>();
		
		Set<Student> students = new HashSet<>();
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		students.add(s6);
		students.add(s7);
		
		System.out.println(" 1. Iterataor using Enhanced for loop");
		for(Student student: students)
		{
			System.out.println(student);
		}
		System.out.println("");
		System.out.println(" 2. Iterator using forEach() 1.8 feature");
		
		students.forEach(System.out::println);
		
	// or
	//	students.forEach(new MyConsumer());
		System.out.println("");
		System.out.println(" 3. Iterator using Iterator interface");
		Iterator<Student> it = students.iterator();
		while(it.hasNext())
		{
			System.out.println((Student)it.next());
		}
	System.out.println("------------------------------------------------");
	System.out.println(" ITEARTING MAP OBJECT");
	
	Map<Integer, Student> map = new HashMap<>();
	map.put(101, s1);
	map.put(102, s2);
	map.put(103, s3);
	map.put(104, s4);
	map.put(105, s5);
	map.put(106, s6);
	map.put(107, s7);
	
	System.out.println(" 1. USING ENTRY SET");
	Set<Entry<Integer, Student>> set = map.entrySet();
	for(Entry<Integer, Student> entry : set)
	{
		System.out.println(entry.getKey()+"\t"+entry.getValue());
	}
	
	System.out.println("");
	System.out.println(" 2. USING KEYSET");
	Set<Integer> set1 = map.keySet();
	for(Integer key : set1)
	{
		System.out.println(key+"\t"+map.get(key));
	}
	
	System.out.println("");
	System.out.println(" 3. USING forEach(-,-)");
	map.forEach((k,v) -> System.out.println(k+"\t"+v));
	

	Set<Entry<Integer, Student>> setEntrySet = map.entrySet();
	List<Entry<Integer, Student>> listEntrySet = new ArrayList<>(setEntrySet);
	
	//Collections.sort(listEntrySet,new SortUsingName());
	Collections.sort(listEntrySet, (e1,e2) -> e2.getValue().getName().compareTo(e1.getValue().getName())); 
	System.out.println("------------------------------------");
	System.out.println(" SORTING BASED ON STUDENT NAME");
	listEntrySet.forEach((e)->System.out.println(e.getKey()+"\t"+e.getValue()));
	
	System.out.println("");
	System.out.println(" ***** LAMDA EXPRESSION ****");
	System.out.println("");
	
	/*
	 * Reference an instance method of arbitary object of particular type
	 * syntax: Class::instanceMethodName
	 */
	System.out.println("1. class::instanceMethodName");
	List<String> studentsNames = IteratorDemo.getStudentNames(students,Student::getName);
	System.out.println(studentsNames);
	
	
	}

	private static List<String> getStudentNames(Set<Student> students, Function<Student, String> f) {
		List<String> studentNames = new ArrayList<>();
		students.forEach((s) -> studentNames.add(f.apply(s)));
		return studentNames;
	}

}

class SortUsingName implements Comparator<Entry<Integer,Student>>
{

	@Override
	public int compare(Entry<Integer, Student> entry1, Entry<Integer, Student> entry2) {
		
		return entry2.getValue().getName().compareTo(entry1.getValue().getName());
	}
	
}

class MyConsumer implements Consumer<Student>
{
	@Override
	public void accept(Student student) {
		System.out.println(student);
	}
	
}


























