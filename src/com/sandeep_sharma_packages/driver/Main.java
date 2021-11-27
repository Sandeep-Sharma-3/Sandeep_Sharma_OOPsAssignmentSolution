package com.sandeep_sharma_packages.driver;

import com.sandeep_sharma_packages.admindepartment.*;
import com.sandeep_sharma_packages.hrdepartment.*;
import com.sandeep_sharma_packages.techdepartment.*;

public class Main
{
    public static void main(String[] args) 
    {
        AdminDepartment admDep = new AdminDepartment();
        HrDepartment hrDep = new HrDepartment();
        TechDepartment techDep = new TechDepartment();

        System.out.println("Welcome to " + admDep.departmentName());
        System.out.println(admDep.getTodaysWork());
        System.out.println(admDep.getWorkDeadline());
        System.out.println(admDep.isTodayAHoliday());
        
        System.out.println("\n");

        System.out.println("Welcome to " + hrDep.departmentName());
        System.out.println(hrDep.doActivity());
        System.out.println(hrDep.getTodaysWork());
        System.out.println(hrDep.getWorkDeadline());
        System.out.println(admDep.isTodayAHoliday());
        
        System.out.println("\n");

        System.out.println("Welcome to " + techDep.departmentName());
        System.out.println(techDep.getTodaysWork());
        System.out.println(techDep.getWorkDeadline());
        System.out.println(techDep.getTechStackInformation());
        System.out.println(admDep.isTodayAHoliday());

        System.out.println("\n");
    }
}
