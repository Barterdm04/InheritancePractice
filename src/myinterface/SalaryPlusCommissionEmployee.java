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
public class SalaryPlusCommissionEmployee implements Employee{
    String name;
    double empNo;
    double salary;
    double commission;

    public SalaryPlusCommissionEmployee(double commission, String name, double empNo, double salary) {
        this.name = name;
        this.empNo = empNo;
        this.salary = salary + commission;
        this.commission = commission;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }
    @Override
    public void punchIn(){
        System.out.println("This salaried employee that earns commission has punched in!");
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
