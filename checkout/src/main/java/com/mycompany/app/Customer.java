package com.mycompany.app;


public class Customer implements Comparable<Customer> {

	//private int priority;
	private int lengthOfCheckout, arrivalTime, startTime;

	public Customer(int arrivalTime, int lengthOfCheckout) {
		this.arrivalTime = arrivalTime;
		this.lengthOfCheckout = lengthOfCheckout;
	}

        @Override
        public boolean equals(Object obj) {
          boolean result = false;
          if (obj instanceof com.mycompany.app.Customer) {
            Customer that = (Customer) obj;
            result = ((this.arrivalTime == that.arrivalTime) && (this.lengthOfCheckout == that.lengthOfCheckout));
          }
          return result;
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
