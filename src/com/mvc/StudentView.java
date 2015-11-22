package com.mvc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wahab on 22/11/2015.
 */
public class StudentView {
    List<StudentModel> studentsList = new ArrayList<StudentModel>();
    public void printStudentDetails(StudentModel studentModel){
        //for(StudentModel student:studentsList) {
            System.out.println("Student: ");
            System.out.println("Name: " + studentModel.getName());
            System.out.println("Roll No: " + studentModel.getRollNo());
        //}
    }
    public void addStudentsInList(StudentModel studentModel){
        this.studentsList.add(studentModel);
    }
}
