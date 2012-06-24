package com.mycompany.app;

public interface Donut extends Shape, Comparable <Donut>{
	public double getRadiusLengthOne();
	public double getRadiusLengthTwo();
	public void setDonutMeasures(double radius1, double radius2);



}
