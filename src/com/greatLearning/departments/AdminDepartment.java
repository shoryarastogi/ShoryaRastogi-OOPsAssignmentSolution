package com.greatLearning.departments;

public class AdminDepartment extends  SuperDepartment{
    @Override
    public String departmentName() {
        return "Admin Department";
    }

    @Override
    public String getTodaysWork() {
        return "Complete your document Submission";
    }

    @Override
    public String getWorkDeadine() {
        return "Complete by EOD";
    }
}
