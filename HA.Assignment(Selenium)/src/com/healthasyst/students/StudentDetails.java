package com.healthasyst.students;

//Assignment - Day 2
public class StudentDetails {

	public static void main(String[] args) {
		//Method 1 (assignment)
		// default constructor 
		// Student creating object and initializing variables
//		Student s1 = new Student("M1001","jack","jack@gmail.com",45.2);
//		Student s2 = new Student("M1002","peter","peter@gmail.com",85.2);
//		Student s3 = new Student("M1003","mark","mark@gmail.com",56.5);
//
//
//		//setting values to SchoolName
//		Student.setSchoolName("Global School");
//
//		// printing Student Details
//		s1.printingStudentDetails();
//		s2.printingStudentDetails();
//		s3.printingStudentDetails();
//	}
//______________________________________________________________________________________________
	//METHOD 2 (other method by trainer)(for reference )
		
		Student.setSchoolName("global School");
		
		Student stu1= new Student(); // set student id as 1001
		Student stu2= new Student(); // set student id as 1002
		Student stu3= new Student(); // set student id as 1002
		
		stu1.setStudentPercentage(98.5);
		stu1.setStudentMailId("nevi@ha.com");
		
		System.out.println(stu1.getStudentPercentage());
		System.out.println(stu1.getStudentMailId());
		
		
		stu1.printStudentDetail();
		stu2.printStudentDetail();
		
		System.out.println();
		
	
	}
}