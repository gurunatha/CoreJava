package com.infotech.sort;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

class Employee implements Comparable<Employee>
{
	private int id;
	private String name;
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id,name);
	}
	@Override
	public boolean equals(Object obj) {
		Employee emp = (Employee)obj;
		return this.getId()==emp.getId()&&this.getName()==emp.getName();
	}
	@Override
	public int compareTo(Employee e) {
		
		int empid = this.getId();
		if(empid<e.getId())
		{
			return -1;
		}else if(empid>e.getId()){
			return 1;
		}else
		{
			return 0;
		}
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
}
class MyComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		int i = o1.getId();
		int i1 = o2.getId();
		/*if(i%10<=i1%10)
		{
			return -1;
		}else if(i%10>=i1%10)
		{
			return 1;
		}else
		{
			return 0;
		}*/
		
		if(i%2<=i1%2)
		{
			return -1;
		}else if(i%2>=i1%2)
		{
			return 1;
		}else
		{
			return 0;
		}
		
	}
	
}
public class EmployeeDemo {

	public static void main(String[] args) {
		
		/*Set<Employee> set = new HashSet<>();
		
		Employee emp1 = new Employee(101, "guru");
		Employee emp2 = new Employee(102, "guru");
		Employee emp3 = new Employee(103, "venky");
		Employee emp4 = new Employee(104, "ashok");
		
		set.add(emp1);
		set.add(emp2);
		set.add(emp3);
		set.add(emp4);
		set.add(emp1);
		set.add(emp1);
		System.out.println("dafault sorted oreder"+set);*/
		
		TreeSet<Employee> set = new TreeSet<>(new MyComparator());
		Employee emp1 = new Employee(101, "guru");
		Employee emp2 = new Employee(102, "guru");
		Employee emp3 = new Employee(103, "venky");
		Employee emp4 = new Employee(206, "ashok");
		Employee emp5 = new Employee(109, "ashok");
		Employee emp6 = new Employee(504, "ashok");
		
		set.add(emp1);
		set.add(emp2);
		set.add(emp3);
		set.add(emp4);
		set.add(emp5);
		set.add(emp6);
		System.out.println("Custom sorting order"+set);
		System.out.println(101224%10000);
		System.out.println(101%2);
		
		HashSet<String> hash = new HashSet<>();
		hash.add("a");
		hash.add("b");
		hash.add("a");
		
		HashMap<String, Object> map = new HashMap<>();
		Object o =map.put("guru", new Object());
		System.out.println("map"+o);
		
		System.out.println(hash);
		
		

	}

}




















