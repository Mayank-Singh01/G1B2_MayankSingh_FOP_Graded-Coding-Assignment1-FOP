package com.gl.hrdepartment;

import com.gl.superdepartment.SuperDepartment;

public class HrDeparment extends SuperDepartment {
    public String departmentName()
    {
        return "HR Department";
    }

    public String getTodaysWork()
    {
        return "Fill today's timesheet and mark your attendance";
    }
    public String getWorkDeadline()
    {
        return "Complete by EOD";
    }

    public String doActivity()
    {
        return "team Lunch";
    }

    public void display(){
        System.out.println("Welcome to "+departmentName());
        System.out.println(doActivity());
        System.out.println(getTodaysWork());
        System.out.println(getWorkDeadline());
        System.out.println(doActivity()+"\n\n");
    }

}
