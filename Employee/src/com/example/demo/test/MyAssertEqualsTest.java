package com.example.demo.test;
import org.junit.Test;
import com.example.demo.Employeedemo;

import junit.framework.TestCase;
public class MyAssertEqualsTest extends TestCase {
	@Test
    public void mySimpleEqualsTest(){
         
        String expectedName = "Nattu";
        assertEquals(expectedName, Employeedemo.getEmpNameWithHighestSalary());
    }
     
    @Test
    public void myObjectEqualsTest(){
         
        Employeedemo expectedEmpObj = new Employeedemo(1, "Nattu", 15000);
        assertEquals(expectedEmpObj, Employeedemo.getHighestPaidEmployee());
    }
}
