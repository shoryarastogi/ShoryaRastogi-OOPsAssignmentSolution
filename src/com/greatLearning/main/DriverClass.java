package com.greatLearning.main;

import com.greatLearning.departments.AdminDepartment;
import com.greatLearning.departments.HrDepartment;
import com.greatLearning.departments.TechDepartment;

public class DriverClass {
    public static void main(String[] args) {

        AdminDepartment adminDepartment= new AdminDepartment();
        HrDepartment hrDepartment = new HrDepartment();
        TechDepartment techDepartment =  new TechDepartment();


        System.out.println("Welcome to "+adminDepartment.departmentName());
        System.out.println(adminDepartment.getTodaysWork());
        System.out.println(adminDepartment.getWorkDeadine());
        System.out.println(adminDepartment.isTodayAHoliday());

        System.out.println();

        System.out.println("Welcome to "+hrDepartment.departmentName());
        System.out.println(hrDepartment.doActivity());
        System.out.println(hrDepartment.getTodaysWork());
        System.out.println(hrDepartment.getWorkDeadine());
        System.out.println(hrDepartment.isTodayAHoliday());
        System.out.println();

        System.out.println("Welcome to "+techDepartment.departmentName());
        System.out.println(techDepartment.getTodaysWork());
        System.out.println(techDepartment.getWorkDeadine());
        System.out.println(techDepartment.getTechStackInformation());
        System.out.println(techDepartment.isTodayAHoliday());

    }
}
