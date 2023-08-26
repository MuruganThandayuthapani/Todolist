package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CarEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String regNo;
	
	private String vechType;
	
	private String vechName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public String getVechType() {
		return vechType;
	}

	public void setVechType(String vechType) {
		this.vechType = vechType;
	}

	public String getVechName() {
		return vechName;
	}

	public void setVechName(String vechName) {
		this.vechName = vechName;
	}
	
	
	

}
