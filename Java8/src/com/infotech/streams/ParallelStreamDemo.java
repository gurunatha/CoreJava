package com.infotech.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student
{
	private String name;
	private int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	
}
public class ParallelStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> students = new ArrayList<>();
		students.add(new Student("guru", 25));
		students.add(new Student("ashok", 26));
		students.add(new Student("venky", 27));
		students.add(new Student("ling", 24));
		students.add(new Student("mohan", 29));
		
		Stream<Student> student = students.parallelStream();
		student.forEach((s) -> doProcess(s));
		/*
		 * Stream Fileter
		 */
		//display records based on age conditions
		System.out.println("--------------");
		Stream<Student> studentBasedOnAge = students.parallelStream().filter(s -> s.getAge()>26);
		studentBasedOnAge.forEach(System.out::println);
		
		System.out.println("---------------");
		/*
		 * converst stream to list
		 */
		List<Student> list = students.stream().filter(s -> s.getAge()>26).collect(Collectors.toList());
		list.forEach(System.out::println);
		
		/*
		 * Generate using stream
		 */
		Stream<String> st = Stream.generate(()->"Hello").limit(10);
		st.forEach(System.out::println);
		
		Stream<Integer> intStream = Stream.iterate(10, i -> i+2).limit(10);
		intStream.forEach(System.out::println);
	}

	private static void doProcess(Student s) {
		System.out.println(s);
	}

}




















