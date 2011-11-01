package cs271.hw.shapes;

public interface Circle extends Shape, Comparable <Circle> {
	public double getRadiusLength();
	public void setRadiusLength(double myRadius);
}
