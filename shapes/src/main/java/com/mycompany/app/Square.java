package com.mycompany.app;

public interface Square extends Shape, Comparable<Square> {
	public double getSideLength();
	public void setSideLength(double length);
}
