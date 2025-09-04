package com.rodrigo.spring.specialist.java.web.employee.mappers;

import com.rodrigo.spring.specialist.java.core.models.entity.Adress;
import com.rodrigo.spring.specialist.java.web.employee.dtos.AdressForm;

public interface AdressMapper {

    AdressForm toAdressForm(Adress adress);

    Adress toAdress(AdressForm form);

    String formatAdressString(Adress adress);
}
