package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CarEntity;
import com.example.demo.repository.CarRepository;

@RestController
public class CarController {
	
	@Autowired
	CarRepository carRepository;
	
	@GetMapping("car")
	public List<CarEntity> getAllCars() {
		return carRepository.findAll();
	}
	
	
	@PostMapping("car")
	public String createCar(@RequestBody CarEntity carDetails ) {
		
		carRepository.save(carDetails);
		
		return "Save Sucessfully";
	}
	
	@PutMapping("car")
	public String altercarDetails(@RequestBody CarEntity updateDetails) {
		
		carRepository.updateCar(updateDetails.getId(), updateDetails.getVechName());
		
		return "Updated";
	}
	
	@DeleteMapping("car/{id}")
	public String deletedetails(@PathVariable int id )
	{	
		carRepository.deleteById(id);
		return "Deleted";
	}
	
}