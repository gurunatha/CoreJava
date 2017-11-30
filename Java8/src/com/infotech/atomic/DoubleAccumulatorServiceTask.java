package com.infotech.atomic;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.DoubleAccumulator;

public class DoubleAccumulatorServiceTask implements Callable<Double> {

	private DoubleAccumulator accumulator;
	private long noOfTimes;
	
	public DoubleAccumulatorServiceTask(DoubleAccumulator accumulator, long noOfTimes) {
		super();
		this.accumulator = accumulator;
		this.noOfTimes = noOfTimes;
	}

	@Override
	public Double call() throws Exception {
		for(int i=1;i<noOfTimes; i++)
		{
			System.out.println(Thread.currentThread().getName());
			accumulator.accumulate(10.0);
		}
		System.out.println(accumulator.get());
		return accumulator.get();
	}

}
