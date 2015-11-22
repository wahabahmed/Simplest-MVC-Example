package com.mvc;

/**
 * Created by wahab on 22/11/2015.
 */
public class StudentController {
    private StudentModel studentModel;
    private StudentView studentView;

    public StudentController(StudentModel studentModel, StudentView studentView){
        this.studentModel = studentModel;
        this.studentView = studentView;
    }

    public void setStudentName(String name){
        studentModel.setName(name);
    }

    public String getStudentName(){
        return studentModel.getName();
    }

    public void setStudentRollNo(String rollNo){
        studentModel.setRollNo(rollNo);
    }

    public String getStudentRollNo(){
        return studentModel.getRollNo();
    }

    public void addStudentInList(StudentModel studentModel){
        studentView.addStudentsInList(studentModel);
    }

    public void updateView(){
        studentView.printStudentDetails(studentModel);
    }
}
