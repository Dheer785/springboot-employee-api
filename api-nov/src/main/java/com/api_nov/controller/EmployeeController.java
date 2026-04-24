package com.api_nov.controller;

import com.api_nov.dto.APIResponse;
import com.api_nov.dto.EmployeeDto;
import com.api_nov.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/add")
    public APIResponse<EmployeeDto> add(@RequestBody EmployeeDto dto) {

        return employeeService.add(dto);
        }
}
