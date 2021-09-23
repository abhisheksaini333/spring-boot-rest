package com.edureka.rest.dao;

import org.springframework.stereotype.Repository;

import com.edureka.rest.model.Employee;
import com.edureka.rest.model.Employees;

@Repository
public class EmployeeDAO 
{
    private static Employees list = new Employees();
    
    static 
    {
        list.getEmployeeList().add(new Employee(1, "Jon", "Snow", "jonsnowistargaeryan@gmail.com"));
        list.getEmployeeList().add(new Employee(2, "Jaime", "Lannister", "handsomelannister@gmail.com"));
        list.getEmployeeList().add(new Employee(3, "Daenerys", "Targaeryan", "queenofdragons@gmail.com"));
    }
    
    public Employees getAllEmployees() 
    {
        return list;
    }
    
    public void addEmployee(Employee employee) {
        list.getEmployeeList().add(employee);
    }
}
