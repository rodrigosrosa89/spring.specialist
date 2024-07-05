package com.rodrigo.spring.specialist.java.web.clients.dtos;

import br.com.treinaweb.twprojects.core.utils.StringUtils;
import com.rodrigo.spring.specialist.java.datajpa.models.Client;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClientForm {

    @NotBlank
    @Size(max = 400)
    private String name;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    @Pattern(regexp = "\\(\\d{2}\\) d{5}-\\d{4}$", message = "telefone deve ter formato com DDD")
    private String phone;

    public Client toClient() {
        return Client.builder()
            .name(name)
            .email(email)
            .phone(StringUtils.cleanPhone(phone))
            .build();
    }

    public static ClientForm of(Client client) {
        return ClientForm.builder()
            .name(client.getName())
            .email(client.getEmail())
            .phone(StringUtils.formatPhone(client.getPhone()))
            .build();
    }
    
}
