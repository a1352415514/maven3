package com.atguigu.ssm.service;


import com.atguigu.ssm.pojo.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {

    List<Employee> getAllEmployee();
}
