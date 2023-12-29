package com.qsp.studentrestapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.stdentrestapi.dto.Student;
import com.qsp.studentrestapi.repositary.StudentRepositary;

@RestController
public class StudentController {
	@Autowired
	StudentRepositary sr;
	
	@PostMapping("/savestudent")
	public String saveStudent(@RequestBody Student s)
	{
		System.out.println("From SaveStudrnt");
		sr.save(s);
		return "Student saved";
	}
	
	@GetMapping("/getstudent")
	public Student getStudentById(@RequestParam int id)
	{
		return sr.findById(id).get();
	}
	
	@PutMapping("/updatestudent")
	public String update(@RequestBody Student s)
	{
		sr.save(s);
		return "student updated";
	}
	
	
	@DeleteMapping("/deletedata")
	public String deletestudentById(@RequestParam int id)
	{
		sr.deleteById(id);
		return "student deleted";
	}
	

}
