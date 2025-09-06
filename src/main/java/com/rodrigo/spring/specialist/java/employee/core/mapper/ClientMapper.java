package com.rodrigo.spring.specialist.java.employee.core.mapper;

import com.rodrigo.spring.specialist.java.employee.core.models.ClientRecord;
import com.rodrigo.spring.specialist.java.employee.core.entity.ClientEntity;

public interface ClientMapper {

    ClientEntity toClientEntity(ClientRecord clientRecord);

    ClientRecord toClientRecord(ClientEntity clientEntity);

}
