/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.concrete;

/**
 *
 * @author DB7
 */
public class Employee {
    String name;
    double empNo;
 
    public Employee() {
    }
    
    public Employee(String name, double empNo) {
        name = this.name;
        empNo = this.empNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getEmpNo() {
        return empNo;
    }

    public void setEmpNo(double empNo) {
        this.empNo = empNo;
    }    
}

