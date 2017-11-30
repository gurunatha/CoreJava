package com.infotech.atomic;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.DoubleAccumulator;
import java.util.function.DoubleBinaryOperator;

public class DoubleAccumulatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleBinaryOperator accumulatorFunction = (x,y) ->
		{
			System.out.println(x+"\t"+y+"\t"+(x+y));
			return x+y;
		};
		DoubleAccumulator acc = new DoubleAccumulator(accumulatorFunction, 5L);
		
		DoubleAccumulatorServiceTask task1 = new DoubleAccumulatorServiceTask(acc, 10);
		DoubleAccumulatorServiceTask task2 = new DoubleAccumulatorServiceTask(acc, 10);
		List<Callable<Double>> list = new ArrayList<>();
		list.add(task1);
		list.add(task2);
		
		try {
			List<Future<Double>> invokeAll = Executors.newFixedThreadPool(1).invokeAll(list);
			
			for(Future<Double> f : invokeAll)
			{
				Double double1 = f.get();
				System.out.println("*************************"+double1);
			}
			System.out.println("final result "+acc.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}

}
