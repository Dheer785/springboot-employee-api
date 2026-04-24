package com.api_nov.service;

import com.api_nov.dto.APIResponse;
import com.api_nov.dto.EmployeeDto;
import com.api_nov.entity.Employee;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.api_nov.dto.EmployeeDto;
import java.util.List;

public interface EmployeeService {
    APIResponse<EmployeeDto> add(EmployeeDto dto);
    void deleteEmployee(long id);

    EmployeeDto updateEmployee(long id, EmployeeDto employeeDto);

    List<EmployeeDto> getAllEmployees();
}