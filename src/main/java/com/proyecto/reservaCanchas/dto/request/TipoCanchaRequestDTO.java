package com.proyecto.reservaCanchas.dto.request;

public class TipoCanchaRequestDTO {

    private String name;

    public TipoCanchaRequestDTO(String name) {
        this.name = name;
    }

    public TipoCanchaRequestDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
