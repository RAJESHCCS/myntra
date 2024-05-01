package com.simpleEmployee.employeemanagerCrud.service;

import com.simpleEmployee.employeemanagerCrud.dao.EmployeDAO;
import com.simpleEmployee.employeemanagerCrud.entity.Employee;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{
    private EmployeDAO employeDAO;
     @Autowired
    public EmployeeServiceImpl(EmployeDAO themployeDAO) {
         employeDAO=themployeDAO;
    }

    @Override
    public void save( @RequestBody Employee employee) {
        employeDAO.save(employee);
    }

    @Override
    public List<Employee> findAll() {
        return employeDAO.findAll();
    }

    @Override

    public void delete(int id) {
        employeDAO.delete(id);
    }

    @Override
    public Employee getEmployee( int id) {
        return employeDAO.getEmployee(id);
    }
}
