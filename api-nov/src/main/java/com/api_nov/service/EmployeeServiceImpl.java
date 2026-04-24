package com.api_nov.service;
import com.api_nov.dto.APIResponse;
import com.api_nov.dto.EmployeeDto;
import com.api_nov.entity.Employee;
import com.api_nov.repository.EmployeeRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.BeanUtils;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    @Override
    public APIResponse<EmployeeDto> add(EmployeeDto employeeDto) {

        if (employeeRepository.existsByMobileNo(employeeDto.getMobileNo())){
            return new APIResponse<>("Mobile no already exists", 400, null);
    }
        Employee emp = new Employee();
        emp.setName(employeeDto.getName());
        emp.setSalary(employeeDto.getSalary());
        emp.setDepartment(employeeDto.getDepartment());
        emp.setEmailId(employeeDto.getEmailId());
        emp.setMobileNo(employeeDto.getMobileNo());

        Employee savedEmployee = employeeRepository.save(emp);

        EmployeeDto savedDto = new EmployeeDto();
        BeanUtils.copyProperties(savedEmployee, savedDto);

        return new APIResponse<>("Created", 201, savedDto);
    }
    @Override
    public void deleteEmployee(long id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public EmployeeDto updateEmployee(long id, EmployeeDto employeeDto) {
        return null;
    }

    @Override
    public List<EmployeeDto> getAllEmployees() {
        return List.of();
    }
}
