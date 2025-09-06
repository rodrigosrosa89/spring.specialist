package com.rodrigo.spring.specialist.java.employee.core.models;

import com.rodrigo.spring.specialist.java.employee.core.entity.ClientEntity;
import com.rodrigo.spring.specialist.java.employee.core.StringUtils;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClientListItem {

    private Long id;

    private String name;

    private String phone;

    private String email;

    public String getPhone() {
        return StringUtils.formatPhone(phone);
    }

    public static ClientListItem of(ClientEntity clientEntity) {
        return ClientListItem.builder()
            .id(clientEntity.getId())
            .name(clientEntity.getName())
            .email(clientEntity.getEmail())
            .phone(clientEntity.getPhone())
            .build();
    }
    
}
