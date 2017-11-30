package com.infotech.iterator;

import java.util.Objects;

public class Student {
	
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
	public boolean equals(Object obj) {
		System.out.println("equals() called");
		Student st = (Student)obj;
		if(this==st)
		{
			System.out.println("this");
			return true;
		}
		if(obj instanceof Student)
		{
			System.out.println("instanceof");
			return true;
		}else if(this.name==st.getName())
		{
			System.out.println("name match");
			return true;
		}
		
		return false;
	}
	@Override
	public int hashCode() {
		System.out.println("hashCode() called");
		return Objects.hash(name,age);
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	

}
