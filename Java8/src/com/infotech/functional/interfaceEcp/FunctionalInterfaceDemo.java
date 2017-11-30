package com.infotech.functional.interfaceEcp;

@FunctionalInterface
interface MyInterface
{
	abstract void m1();
}

class MyInterfaceImpl implements MyInterface
{
	@Override
	public void m1() {
		System.out.println("MyInterfaceImpl");
	}
}

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyInterface my = () -> {
			System.out.println("m2");
		};
		
		my.m1();
	}

}
