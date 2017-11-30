package com.infotech.streams.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
public class ComparatorInJava8 {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();

		students.add(new Student("12guru", 35));
		students.add(new Student("12guru", 29));
		students.add(new Student("ashok12", 26));
		students.add(new Student("ven25ky", 27));
		students.add(new Student("#ling", 24));
		students.add(new Student("123moh@an", 29));
		System.out.println(" Before Sorting");
		students.forEach(System.out::println);
		
		Collections.sort(students,(s1,s2) -> s1.getName().compareTo(s2.getName()));
		System.out.println(" After Sorting");
		students.forEach(System.out::println);
		
		Comparator<Student> comparing = Comparator.comparing(Student::getName);
		Collections.sort(students,comparing);
		System.out.println("---sort using comparing()");
		students.forEach(System.out::println);
		
		Comparator<Student> comparingReversed = Comparator.comparing(Student::getName).reversed();
		Collections.sort(students,comparingReversed);
		System.out.println("");
		System.out.println("---sort using comparing() in reversed order----");
		students.forEach(System.out::println);
		
		System.out.println("--- Sorting Based on Name Length---");
		Comparator<Student> cc = Comparator.comparing(Student::getName,(s1,s2) -> s1.length()>s2.length()?1:s1.length()<s2.length()?-1:0);
		Collections.sort(students,cc);
		students.forEach(System.out::println);
		
		System.out.println("---- Sorting Based on Name & Age");
		Comparator<Student> thenComparing = Comparator.comparing(Student::getName).thenComparing(Student::getAge);
		Collections.sort(students,thenComparing);
		students.forEach(System.out::println);
		
		System.out.println("------------------");
		System.out.println(" Before 1.8 version sorting based on two fields");
		Collections.sort(students,new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				int compareName = o1.getName().compareTo(o2.getName());
				int compareAge = ((Integer)o1.getAge()).compareTo((Integer)o2.getAge());
				if(compareName==0)
				{
					return compareAge;
				}
				return 0;
			}
		});
		students.forEach(System.out::println);
		System.out.println("");
		List<String> collect = students.stream().map(Student::getName).collect(Collectors.toList());
		Collections.sort(collect,Comparator.naturalOrder());
		collect.forEach(System.out::println);
		Collections.sort(collect,Comparator.reverseOrder());
		System.out.println("");
		collect.forEach(System.out::println);
		
	}

}



















