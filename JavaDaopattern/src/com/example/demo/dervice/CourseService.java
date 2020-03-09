package com.example.demo.dervice;

import com.example.demo.Course;
import com.example.demo.dao.CourseDao;
import com.example.demo.dao.CourseDaoImpl;

public class CourseService {
	public String addCourse(String courseId, String courseName, String location)
    {   
       Course c = new Course();
       c.setCourseId(courseId);
       c.setCourseName(courseName);
       c.setLocation(location);     
       CourseDao dao = new CourseDaoImpl();
       return dao.add(c);   
     }

}
