package com.rodrigo.spring.specialist.java.web.employee.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeListItem {

    private Long id;
    private String name;
    private String email;
    private String phone;
}
