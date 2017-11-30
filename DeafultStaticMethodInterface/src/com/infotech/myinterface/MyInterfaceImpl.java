package com.infotech.myinterface;

import java.util.Collections;
import java.util.List;

public class MyInterfaceImpl implements MyInterface {

	@Override
	public Integer getMinElement(List<Integer> intList) {
		// TODO Auto-generated method stub
		Integer min = Collections.min(intList);
		return min;
	}
	

}
