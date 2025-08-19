package com.rodrigo.spring.specialist.java.core.mapper;

import com.rodrigo.spring.specialist.java.core.models.dtos.ClientRecord;
import com.rodrigo.spring.specialist.java.core.models.entity.ClientEntity;

public interface ClientMapper {

    ClientEntity toClientEntity(ClientRecord clientRecord);

    ClientRecord toClientRecord(ClientEntity clientEntity);

}
