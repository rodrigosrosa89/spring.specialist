package com.rodrigo.spring.specialist.java.employee.core.mapper;

import com.rodrigo.spring.specialist.java.employee.core.entity.Employee;
import com.rodrigo.spring.specialist.java.employee.core.models.EmployeeDetails;
import com.rodrigo.spring.specialist.java.employee.core.models.EmployeeForm;
import com.rodrigo.spring.specialist.java.employee.core.models.EmployeeListItem;

public interface EmployeeMapper {

    Employee toEmployee(EmployeeForm employeeForm);

    EmployeeForm toEmployeeForm(Employee employee);

    EmployeeListItem toEmployeeListItem(Employee employee);

    EmployeeDetails toEmployeeDetails(Employee employee);
}
