package com.bridglabz.problem6;

class University{
    private int uId;
    private String uName;

    public University(int uId, String uName) {
        this.uId = uId;
        this.uName = uName;
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setdName(String uName) {
        this.uName = uName;
    }
}

class Professor{
    private int pId;
    private String name;
    private University university;

    Professor(int dId, String dName,University university ){
        this.pId=dId;
        this.name=dName;
        this.university=university;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int eId) {
        this.pId = pId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university){
        this.university=university;
    }

    void display(){
        System.out.println("Professor Details");
        System.out.println(pId+" "+name);
        System.out.println("University details");
        System.out.println(university.getuId()+" "+university.getuName());

    }
}

public class Main {
    public static void main(String[] args) {

    }
}
