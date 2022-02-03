package com.HA.volume;

public class Volume {

	public double volumeOfACylinder(double r , double h)
	{
	return (Math.PI*r*r*h);
	}
	public double volumeOfACone(double r , double h)
	{
	return (Math.PI*r*r*h)/3 ;
	}
	public double volumeOfASphere(double r )
	{
	return (Math.PI*r*r*r)*4/3 ;
	}
	public double volumeOfACuboid(double l , double w , double h ) // w=width
	{
	return (w*h*l) ;
	}
	
	
}


