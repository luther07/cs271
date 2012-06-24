/**
 * 
 */
package cs271.hw.shapes;

/**DonutImpl.java
 * @author Mark Johnson
 */
public class DonutImpl extends Object implements Shape, Donut, Comparable<Donut> {

	/**Accessor Method
	 * @return one radius measurement for a round "Donut".
	 */
	public double getRadiusLengthOne(){
		return myRadius1;
	}
	
	/**Accessor method
	 * @return other radius measurement for a round "Donut".
	 */
	public double getRadiusLengthTwo(){
		return myRadius2;
	}
		
	/**Default Value Constructor
	 * Constructs instance with radius lengths of 1.0 & 2.0,
	 * which is a valid "Donut".
	 */
		public DonutImpl()
		{
			myRadius1=1.0;
			myRadius2=2.0;
	}
		
		
		/**Explicit Value Constructor
		 * Constructs instance with radius lenths that are passed
		 * to the method: radius1 and radius2.
		 * @param radius1
		 * @param radius2
		 */
		public DonutImpl(double radius1, double radius2)
	{
		myRadius1=radius1;
		myRadius2=radius2;
		
	}
		
/**Mutator method
 * Method sends two double parameters and tells the object to change its radius
 * paramaters to the received parameters.
 */
	public void setDonutMeasures(double radius1, double radius2){
		myRadius1 = radius1;
		myRadius2 = radius2;
	}
	
	/* Overrides the getSurfaceArea signature in interface Shape.
	 * @return double value, the surface area of the donut, minus the hole.
	 * @see cs271.hw.shapes.Shape#getSurfaceArea()
	 */
	@Override
	public double getSurfaceArea() {
		// TODO Auto-generated method stub
		return (Math.PI*Math.abs(Math.pow(myRadius1, 2)-Math.pow(myRadius2, 2)));
	}

	/**Equals() method:
	 * Compares the calling Donut object with the a specified Donut object for equivalence.
	 * @returns true if the surface area of the calling object is equal to that of the specified object.
	 * @returns false if the surface area of the calling object is not equal to that of the specified object.
	 * I have used casting to convert the surface area returned from the method getSurfaceArea,
	 * to change the type of the value that is compared to a float. Without this hack, the Equals
	 * method would consider two donuts with radius of (3.0,5.0) and (Math.squt(20),2.0) to be not 
	 * equal.
	 * I used the float type-cast because I wanted there to be cases where two donuts are equal.
	 * Without this type-cast I couldn't conceive of two donuts that would be found to be equal
	 * by this method, equalTo().
	 */
	@Override
	public boolean equals(Object obj)
	{
		DonutImpl otherDonut = (DonutImpl)obj;

		if ((float)this.getSurfaceArea()<(float)otherDonut.getSurfaceArea())
			return false;
		if ((float)this.getSurfaceArea()>(float)otherDonut.getSurfaceArea())
			return false;
		else return true;
		}		
	
	/**Overrides and defines the compareTo method for class DonutImp.
	 * @return 1 if the calling object has a greater surface area than the object being sent.
	 * @return -1 if the calling object has less surface area than the object being sent.
	 * @return 0 if the calling object has the same surface area as the object being sent.
	 * I also used the float type-cast to change the values returned by the getSurfaceArea method
	 * from double to float. The equals method that I have created will not be quite as accurate
	 * with the float type-cast, but the choice was between losing some decimals of the end but 
	 * having some donuts be equal, or keeping all of the decimals and having no donuts be equal.
	 */	
@Override
	public int compareTo(Donut donut){
	
	DonutImpl otherDonut = (DonutImpl)donut;
	if ((float)this.getSurfaceArea() > (float)otherDonut.getSurfaceArea())
		return 1;
	if ((float)this.getSurfaceArea() < (float)otherDonut.getSurfaceArea())
		return -1;
		return 0;
	}
/**declaration of private fields used.
 * @param myRadius1 is the radius of one of the circles in the outline of a donut.
 * @param myRadius2 is the radius of the other circle in the outline of a donut.
 */
private double myRadius1, myRadius2;	
}
