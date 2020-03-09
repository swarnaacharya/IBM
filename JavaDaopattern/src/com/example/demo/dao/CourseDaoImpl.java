package com.example.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.example.demo.Course;

public class CourseDaoImpl  implements CourseDao{

	 Connection conn = null;
	   Statement stmt = null;

	public CourseDaoImpl(){

	try {
	    Class.forName("org.mariadb.jdbc.Driver").newInstance();
	    conn = DriverManager.getConnection(
	    		"jdbc:mariadb://127.0.0.1:3306/test", "root", "root");
	    stmt = conn.createStatement();

	    if (!conn.isClosed())
	        System.out.println("Successfully connectiod");
	} catch (SQLException e) {
	    e.printStackTrace();
	} catch (InstantiationException e) {
	    e.printStackTrace();
	} catch (IllegalAccessException e) {
	    e.printStackTrace();
	} catch (ClassNotFoundException e) {
	    e.printStackTrace();
	}
	}

}
@Override
public String add(Object object) {

Course c = (Course) object ;

String courseId = c.getCourseId();
String courseName = c.getCourseName();
String location = c.getLocation();

String result = "";
int rowcount;
try {
  String query = "Insert into course (courseId,courseName,location) values"
          + " ('"
          + courseId
          + "', '"
          + courseName
          + "', '"
          + location
          + "')";
  rowcount = stmt.executeUpdate(query);
  if (rowcount > 0) {
      result = "true";
      System.out.println("Course inserted successful");
  } else {
      result = "false:The data could not be inserted in the databse";
  }
} catch (SQLException e) {
  e.printStackTrace();
}

return result;
}
}

