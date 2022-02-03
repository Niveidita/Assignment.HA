package com.healthasyst.area;

public class Area {

	public static double areaOfCircle(int r )
	{
		double area =3.14 * r * r;
		return area;
	}
	
	public static double areaOfTriangle(double base,double height )
	{
	return (base * height)/2 ;
	}
	
	public static double areaOfRectangle(double length , double breadth)
	{
	double area = length *breadth ;
	return area;
	}
	public static double areaOfSquare(double side)
	{
	double area = side * side ;
	return area ;
	}
	public static double areaOfTrapezium(double a , double b , double h)
	{
	double area = (h*(a+b))/2 ;
	return area ;
	}
}
