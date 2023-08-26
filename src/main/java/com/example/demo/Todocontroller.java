package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Todocontroller {

	String[] name = { "a", "ab", "abc", "abcd" };

	ArrayList<String> list = new ArrayList<String>(Arrays.asList(name));

	@GetMapping("todolist")
	public String todo() {
		return list.toString();
	}

	@GetMapping("todolistbyid")
	public String getTask(@RequestParam String ide) {
		String res="";
		if(list.contains(ide))
		{
			res= "Give data is available";
		}
		else {
			res= "Give Not data is available";
		}
		return res;
	}

	@PostMapping("todolist")
	public String addTodo(@RequestBody String taskName) {
		list.add(taskName);
		return "Sucessfull";
	}

}
