package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StsFristp2Controller {
 @GetMapping("samee")
  
 public String test() {
	 
	 String [] s= {"date","time"};
	 String name = "";
	 
	 for( int i=0;i<s.length;i++)
	 {
		name= name.concat(s[i]);
	 }
	 return name;
 }
}
