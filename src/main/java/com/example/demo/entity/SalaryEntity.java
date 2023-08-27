package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SalaryEntity {
	@Id
	private String EmpCode;
	private int Salary;
	//@GeneratedValue(strategy = GenerationType.AUTO)
		//private int id;
	
	
	public String getEmpCode()
	{
		return EmpCode;
	}
	 public void setEmpCode(String EmpCode)
	 {
		 this.EmpCode=EmpCode;
	 }
	
	 public int getSalary()
		{
			return Salary;
		}
		 public void setSalary(int Salary)
		 {
			 this.Salary=Salary;
		 }
		
	 
	 
	

}
