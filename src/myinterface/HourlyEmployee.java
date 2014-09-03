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
public class HourlyEmployee implements Employee {
    double hourlyRate;
    String name;
    double empNo;
    
    public HourlyEmployee(String name, double empNo, double hourlyRate){
        name = this.name;
        empNo = this.empNo;
        hourlyRate = this.hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    

    @Override
    public void punchIn(){
        System.out.println("This hourly employee has punched in!");
    }

    @Override
    public String getName() {
        return name;
    }


    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getEmpNo() {
        return empNo;
    }

    @Override
    public void setEmpNo(double empNo) {
        this.empNo = empNo;
    }
}
