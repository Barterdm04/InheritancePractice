/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myabstract;

/**
 *
 * @author DB7
 */
public abstract class Employee {
    String name;
    double empNo;
    double minutesWorkedPerWeek;
 
    
    public Employee() {
    }
    
    public Employee(String name, double empNo, double minutesWorkedPerWeek) {
        name = this.name;
        empNo = this.empNo;
        minutesWorkedPerWeek = this.minutesWorkedPerWeek;
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
    public abstract void punchIn();
    
}

