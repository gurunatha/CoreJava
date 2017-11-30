package com.infotech.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

class Test extends Thread {
	/*
	 * ArrayList<String> list = new ArrayList<>(); List synList =
	 * Collections.synchronizedList(list);
	 */
	Vector<String> synList = new Vector<>();
	LinkedList<Integer> liked = new LinkedList<>();
	

	@Override
	public void run() {
		synList.add("a");
		synList.add("b");
	
		for (int i = 0; i <= 3; i++) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void display() {
		Iterator<String> it = synList.iterator();
		synchronized (synList) {
			while (it.hasNext()) {
				// synList.add("b");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(it.next());
			}
		}
	}
}

public class ArrayListDemo {

	public static void main(String[] args) {

		Test t = new Test();
		t.start();
		t.display();

	}

}
