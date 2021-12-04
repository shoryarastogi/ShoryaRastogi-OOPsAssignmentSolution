package com.greatLearning.departments;

public class TechDepartment extends SuperDepartment{
    @Override
    public String departmentName() {
        return "Tech Department";
    }

    @Override
    public String getTodaysWork() {
        return "Complete coding of Module 1";
    }

    @Override
    public String getWorkDeadine() {
        return "Complete by EOD";
    }

    public  String getTechStackInformation(){
        return "core Java";
    }
}
