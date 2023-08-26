package com.example.demo.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.CarEntity;

public interface CarRepository extends JpaRepository<CarEntity, Integer> {
	
	
@Transactional
@Modifying
@Query("update CarEntity c set c.vechName=?2 where c.id=?1")
public void updateCar(int id, String name);
}
