package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	public StudentService studservice;
	
	public StudentController() {
		super();
	}
	
	@RequestMapping("/students")
	public List<Student> getAllStudents()
	{
		return studservice.getAllStudents();
	}
	
	

}
