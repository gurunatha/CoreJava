package com.infotech.lamda;

import java.util.Arrays;

public class LamdaExpressionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] name = {"guru","venky","ashok","lings"};
		Integer[] id = {2,56,85,12,02,100};
		Arrays.sort(name,(a,b) -> a.compareTo(b));
		Arrays.sort(id,(a,b) -> a.compareTo(b));
		for(String str : name)
		{
			System.out.print(str+ " ");
		}
		System.out.println("----------------");
		for(Integer i : id)
		{
			System.out.print(i+" ");
		}
	}

}
