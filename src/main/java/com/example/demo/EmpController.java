package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.EmpEntity;
import com.example.demo.entity.SalaryEntity;
import com.example.demo.repository.EmpRepository;
import com.example.demo.repository.SalaryRespositry;

@RestController
public class EmpController {
	
	@Autowired
	EmpRepository emprepostory;
	
	
	@Autowired
	SalaryRespositry salaryRespositry;
	
	@GetMapping("EmpDetails")
	public List<EmpEntity> getemp()
	{
		return emprepostory.findAll();
	}
	
	@PostMapping("EmpDetails")
	public String AddEmp(@RequestBody EmpEntity Empde)
	{
		emprepostory.save(Empde);
		SalaryEntity obj= new SalaryEntity();
		obj.setEmpCode(Empde.getEmpCode());
		obj.setSalary(Empde.getSalary());
		salaryRespositry.save(obj);
		return "Sucessfully save";
	}
	@DeleteMapping("EmpDetials/{id}")
	public String DelEmp(@PathVariable int id)
	{
		emprepostory.deleteById(id);
		return "Deleted";
	}
	
	@PutMapping("EmpDetials")
	public String Empnameupdate(@RequestBody EmpEntity Empnameupdate)
	{
		emprepostory.updateEmpname(Empnameupdate.getId(), Empnameupdate.getEmpName());
		
		return "Updated";
	}

}
