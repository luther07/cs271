package com.mycompany.app;


import java.util.LinkedList;
import java.util.Queue;

public class FIFOScheduler implements Scheduler {

	Queue<Customer> line = new LinkedList<Customer>();

	public boolean isEmpty() {
		return line.isEmpty();
	}

	public Customer peek() {
		return line.peek();
	}

	public Customer pop() {
		return line.remove();
	}

	public void push(Customer c) {
		line.add(c);
	}

	public int compareTo(Customer a, Customer b) {
		return 0;
	}
}
