package com.bridglabz.problem5;



class Department{
    private int dId;
    private String dName;

    public Department(int dId, String dName) {
        this.dId = dId;
        this.dName = dName;
    }

    public int getdId() {
        return dId;
    }

    public void setdId(int dId) {
        this.dId = dId;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }
}

class Employee{
    private int eId;
    private String name;
    private Department department;

    Employee(int dId,String dName,Department department){
        this.eId=dId;
        this.name=dName;
        this.department=department;
    }

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    void display(){
        System.out.println("Employee Details");
        System.out.println(eId+" "+name);
        System.out.println("Department details");
        System.out.println(department.getdId()+" "+department.getdName());

    }
}

public class Main {
    public static void main(String[] args) {
        Department it = new Department(101, "IT");
        Department hr = new Department(102, "HR");

        Employee aryan = new Employee(1, "Aryan", it);
        aryan.display();


        aryan.setDepartment(hr);
        aryan.display();
    }
}
