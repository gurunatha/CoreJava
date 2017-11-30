package com.infotech.lamda;
interface MyInterface<A,B>
{
	abstract A stringToInteger(B stringVal);
}
public class StringToInteger {
	
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		
		StringToInteger ss = new StringToInteger();
		MyInterface<Integer, String> my = (stringVal) -> Integer.parseInt(stringVal);
		
		MyInterface<Long, String> my1 = new MyInterface<Long, String>() {
			@Override
			public Long stringToInteger(String stringVal) {
				// TODO Auto-generated method stub
				return Long.parseLong(stringVal)+i;
			}
		};
		
		Integer result = my.stringToInteger("12");
		System.out.println(result+12);
		ss.m1();
	}
	
	void m1()
	{
		int i = 10;
		MyInterface<Integer,String> m1 = (a) ->  Integer.parseInt(a)+i;
		Integer result = m1.stringToInteger("10");
		System.out.println(result);
	}

}
