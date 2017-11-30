package com.infotech.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ArralListSyncronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  ArrayList<Integer> list1 = new ArrayList<>(); list1.add(1);
		  list1.add(2);
		  
		 

		Vector<Integer> synList = new Vector<>();

		/* List<Integer> synList = Collections.synchronizedList(list); */

		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				int value = 1;
				for (int i = 0; i <= 3; i++) {
					synList.add(++value);
					System.out.println(synList.get(i));
					try {
						Thread.sleep(200);
						System.out.println("----------");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}
		}, "Thraed-1");
		t.start();

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				Iterator<Integer> it = synList.iterator();
				synchronized (synList) {
					while (it.hasNext()) {
						for (int i = 0; i <= 3; i++) {
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
		}, "Thread-2");
		t2.start();

	}

}
