package cs271.hw.shapes;

public interface Square extends Shape, Comparable<Square> {
	public double getSideLength();
	public void setSideLength(double length);
}
