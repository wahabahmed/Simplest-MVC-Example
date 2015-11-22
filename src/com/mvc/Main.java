package com.mvc;

/**
 * Created by wahab on 22/11/2015.
 */
public class Main {
    public static void main(String[] args){
    //fetch student record based on his roll no from the database
    StudentModel studentModel = retriveStudentFromDatabase();

    //Create a studentView : to write student details on console
    StudentView studentView = new StudentView();

    StudentController studentController = new StudentController(studentModel, studentView);

    studentController.updateView();

    //update studentModel data
    studentController.setStudentName("John");
    studentController.setStudentRollNo("11");

    studentController.updateView();
}

    private static StudentModel retriveStudentFromDatabase(){
        StudentModel student = new StudentModel();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }
}
