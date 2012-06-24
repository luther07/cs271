package cs271.checkout;

import java.util.Comparator;
import java.util.PriorityQueue;

public class ShortestScheduler implements Scheduler {
	//class PriorityQueue<E>, how to implement compare?
	


	PriorityQueue<Customer>shortQueue= new PriorityQueue<Customer>(11, new Comparator<Customer>(){
		
		@Override
		public int compare(Customer arg1, Customer arg0) {
			return arg0.getLengthOfCheckout() - arg1.getLengthOfCheckout();
			
	}});
	
	class Decreaser extends PriorityQueue<Customer> implements Comparator<Customer>{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public int compare (Customer c1, Customer c2){
			return c2.compareTo(c1);
		}
	}

	//public int compareTo(Customer a, Customer b){
	//	return (a.getLengthOfCheckout().compareTo(b.getLengthOfCheckout()));
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
