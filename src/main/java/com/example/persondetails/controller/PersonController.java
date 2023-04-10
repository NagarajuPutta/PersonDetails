package com.example.persondetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.persondetails.fields.PersonFields;
import com.example.persondetails.service.PersonService;

@RestController
@RequestMapping("/request")
public class PersonController {
	
	@Autowired
	PersonService pservice;
	
	@PostMapping("/post")
	public String insertion(@RequestBody PersonFields pfields)
	{
		int i=pservice.insertion(pfields);
		if(i>0)
			return "Data inserted";
		else
			return "Data not inserted";
	}
    
	@PutMapping("/put")
	public String updated(@RequestBody PersonFields pfields)
	{
		int j=pservice.updation(pfields);
		if(j>0)
			return "Data Updated";
		else
			return "Not updated";
	}
	
	@DeleteMapping("/del")
	public String deleted(@RequestBody PersonFields pfields)
	{
		int k=pservice.deletion(pfields);
		if(k>0)
			return "Deleted";
		else
			return "Not deleted";
	}
	
	@GetMapping("/get")
	public List getdata( PersonFields pfields)
	{
		return pservice.getting(pfields);
	}
}
