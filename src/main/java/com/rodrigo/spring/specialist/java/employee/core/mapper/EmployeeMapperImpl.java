package com.rodrigo.spring.specialist.java.employee.core.mapper;

import com.rodrigo.spring.specialist.java.employee.core.entity.Employee;
import com.rodrigo.spring.specialist.java.employee.core.StringUtils;
import com.rodrigo.spring.specialist.java.employee.core.models.EmployeeDetails;
import com.rodrigo.spring.specialist.java.employee.core.models.EmployeeForm;
import com.rodrigo.spring.specialist.java.employee.core.models.EmployeeListItem;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EmployeeMapperImpl implements EmployeeMapper{

    private final AdressMapper adressMapper;

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
                .adress(adressMapper.toAdress(employeeForm.getAdressForm()))
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
                .adressForm(adressMapper.toAdressForm(employee.getAdress()))
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
                .adress(adressMapper.formatAdressString(employee.getAdress()))
                .build();
    }
}
