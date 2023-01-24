package com.vasavi.app.model;

public class Student {
    String RollNo; String Name;
    String Std;
    String SchoolName;


    public Student(String rollNo, String name, String std, String schoolName) {
        RollNo = rollNo;
        Name = name;
        Std = std;
        SchoolName = schoolName;
    }

    public String getRollNo() {
        return RollNo;
    }

    public void setRollNo(String rollNo) {
        RollNo = rollNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getStd() {
        return Std;
    }

    public void setStd(String std) {
        Std = std;
    }

    public String getSchoolName() {
        return SchoolName;
    }

    public void setSchoolName(String schoolName) {
        SchoolName = schoolName;
    }


}
