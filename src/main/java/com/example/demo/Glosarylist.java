package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Glosarylist {
	
	String[] maligai= {"Rice","Dal","Oil","Vegtable"};
	ArrayList<String> mList=new ArrayList<String>(Arrays.asList(maligai));
	
	@GetMapping("Getlistform")
	public String getListofmaligai(){
		return mList.toString();
	}
	
	@PostMapping("Getlistform")
	public String additem(@RequestBody String newitem) {
		mList.add(newitem);
		return mList.toString();
	}
	
	@GetMapping("Finditem")
	public String finditem(@RequestParam String ExisItem) {
		String res="";
		if(mList.contains(ExisItem)) {
			res="Availble";
		}else { 
			res="Not Available";
	}
		return res;
	}
	
	@DeleteMapping("deleteItem/{del}")
	public String delItem(@PathVariable String del) {
		
		if(mList.contains(del)) {
			mList.remove(del);
		}
		
		return mList.toString();
	
	}
	
	
	@PutMapping("UpdateItem")
	public String updateitem(@RequestBody UpdatePurpose updateelements  )
	{
		String result="";
		
		int indexof=mList.indexOf(updateelements.val1);
		if(indexof != -1) {
			mList.set(indexof, updateelements.val2);
			result=mList.toString();
		} else {
			
			result="Not available";
		}
		
		return result;
		
	}
	
	
	
}

class UpdatePurpose{
	
	public String val1,val2;
}