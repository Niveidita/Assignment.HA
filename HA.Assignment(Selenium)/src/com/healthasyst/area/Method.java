package com.healthasyst.area;

public class Method {
	//instead to repeat the formula every single time
	//accessmodifier static returntype methodname(argument)
	public static void main(String[] args) {
		

		System.out.println(areaOfCircle(15));
		System.out.println(areaOfTriangle(25,1));
		System.out.println(Method.areaOfTriangle(25,1));
		}

		public static double areaOfCircle(int r) {
		return Math.PI * Math.pow(r,2);
		}

		public static double areaOfTriangle(double base,double height) {
		return (base * height)/2 ;
		}

		public static double areaOfSquare(double side) {
		return (side*side) ;
		}
		
		public static String getAuthorName()
		{
			String name ="Nevi";
			return name;
		}
		
	}

