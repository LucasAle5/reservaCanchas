package com.proyecto.reservaCanchas.dto.response;

import com.proyecto.reservaCanchas.model.Cancha;

import java.util.List;

public class UserResponseAdminDTO {

    private String nombre;
    private String apellido;
    private String email;
    private List<Cancha> canchas;

    public UserResponseAdminDTO() {
    }

    public UserResponseAdminDTO(String nombre, String apellido, String email, List<Cancha> canchas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.canchas = canchas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Cancha> getCanchas() {
        return canchas;
    }

    public void setCanchas(List<Cancha> canchas) {
        this.canchas = canchas;
    }
}
