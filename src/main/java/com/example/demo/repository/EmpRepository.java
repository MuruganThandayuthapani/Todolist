package com.example.demo.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.EmpEntity;

public interface EmpRepository extends JpaRepository<EmpEntity, Integer> {
	
	
	@Transactional
	@Modifying
	@Query("update EmpEntity EE set EE.EmpName=?2 where EE.id=?1")
	public void updateEmpname(int id, String Empname);

}














