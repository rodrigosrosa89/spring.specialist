package com.rodrigo.spring.specialist.java.core.enums;

public enum AdressStateEnum {

    MG("Minas Gerais"),
    RS("Rio Grande do Sul");

    private String description;

    private AdressStateEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
