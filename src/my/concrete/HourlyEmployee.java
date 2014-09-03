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
public class HourlyEmployee extends Employee {
    double hourlyRate;
    
    public HourlyEmployee(String name, double empNo, double hourlyRate){
        super.name = name;
        super.empNo = empNo;
        hourlyRate = this.hourlyRate;
    }

}
