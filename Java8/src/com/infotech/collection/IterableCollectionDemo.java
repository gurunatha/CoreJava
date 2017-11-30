package com.infotech.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Employee
{
	private String name;
	private Double salary;
	private String department;
	public Employee(String name, Double salary, String department) {
		super();
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}
	
	
}
public class IterableCollectionDemo {

	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("guru", 25000.00, "HR"));
		emps.add(new Employee("venky", 28000.00, "MANAGER"));
		emps.add(new Employee("ashok", 22000.00, "PM"));
		emps.add(new Employee("linga", 24000.00, "HR"));
		
		emps.forEach(System.out::println);
		System.out.println("-------------Increment salary using Default Method in List Interface replaceAll(-)-----------------");
		
		emps.replaceAll((s) ->{
			if(s.getSalary()>25000)
			{
				return s;
			}else{
				s.setSalary(s.getSalary()+s.getSalary()*0.3);
				return s;
			}
		});
		
		emps.forEach(System.out::println);
		
		System.out.println("-----------Sort using Default Method in List Interface sort(-)----------------");
		
		emps.sort((e1,e2) -> e1.getSalary()>e2.getSalary()?1:-1);
		emps.forEach(System.out::println);
		
		System.out.println("-----------spliterator() ------------");
		
		emps.spliterator();
		emps.forEach(System.out::println);;
		
		System.out.println("------------Remove all HR Departmenet using Default Method In List Interface removeIf(-) -----------------");
		emps.removeIf(s -> "HR".equalsIgnoreCase(s.getDepartment()));
		emps.forEach(System.out::println);
		
		
	

	}

}
























