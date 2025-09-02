package com.rodrigo.spring.specialist.java.web.employee.mappers;

import com.rodrigo.spring.specialist.java.core.models.entity.Employee;
import com.rodrigo.spring.specialist.java.datajpa.utils.StringUtils;
import com.rodrigo.spring.specialist.java.web.employee.dtos.EmployeeDetails;
import com.rodrigo.spring.specialist.java.web.employee.dtos.EmployeeForm;
import com.rodrigo.spring.specialist.java.web.employee.dtos.EmployeeListItem;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapperImpl implements EmployeeMapper{
    @Override
    public Employee toEmployee(EmployeeForm employeeForm) {
        return Employee.builder()
                .name(employeeForm.getName())
                .email(employeeForm.getEmail())
                .phone(StringUtils.formatPhone(employeeForm.getPhone()))
                .cpf(StringUtils.formatCpf(employeeForm.getCpf()))
                .birthDate(employeeForm.getBirthDate())
                .hireDate(employeeForm.getHireDate())
                .resignationDate(employeeForm.getResignationDate())
                .build();
    }

    @Override
    public EmployeeForm toEmployeeForm(Employee employee) {
        return EmployeeForm.builder()
                .name(employee.getName())
                .email(employee.getEmail())
                .phone(StringUtils.formatPhone(employee.getPhone()))
                .cpf(StringUtils.formatCpf(employee.getCpf()))
                .birthDate(employee.getBirthDate())
                .hireDate(employee.getHireDate())
                .resignationDate(employee.getResignationDate())
                .build();
    }

    @Override
    public EmployeeListItem toEmployeeListItem(Employee employee) {
        return EmployeeListItem.builder()
                .id(employee.getId())
                .name(employee.getName())
                .email(employee.getEmail())
                .phone(StringUtils.formatPhone(employee.getPhone()))
                .build();
    }

    @Override
    public EmployeeDetails toEmployeeDetails(Employee employee) {
        return EmployeeDetails.builder()
                .name(employee.getName())
                .email(employee.getEmail())
                .phone(StringUtils.formatPhone(employee.getPhone()))
                .cpf(StringUtils.formatCpf(employee.getCpf()))
                .birthDate(employee.getBirthDate())
                .hireDate(employee.getHireDate())
                .resignationDate(employee.getResignationDate())
                .build();
    }
}
