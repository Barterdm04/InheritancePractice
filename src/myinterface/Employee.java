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
public interface Employee {
    
    public abstract void punchIn();
    public abstract String getName();
    public abstract void setName(String name);
    public abstract double getEmpNo();
    public abstract void setEmpNo(double empNo);
}

