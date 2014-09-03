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
        this.salary += commission;
        this.commission = commission;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }
    
    
    
}
