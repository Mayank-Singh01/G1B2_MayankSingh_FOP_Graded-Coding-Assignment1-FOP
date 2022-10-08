package com.gl.driverclass;

import com.gl.admindepartment.AdminDepartment;
import com.gl.hrdepartment.HrDeparment;
import com.gl.superdepartment.SuperDepartment;
import com.gl.techdepartment.TechDepartment;

public class DriverClass

{

    public static void main(String[] args)

    {

        SuperDepartment sd = new SuperDepartment();
        AdminDepartment ad = new AdminDepartment();
        HrDeparment hd = new HrDeparment();
        TechDepartment td = new TechDepartment();

        ad.display();
        hd.display();
        td.display();

    }
}