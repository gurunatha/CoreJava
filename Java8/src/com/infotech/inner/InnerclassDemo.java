package com.infotech.inner;

/*What are local variables in java?
All variables of the method are called local variables in java.

 Where do local variables live in java?
 --------------------------------------
Methods are pushed on stack so local variables live on the stack.
Local variables of the method are kept on the stack and are lost as soon as the method ends in java.

 Where do object of local inner class live in java?
 ---------------------------------------------------
As object of local inner class live on the heap, objects may be alive even after method ends in which local inner class have been defined.
As, local variables of the method are kept on the stack and are lost as soon as the method ends, but even after the method ends, the local inner class object may still be alive on the heap. 
*/
class Outer
{
	
	void m1()
	{
		final int i = 10;
		final  int j = 20;
		
		class Inner
		{
			public Inner(String name)
			{
				System.out.println(name);
			}
			void m2()
			{
				System.out.println("access outer class local variable "+i);
				System.out.println("access outer class local variable "+j);
			}
		}
		new Inner("guru").m2();
	}
}
public class InnerclassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Outer().m1();
	}

}
