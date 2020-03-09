package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.StudentDAO;
import com.example.demo.model.Student;

@RestController

public class StudentController {
	   
	@Autowired
	private StudentDAO studentdao;
	
	
	
	@RequestMapping(value = "/students",method = RequestMethod.GET)
	    public List<Student> getAllStudents() {
	        return studentdao.list();
	    }
}	 