package com.example.demo.service;


import com.example.demo.entity.Employee;
import com.example.demo.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> findAllEmployee() {
        return employeeMapper.findAllEmployee();
    }
}
