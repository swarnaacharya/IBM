package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.Student;



public class StudentDAO {
	private static List<Student> student;
	{
		student = new ArrayList();
		student.add(new Student(101, "John", "djohn@gmail.com"));
		student.add(new Student(201, "Russ", "sruss@gmail.com" ));
		student.add(new Student(301, "Kate",  "kwilliams@gmail.com"));
	}
	public List list() {
		return student;
	}

}
