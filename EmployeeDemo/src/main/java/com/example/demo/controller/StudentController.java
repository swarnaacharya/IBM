package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

public class StudentController {
	   
	public StudentRepository studRepo;
	
	 @GetMapping(value = "/students")
	    public List<Student> getAllStudents() {
	        return studRepo.findAll();
	    }
	 
	    @PostMapping("/students")
	    Student createOrSaveEmployee(@RequestBody Student newStudent) {
	        return studRepo.save(newStudent);
	    }
	 
	    @GetMapping("/students/{id}")
	    Student getEmployeeById(@PathVariable Integer id) {
	        return studRepo.findById(id).get();
	    }
	 
	    @PutMapping("/students/{id}")
	    Student updateEmployee(@RequestBody Student newStudent, @PathVariable Integer id) {
	 
	        
	            return studRepo.save(newStudent);
	       
	    }
	 
	    @DeleteMapping("/student/{id}")
	    void deletestudent(@PathVariable Integer id) {
	        studRepo.deleteById(id);
	    }
	}

