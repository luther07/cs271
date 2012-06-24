package cs271.hw.shapes;

/**Main.java
 * MarkJohnson-hw1
 * CS271
 * @author Mark Johnson
 *Main Class tests the class methods in classes SquareImpl, CircleImpl, and DonutImpl
 *
 */

public class Main{


	public static void printSquareInfo(Square s) {
		System.out.println("A square with side lengths of " + s.getSideLength() + 
						   " has an area of " + s.getSurfaceArea()+" square units.");
	}
	
	public static void printCircleInfo(Circle c){
		System.out.println("A circle with radius " + c.getRadiusLength());
		System.out.println("has an area of " + c.getSurfaceArea()+" square units.");
	}
	
public static void printDonutInfo(Donut d){
		System.out.println("A donut of radius dimensions " );
		System.out.println(d.getRadiusLengthOne()+" and "+d.getRadiusLengthTwo());
		System.out.println("has an area of "+d.getSurfaceArea()+" square units.");
}

	
	
	public static void main(String[] args) {

		
		for(int i=1;i<7;i++) {
			Square a = new SquareImpl();
			a.setSideLength(i);
			printSquareInfo(a);
			Circle b= new CircleImpl();
			b.setRadiusLength(i);
			printCircleInfo(b);
			Donut c = new DonutImpl();
			c.setDonutMeasures(i, i+1);
			printDonutInfo(c);
		}
		

		
		for(int i=1;i<7;i++) {
			Square d = new SquareImpl(5);
			Square e = new SquareImpl(i+1);
			System.out.println("Print true if "+d.getSurfaceArea()+" equal to "+e.getSurfaceArea()+":"+d.equals(e));
			Circle f = new CircleImpl(4);
			Circle g = new CircleImpl(i+1);
			System.out.println("Print true if "+f.getSurfaceArea()+" equal to "+g.getSurfaceArea()+":"+f.equals(g));
			Donut h = new DonutImpl(i,i+1);
			Donut j = new DonutImpl(3,4);
			System.out.println("Print true if "+h.getSurfaceArea()+" equal to "+j.getSurfaceArea()+":" +h.equals(j));
			
		
		}


	
}}
