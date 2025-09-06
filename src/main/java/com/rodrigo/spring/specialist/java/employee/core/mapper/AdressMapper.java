package com.rodrigo.spring.specialist.java.employee.core.mapper;

import com.rodrigo.spring.specialist.java.employee.core.entity.Adress;
import com.rodrigo.spring.specialist.java.employee.core.models.AdressForm;

public interface AdressMapper {

    AdressForm toAdressForm(Adress adress);

    Adress toAdress(AdressForm form);

    String formatAdressString(Adress adress);
}
