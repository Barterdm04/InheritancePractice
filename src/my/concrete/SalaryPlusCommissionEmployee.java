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
public class SalaryPlusCommissionEmployee extends SalariedEmployee{
    double commission;

    public SalaryPlusCommissionEmployee(double commission, String name, double empNo, double salary) {
        super(name, empNo, salary);
        salary += this.commission;
        commission = this.commission;
    }
    
    
    
}
