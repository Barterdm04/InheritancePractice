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
public class HourlyEmployee extends Employee {
    double hourlyRate;
    
    public HourlyEmployee(String name, double empNo, double hourlyRate){
        super.name = name;
        super.empNo = empNo;
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
}
