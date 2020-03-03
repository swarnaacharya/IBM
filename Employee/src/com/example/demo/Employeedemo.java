package com.example.demo;

public class Employeedemo {
	private String name;
    private int empId;
    private int salary;
     
    public Employeedemo(int id, String name, int sal){
        this.empId = id;
        this.name = name;
        this.salary = sal;
    }
     
    public boolean equals(Object obj){
        Employeedemo emp = (Employeedemo) obj;
        boolean status = false;
        if(this.name.equalsIgnoreCase(emp.name)
                && this.empId == emp.empId 
                && this.salary == emp.salary){
            status = true;
        }
        return status;
    }
     
    public static String getEmpNameWithHighestSalary(){
      
        return "Nattu";
    }
     
    public static Employeedemo getHighestPaidEmployee(){
    
      
        return new Employeedemo(1, "Nattu", 15000);
    }
     
    public int hashCode(){
        return this.empId;
    }
     
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
}


