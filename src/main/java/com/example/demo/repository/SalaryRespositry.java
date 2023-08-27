package com.example.demo.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.SalaryEntity;

public interface SalaryRespositry extends JpaRepository<SalaryEntity, Integer> {

	@Transactional
	@Modifying
	@Query("update SalaryEntity ES set ES.Salary=?2 where ES.id=?1")
	public void updateEmpname(int id, String Empname);
}
