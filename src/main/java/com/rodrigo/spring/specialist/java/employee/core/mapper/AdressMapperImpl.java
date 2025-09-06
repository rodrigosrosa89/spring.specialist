package com.rodrigo.spring.specialist.java.employee.core.mapper;

import com.rodrigo.spring.specialist.java.employee.core.entity.Adress;
import com.rodrigo.spring.specialist.java.employee.core.StringUtils;
import com.rodrigo.spring.specialist.java.employee.core.models.AdressForm;
import org.springframework.stereotype.Component;

@Component
public class AdressMapperImpl implements AdressMapper{
    @Override
    public AdressForm toAdressForm(Adress adress) {
        return AdressForm.builder()
                .city(adress.getCity())
                .state(adress.getState())
                .street(adress.getStreet())
                .number(adress.getNumber())
                .complement(adress.getComplement())
                .zipCode(StringUtils.cleanZipCode(adress.getZipCode()))
                .neighborhood(adress.getNeighborhood())
                .build();
    }

    @Override
    public Adress toAdress(AdressForm form) {
        return Adress.builder()
                .city(form.getCity())
                .state(form.getState())
                .street(form.getStreet())
                .number(form.getNumber())
                .complement(form.getComplement())
                .zipCode(StringUtils.cleanZipCode(form.getZipCode()))
                .neighborhood(form.getNeighborhood())
                .build();
    }

    @Override
    public String formatAdressString(Adress adress) {
        return String.format(
                "%s , %s - %s - %s - %s",
                adress.getStreet(),
                adress.getNumber(),
                adress.getNeighborhood(),
                adress.getCity(),
                adress.getState()
        );
    }
}
