package com.mycompany.app;

public interface Circle extends Shape, Comparable <Circle> {
	public double getRadiusLength();
	public void setRadiusLength(double myRadius);
}
