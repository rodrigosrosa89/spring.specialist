package com.rodrigo.spring.specialist.java.web.employee.dtos;

import com.rodrigo.spring.specialist.java.core.enums.AdressStateEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AdressForm {
    private String city;

    private AdressStateEnum state;

    private String street;

    private String number;

    private String complement;

    private String zipCode;

    private String neighborhood;
}
