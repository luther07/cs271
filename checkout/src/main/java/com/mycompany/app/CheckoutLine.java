package com.mycompany.app;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class CheckoutLine {

	private PriorityQueue<Customer> simulationQueue;
	private List<Customer> customerList  = new ArrayList<Customer>();
	private Scheduler scheduler;
	private int currentTime = 0;

	public CheckoutLine(Scheduler scheduler) {
		this.scheduler = scheduler;
		simulationQueue = new PriorityQueue<Customer>(11, new Comparator<Customer>() {
			public int compare(Customer cust1, Customer cust2) {
				return cust1.getArrivalTime() - cust2.getArrivalTime();
			}
		});
	}

	public void addCustomer(Customer c) {
		simulationQueue.add(c);
		customerList.add(c);
	}

	public void run() {
		while(!simulationQueue.isEmpty() || !scheduler.isEmpty()) {
			if(scheduler.isEmpty()) {
				Customer c = simulationQueue.remove();
				scheduler.push(c);
				currentTime = Math.max(currentTime, c.getArrivalTime());
			} else if(!simulationQueue.isEmpty() &&
					simulationQueue.peek().getArrivalTime()<=currentTime) {
				Customer c = simulationQueue.remove();
				scheduler.push(c);
			} else {
				Customer c = scheduler.pop();
				c.setStartTime(currentTime);
				currentTime += c.getLengthOfCheckout();
			}
		}
	}

	public List<Customer> getCustomerList() {
		return customerList;
	}

	public static void main(String[] args) {
		CheckoutLine line = new CheckoutLine(new LongestScheduler());
		populateTestData(line);
		line.run();

		int waitTotal = 0;
		for(Customer c: line.getCustomerList()) {
			waitTotal+=c.getWaitTime();
		}
		double avgWaitTime = (double) waitTotal / line.getCustomerList().size();
		System.out.println(avgWaitTime);
	}

	private static void populateTestData(CheckoutLine line) {
		line.addCustomer(new Customer(0, 11));
		line.addCustomer(new Customer(10, 40));
		line.addCustomer(new Customer(6, 5));
		line.addCustomer(new Customer(25, 10));
	}

}
