package com.bridgelabz;

public class EmployeePayrollData {
    public int id;
    public String name;
    public double Salary;

    public EmployeePayrollData(Integer id,String name,Double Salary){
        this.id=id;
        this.name=name;
        this.Salary=Salary;
    }

    public String toString(){
        return "id "+id+" name "+name+" Salary "+Salary;
    }
}
