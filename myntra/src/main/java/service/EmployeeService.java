package com.simpleEmployee.employeemanagerCrud.service;

import com.simpleEmployee.employeemanagerCrud.entity.Employee;

import java.util.List;

public interface EmployeeService {
    void save(Employee employee);
    List<Employee> findAll();
    void delete(int id);
    Employee getEmployee(int id);
}
