package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	public StudentRepository studrepo;



	public StudentServiceImpl() {
		super();
	}

	public List<Student> getAllStudents() {
		return studrepo.findAll();
	}

}
