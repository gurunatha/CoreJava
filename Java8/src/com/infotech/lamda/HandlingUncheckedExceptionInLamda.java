package com.infotech.lamda;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class HandlingUncheckedExceptionInLamda {

	static int i1 = 0;
	public static void main(String[] args) {
		List<Integer> integers = new ArrayList<Integer>();
		integers.add(10);
		integers.add(15);
		integers.add(0);
		integers.add(5);

		integers.forEach(consumerWrapper(i -> System.out.println(50/i),Exception.class));
		integers.forEach(consumeThrowableWrapper(i -> writeToFile(i),Exception.class));
	}
	
	private static void writeToFile(Integer i) throws IOException {
		System.out.println("writeToFile()");
		FileWriter f = new FileWriter("abc.txt",true);
		PrintWriter pw = new PrintWriter(f);
		pw.println(i);
		pw.flush();
	}
	
	private static <T,E extends Exception> Consumer<T> consumeThrowableWrapper(ThrowableConsumer<T, Exception> t,Class<E> clazz)
	{
		return i->
		{
			try{
				t.accept(i);
			}catch(Exception e)
			{
				System.out.println(clazz.cast(e).getMessage());
			}
		};
		
	}

	private static <T,E extends Exception> Consumer<T> consumerWrapper(Consumer<T> consumer,Class<E> clazz)
	{
		return i ->
		{
			try{
			consumer.accept(i);
			}catch(Exception e)
			{
				System.out.println("Exception "+e.getMessage());
			}
		};
	}
	
	
	private static Consumer<Integer> lamdaWrapper(Consumer<Integer> c)
	{
		System.out.println(i1++);
		System.out.println("==");
		return i -> 
		{
			try{
				System.out.println("--"+i);
				c.accept(i);
			}catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		};
	}

}
