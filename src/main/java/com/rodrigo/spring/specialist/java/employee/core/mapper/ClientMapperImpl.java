package com.rodrigo.spring.specialist.java.employee.core.mapper;

import com.rodrigo.spring.specialist.java.employee.core.models.ClientRecord;
import com.rodrigo.spring.specialist.java.employee.core.entity.ClientEntity;
import org.springframework.stereotype.Component;

@Component
public class ClientMapperImpl implements ClientMapper {

    @Override
    public ClientEntity toClientEntity(ClientRecord clientRecord) {
        return new ClientEntity(
                clientRecord.id(),
                clientRecord.name(),
                clientRecord.email(),
                clientRecord.phone());
    }

    @Override
    public ClientRecord toClientRecord(ClientEntity clientEntity) {
        return new ClientRecord(
                clientEntity.getId(),
                clientEntity.getName(),
                clientEntity.getEmail(),
                clientEntity.getPhone());
    }
}
