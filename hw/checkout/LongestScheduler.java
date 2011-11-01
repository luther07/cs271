package cs271.checkout;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LongestScheduler implements Scheduler {
//class PriorityQueue<E>, how to implement compare?
	

	PriorityQueue<Customer>	shortQueue= new PriorityQueue<Customer>(11, new Comparator<Customer>(){

		@Override
		public int compare(Customer arg0, Customer arg1) {
			return arg1.getLengthOfCheckout() - arg0.getLengthOfCheckout();
		}});
			

	//public int compareTo(Customer a, Customer b){
	//		return (b.getLengthOfCheckout().compareTo(a.getLengthOfCheckout()));
	//}
	
	@Override
	public boolean isEmpty() {
		return shortQueue.isEmpty();
	}

	@Override
	public Customer peek() {
		return shortQueue.peek();
	}

	@Override
	public Customer pop() {
		return shortQueue.poll();
	}

	@Override
	public void push(Customer c) {
		shortQueue.add(c);
		
	}
	
}
