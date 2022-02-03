package com.ha.runner;

import com.ha.groups.Professor;
import com.ha.groups.Student;
public class Runner {

	public static void main(String[] args) {
		
		Student stu1 = new Student();
		stu1.setName("neha");
		stu1.setPhoneNumber(9944847334L);
		stu1.setStudentId(101);
		stu1.setStudentPercentage(88.9);
		
		
		stu1.printStudentDetail();
		stu1.provideCertification();
		
		Professor p1 =new Professor();
		p1.setName("john");
		p1.setPhoneNumber(9948484844L);
		p1.setDepartmentName("Dp101");
		
		p1.printProfessorDetails();
		
	}

}
