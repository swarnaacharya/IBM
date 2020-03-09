package com.example.demo;

public class Course {
	private String courseName;
    private String location;
    private String courseId;


       public String getCourseId()
               {
        return courseId;
            }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

        public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

}
