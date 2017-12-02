package com.infotech.list;

import java.util.Arrays;

public class ArraysCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = new String[3];
		str[0]="a";
		str[1]="b";
		str[2]="c";
		
		for(int i=0; i<str.length; i++)
		{
			System.out.println(str[i]);
		}
		
		String[] str1 = Arrays.copyOf(str, 5);
		for(int i=0; i<str1.length; i++)
		{
			System.out.println(str1[i]);
		}
		
		

	}

}
