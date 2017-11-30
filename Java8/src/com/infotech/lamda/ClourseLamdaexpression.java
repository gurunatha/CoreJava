package com.infotech.lamda;
@FunctionalInterface
interface Operations
{
	void operate (int i );
}
public class ClourseLamdaexpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 30;
		int y = 40;
		doOperate(x, (n) -> System.out.println(n+y));

	}
	
	private static void doOperate(int i, Operations o)
	{
		o.operate(i);
	}

}
