package com.mycompany.app;




public interface Scheduler {
	public void push(Customer c);
	public Customer peek();
	public Customer pop();
	public boolean isEmpty();
	//int compareTo(Customer a, Customer b);
}
