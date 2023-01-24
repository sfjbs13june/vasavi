package com.vasavi.app;

import com.vasavi.app.model.Student;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class StudentUnitTest {

    @Test
    public void studentTest(){
        List studentList = new ArrayList();
        Student student1 = new Student("1","D","40","MNO");
        Student student2 = new Student("2","E","41","MNO");
        Student student3 = new Student("3","F","42","MNO");

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);


        Assert.assertEquals(studentList.size(),3);

    }


    }

