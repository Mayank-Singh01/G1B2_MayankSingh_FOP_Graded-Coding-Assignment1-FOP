package com.gl.admindepartment;

import com.gl.superdepartment.SuperDepartment;

public class AdminDepartment extends SuperDepartment {

    public String departmentName()
    {
        return "Admin Department";
    }

    public String getTodaysWork()
    {
        return "Complete your document submission";
    }
    public String getWorkDeadline()
    {
        return "Complete by EOD";
    }

    public void display(){
        System.out.println("Welcome to "+departmentName());
        System.out.println(getTodaysWork());
        System.out.println(getWorkDeadline());
        System.out.println(isTodayAHoliday()+"\n\n");
    }

}
