package com.mycompany.app;

/**CircleImpl.java
 * @author Mark Johnson
 */
public class CircleImpl implements Shape, Circle, Comparable<Circle> {


	/**Default Value Constructor: initializes Circle with default radius value of 1.
	 */
	public CircleImpl() {
		myRadius =1.0;
	}

	/**Constructor: Explicit Value Constructor
	 * Initializes a new Circle object, and passing it a radius value.
	 * @param radius
	 */
	public CircleImpl(double radius) {
		myRadius = radius;
	}

	/**Accessor method:
	 * @returns the current radius value for a given Circel.
	 */
	public double getRadiusLength() {
		return myRadius;
	}

	/**Mutator method: sends message to an object, telling it to change the radius value.
	 */
	public void setRadiusLength(double radius) {
		this.myRadius = radius;
	}

	/* Method overrides the getSurfaceArea() method in the Shape interface
	 * @return surface area, as calculated from the radius.
	 * Method reads myRadius and calculates surface area.
	 * @see cs271.hw.shapes.Shape#getSurfaceArea()
	 */
	@Override
	public double getSurfaceArea() {
		return myRadius*myRadius*Math.PI;
	}

	/**Equals() method:
	 * Compares the calling Circle object with the a specified Circle object for equivalence.
	 * @returns true if the surface area of the calling object is equal to that of the specified object.
	 * @returns false if the surface area of the calling object is not equal to that of the specified object.
	 */
	@Override
	public boolean equals(Object obj) {
		CircleImpl otherCircle = (CircleImpl)obj;
		if (this.getSurfaceArea() == otherCircle.getSurfaceArea())
			return true;
		else
			return false;
	}
/**CompareTo method overrides method from superclass.
 * This method is necessary in implementing the Circle interface.
 */
	@Override
	public int compareTo(Circle circle) {
		// initialize default value of 0, indicating equality
		int result = 0;
		CircleImpl otherCircle = (CircleImpl)circle;
		if(this.getSurfaceArea() > otherCircle.getSurfaceArea())
			result = 1;
		else if (this.getSurfaceArea() < otherCircle.getSurfaceArea())
			result = -1;
		return result;
	}
	/**
	* @param a double field that represents the radius of a circle object.
	*/
	private double myRadius;
}
