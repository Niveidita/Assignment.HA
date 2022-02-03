package com.ha.groups;

import com.ha.base.Person;

public class Student extends Person {

	private int studentId;
	private double studentPercentage;
	private String courseCode;
//------------------------------------------------------------------------------	
	// getter and setter methods :
	public void setStudentId(int studentId ) {
	if(studentId>100){
		this.studentId = studentId;
		}else {
			System.out.println("Invalid id");
		}
}
	public int getStudentId()
	{
		return this.studentId;
	}
//------------------------------------------------------------------------------	
	public void setStudentPercentage(double studentPercentage){
	if(studentPercentage >=0 && studentPercentage<=100) {
		this.studentPercentage = studentPercentage;
		} else {
		System.out.println("Invalid Percentage !");
		}
	}
	

	public double getStudentPercentage()
	{
		return this.studentPercentage;
	}
	
//------------------------------------------------------------------------------		
	
	public void setcourseCode(String courseCode )
	{
		this.courseCode = courseCode;
	}
	public String getCourseCode()
	{
		return this.courseCode;
	}
	
//-------------------------------------------------------------------------------
	
	public void printStudentDetail()
	{
		System.out.println("Student Id: " + this.studentId);
		System.out.println("Student Name : " + super.getName());
		System.out.println("StudentPhone Number : " + super.getPhoneNumber());
		System.out.println("Student Percentage :" + this.getStudentPercentage());
		System.out.println("----------------------------------------------------------------");
	}
	
	public void provideCertification()
	{
		System.out.println("certification fr the student:" + super.getName());
		if ( this.studentPercentage >=50) {
			System.out.println("Passed ! Congrats");
		} else{
			System.out.println("Failed! Please Try again...");	
		}
		
	}
	
	
}
