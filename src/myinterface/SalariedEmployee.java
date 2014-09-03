/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myinterface;

/**
 *
 * @author DB7
 */
public class SalariedEmployee implements Employee{
    double salary;
    String name;
    double empNo;
    
    public SalariedEmployee(String name, double empNo, double salary){
        name = this.name;
        empNo = this.empNo;
        salary = this.salary;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void punchIn(){
        System.out.println("This Salaried employee has punched in!");
    }
}
