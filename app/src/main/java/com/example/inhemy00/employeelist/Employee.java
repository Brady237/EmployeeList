package com.example.inhemy00.employeelist;

public class Employee {

    private String mEmployeeName;

    private  String mEmployeeDesignation;

    private  String mEmployeeID;

    public Employee(String employeeName, String employeeDesignation, String employeeId){

        mEmployeeName = employeeName;
        mEmployeeDesignation = employeeDesignation;
        mEmployeeID=employeeId;

    }


    public String getEmployeename(){

        return mEmployeeName;
    }

    public String getEmployeeDesignation(){

        return mEmployeeDesignation;
    }

    public String getEmployeeID(){

        return mEmployeeID;
}


}
