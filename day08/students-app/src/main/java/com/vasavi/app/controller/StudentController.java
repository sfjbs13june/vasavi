package com.vasavi.app.controller;

import com.vasavi.app.model.Student;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentController {


    @GetMapping("/get/student")
    public List<Student> getStudent(){
        List studentList = new ArrayList();
        Student student1 = new Student("1","A","20","XYZ");
        Student student2 = new Student("2","B","21","XYZ");
        Student student3 = new Student("3","C","22","XYZ");

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        return studentList;
    }
    @GetMapping("/map/students")
    public Map GettingMapStudent(){
        Map studentMap = new HashMap();
        Student student1 = new Student("1","A","20","XYZ");
        Student student2 = new Student("2","B","21","XYZ");
        Student student3 = new Student("3","C","22","XYZ");

       studentMap.put(student1.getRollNo(),student1);
       studentMap.put(student2.getRollNo(),student2);
       studentMap.put(student3.getRollNo(),student3);
       return studentMap;

    }
}
