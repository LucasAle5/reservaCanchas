package com.proyecto.reservaCanchas.dto.request;

import com.proyecto.reservaCanchas.model.Cancha;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import java.util.List;

public class UserRequestAdminDTO {

    @NotBlank(message = "El nombre es obligatorio")
    private String nombre;
    @NotBlank(message = "El apellido es obligatorio")
    private String apellido;
    @Email(message = "Debe proporcionar un email valido")
    private String email;
    @NotBlank(message = "la contraseña es obligatoria")
    private String password;
    private List<Cancha> canchas;

    public UserRequestAdminDTO() {
    }

    public UserRequestAdminDTO(String nombre, String apellido, String email, String password, List<Cancha> canchas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Cancha> getCanchas() {
        return canchas;
    }

    public void setCanchas(List<Cancha> canchas) {
        this.canchas = canchas;
    }
}
