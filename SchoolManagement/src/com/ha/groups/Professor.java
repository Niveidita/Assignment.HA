package com.ha.groups;

import com.ha.base.Person;

public class Professor extends Person {
	private String professorId;
	private String departmentId;
	private String departmentName;
	private double experience;
	
	public void setProfessorId(String professorId)
	{
		this.professorId= professorId;
	}
	public String getProfessorId()
	{
		return this.professorId;
	}
//-------------------------------------------------	
	public void setDepartmentId(String departmentId)
	{
		this.departmentId= departmentId;
	}
	public String getdepartmentId(){
		return this.departmentId;
	}
//-----------------------------------------------------
	public void setDepartmentName(String departmentName){
		this.departmentName= departmentName;
	}
	public String getDepartmentName(){
		return this.departmentName;
	}
//-------------------------------------------------------------
	public void setExperience(double experience)
	{
		this.experience=experience;
	}
	public double getexperience()
	{
		return this.experience;
	}
//-------------------------------------------------------------------
	public void printProfessorDetails()
	{
		System.out.println(super.getName());
		System.out.println(super.getPhoneNumber());
		System.out.println(this.departmentName);
	}
	
}
