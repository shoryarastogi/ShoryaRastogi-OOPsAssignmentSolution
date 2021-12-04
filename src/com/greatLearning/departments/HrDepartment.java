package com.greatLearning.departments;

public class HrDepartment extends SuperDepartment{

    @Override
    public String departmentName() {
        return "Hr Department";
    }

    @Override
    public String getTodaysWork() {
        return "File today's timesheet and mark your attendance";
    }

    @Override
    public String getWorkDeadine() {
        return "Complete by EOD";
    }

    public String  doActivity(){
        return  "team Lunch";
    }
}
