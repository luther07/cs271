package cs271.checkout;

import java.util.Stack;



public class LIFOSCHEDULER implements Scheduler{

	Stack<Customer> stacki = new Stack<Customer>();
	
	@Override
	public boolean isEmpty() {
		return stacki.isEmpty();
	}

	@Override
	public Customer peek() {
		return stacki.peek();
	}

	@Override
	public Customer pop() {
		return stacki.pop();
	}

	@Override
	public void push(Customer c) {
		stacki.push(c);
		
	}

	public int compareTo(Customer a, Customer b) {
		return 0;
	}

}
