package com.rodrigo.spring.specialist.java.web.employee.mappers;

import com.rodrigo.spring.specialist.java.core.models.entity.Employee;
import com.rodrigo.spring.specialist.java.web.employee.dtos.EmployeeDetails;
import com.rodrigo.spring.specialist.java.web.employee.dtos.EmployeeForm;
import com.rodrigo.spring.specialist.java.web.employee.dtos.EmployeeListItem;

public interface EmployeeMapper {

    Employee toEmployee(EmployeeForm employeeForm);

    EmployeeForm toEmployeeForm(Employee employee);

    EmployeeListItem toEmployeeListItem(Employee employee);

    EmployeeDetails toEmployeeDetails(Employee employee);
}
