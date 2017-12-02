package com.infotech.set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Employee
{
	private int empid;
	private String name;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println(" Employee equals()");
		if(obj==this)
			return true;
		if(!(obj instanceof Employee))
			return false;
		
		Employee emp = (Employee)obj;
		return empid==this.empid&&Objects.equals(name, emp.getName());
	}
	/*@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		System.out.println("Employee hashcode()");
		return Objects.hash(empid,name);
	}*/
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + "]";
	}
	
	
	
}
public class DuplicatesAllowedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Employee> set = new HashSet<>();
		Set<String> set1 = new HashSet<>();
		set1.add("a");
		set1.add("b");
		
		Employee emp = new Employee();
		emp.setEmpid(101);
		emp.setName("guru");
		Employee emp1 = new Employee();
		emp1.setEmpid(101);
		emp1.setName("guru");
		set.add(emp);
		set.add(emp1);
		set.add(emp);
		System.out.println(set);
		System.out.println(set.getClass().getName().hashCode());
	}

}
