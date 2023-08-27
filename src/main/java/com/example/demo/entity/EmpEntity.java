package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.transaction.Transactional;

@Entity
public class EmpEntity {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	
	private int id;
	private String EmpCode;
	private String EmpName;
	private String Dept;
	@Transient
	private int Salary;
	
	
	public int getId()
	{
		return id;
	}
	
	public void setid(int id)
	{
		this.id=id;
	}
	
	public String getEmpCode()
	{
		return EmpCode;
	}
	 public void setEmpCode(String EmpCode)
	 {
		 this.EmpCode=EmpCode;
	 }
	 
	 public String getEmpName()
	 {
		 return EmpName;
	 }

	 public void setEmpName(String EmpName)
	 {
		 this.EmpName=EmpName;
	 }
	 
	 public String getDept()
	 {
		 return Dept;
	 }
	 
	 public void setDept(String Dept)
	 {
		 this.Dept=Dept;
	 }

	public int getSalary() {
		// TODO Auto-generated method stub
		return Salary;
	}
	
	public void setSalary(int Salary)
	{
	this.Salary=Salary;	
	}
}
