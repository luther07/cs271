package cs271.checkout;


public class Customer implements Comparable<Customer> {
	
	//private int priority;
	private int lengthOfCheckout, arrivalTime, startTime;
	
	public Customer(int arrivalTime, int lengthOfCheckout) {
		this.arrivalTime = arrivalTime;
		this.lengthOfCheckout = lengthOfCheckout;
	}

	public int getArrivalTime() {
		return arrivalTime;
	}


	public Integer getLengthOfCheckout() {
		return lengthOfCheckout;
	}
	
	public int getWaitTime() {
		return startTime - arrivalTime; 
	}

	public int getStartTime() {
		return startTime;
	}

	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}

	public int compareTo(Customer a) {
		return this.getLengthOfCheckout().compareTo(a.getLengthOfCheckout());
		//if (this.getLengthOfCheckout()<a.getLengthOfCheckout())
		//	return ((this.lengthOfCheckout)-(a.lengthOfCheckout));
		//if (this.getLengthOfCheckout()>a.getLengthOfCheckout())
		//	return ((a.lengthOfCheckout)-(this.lengthOfCheckout));
		//else return 0;
	}
}
