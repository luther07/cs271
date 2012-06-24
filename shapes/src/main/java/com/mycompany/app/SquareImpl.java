package com.mycompany.app;

/**SquareImpl.java
  *Author:Mark Johnson
  */


public class SquareImpl implements Shape, Square, Comparable<Square>{

	private double mySideLength;

	public double getSideLength() {
		return mySideLength;
	}

	public SquareImpl()
	{
		mySideLength = 1.0;
	}

	public SquareImpl(double sideLength)
	{
		mySideLength=sideLength;
	}

	public void setSideLength(double sideLength){
		this.mySideLength = sideLength;
	}

	@Override
	public double getSurfaceArea() {
		return mySideLength*mySideLength;
	}

	/**Equals() method:
	 * Compares the calling Square object with the a specified Square object for equivalence.
	 * @returns true if the surface area of the calling object is equal to that of the specified object.
	 * @returns false if the surface area of the calling object is not equal to that of the specified object.
	 */
	@Override
	public boolean equals(Object obj)
	{
		SquareImpl otherSquare = (SquareImpl)obj;
		if (this.getSurfaceArea()<otherSquare.getSurfaceArea())
			return false;
		if (this.getSurfaceArea()>otherSquare.getSurfaceArea())
			return false;
		else return true;
		}




	/**Compares the calling Square object with the a specified Square object.
	 * The comparison is based on the area contained in the square.
	 * @returns 1 if the calling Square is greater than the specified Square.
	 * @returns -1 if the calling Square is less than the specified Square.
	 * @returns 0 if the calling Square is equal to the specified Square.
	 */
	@Override
	public int compareTo(Square square) {
				// TODO Auto-generated method stub
		SquareImpl otherSquare = (SquareImpl)square;
		if(this.getSurfaceArea() > otherSquare.getSurfaceArea())
				return 1;
		if (this.getSurfaceArea() < otherSquare.getSurfaceArea())
				return -1;
		return 0;
	}



}
