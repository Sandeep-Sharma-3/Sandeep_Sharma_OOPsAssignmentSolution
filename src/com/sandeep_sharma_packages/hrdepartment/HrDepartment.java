package com.sandeep_sharma_packages.hrdepartment;

import com.sandeep_sharma_packages.superdepartment.*;

public class HrDepartment extends SuperDepartment
{
    public String departmentName()
    {
        return "Hr Department";
    }

    public String getTodaysWork()
    {
        return "Fill today's timesheet and mark your attendance";
    }

    public String getWorkDeadline()
    {
        return "Completer by EOD";
    }

    public String doActivity()
    {
        return "team Lunch";
    }
}
