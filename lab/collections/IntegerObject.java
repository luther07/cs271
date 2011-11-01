package cs271.lab.collections;

public class IntegerObject implements Comparable<IntegerObject>{

	private int myInt;
	
	public IntegerObject() { }
	public IntegerObject(int myInt) {this.setInt(myInt);}
	
	public int getInt() { return myInt; }
	public void setInt(int myInt) { this.myInt = myInt; }
	
	public String toString() { 
		return ""+myInt;
	}
	
	@Override
	public boolean equals(Object that) {
		if(that instanceof IntegerObject) {
			IntegerObject thatIntObject = (IntegerObject) that;
			return thatIntObject.getInt() == this.getInt();
			
		}
		return false;
	}
	
	@Override
	public int compareTo(IntegerObject that) {
		return this.getInt() - that.getInt();
	}
}
