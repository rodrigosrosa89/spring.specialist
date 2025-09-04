package com.rodrigo.spring.specialist.java.web.employee.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeForm {
    private String name;
    private String email;
    private String phone;
    private String cpf;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate birthDate;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate hireDate;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate resignationDate;

    private AdressForm adressForm;
}
