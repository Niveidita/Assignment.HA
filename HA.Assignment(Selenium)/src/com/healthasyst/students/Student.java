package com.healthasyst.students;

//Assignment - Day 2
public class Student {

//METHOD 1 (assignment)
//	private String studentRollno ;
//	private String studentName;
//	private String studentMailid;
//	private double studentPercentage;
//	private static String schoolName;
//
//	public Student(String StudentRollno, String studentName, String studentMailid, double studentPercentage) {
//
//	this.studentRollno = StudentRollno;
//	this.studentName = studentName;
//	this.studentMailid = studentMailid;
//	this.studentPercentage = studentPercentage;
//
//	}
//
//	public static void setSchoolName(String schoolName) {
//	Student.schoolName = schoolName;
//	}
//
//	public void printingStudentDetails() {
//	System.out.println(this.studentRollno + " - " + this.studentName + " \n Student MailID : " + this.studentMailid);
//	System.out.println("Student Percentage : " + this.studentPercentage);
//	System.out.println(" School Name : " + Student.schoolName);
//	}

//------------------------------------------------------------------------------------------------------------------------------
	//METHOD 2 (other method by trainer)
	
	private int studentID;
	private String studentName;
	private String studentMailId;
	private double studentPercentage;
	private static String schoolName;
	
	private static int counter = 1001;

	public Student()
	{
		studentID=counter;
		counter = counter+1;
	}
	
	//getter method 
	public double getStudentPercentage()
	{
		return this.studentPercentage;
	}
	
	//setter method 
	public void setStudentPercentage(double studentPercentage)
	{
		if(studentPercentage>=0 && studentPercentage<=100)
		{
			this.studentPercentage=studentPercentage;
		}
		else
		{
			System.out.println("Invalid Percentage!!");
		}
	}
	
	public String getStudentMailId()
	{
		return studentMailId;
	}
	public void setStudentMailId(String studentMailId)
	{
		if(studentMailId.contains("@"))
		{
			this.studentMailId =studentMailId;
		}
		else
		{
			System.out.println("Invalid mail Id");
		}
	}
	
	public static String getSchoolName()
	{
		return schoolName;
	}
	public static void setSchoolName (String schoolName)
	{
		Student.schoolName = schoolName;
	}
	public void printStudentDetail()
	{
		System.out.println("Student Id: " + this.studentID);
		System.out.println("Student Name: " + studentName);
		System.out.println("Student MailId: " + getStudentMailId());
		System.out.println("Student Percentage: " + getStudentPercentage());
		System.out.println("School Name: " + Student.schoolName);
		System.out.println("--------------------------------------------");
		
		
	}
}
