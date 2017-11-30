package com.infotech.functional.interfaceEcp;

class StaticExp1
{
	static StaticExp1 st = new StaticExp1();
	static  String name=" Infotech ";
	final String name1 = "infotech1 ";
	
	static
	{
		System.out.println(name);
		System.out.println(st.name1);
	}
	
	static void m1()
	{
		System.out.println(StaticExp1.name);
		System.out.println("m1() in Static1"+name);
	}
	
	void m2()
	{
		StaticExp1 st = new StaticExp1();
		System.out.println(st.name1);
		System.out.println(" m2() in static1");
	}
}

class StaticExp2 extends StaticExp1
{
	static void m1()
	{
		System.out.println("m1() instatic2");
	}
	
	void m2()
	{
		System.out.println("m2() in static2");
	}
}
public class StaticMethodOverrideDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticExp1 st1 = new StaticExp2();
		st1.m1();
		st1.m2();
	//	System.out.println(st1.name);
	//	System.out.println(StaticExp1.name);

	}

}
