package com.rodrigo.spring.specialist.java.core.exceptions;

public class EmployeeNotFoundException extends RuntimeException{

    public EmployeeNotFoundException() {
        super("Funcionário não encontrado!");
    }
}
