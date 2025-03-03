package com.proyecto.reservaCanchas.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private String password;
    @ManyToOne
    @JoinColumn(name = "rol_id", nullable = false)
    private Rol rol;
    @OneToOne(mappedBy = "user")
    private Reserva reserva;

    @OneToMany(mappedBy = "admin", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Cancha> canchas;

    public User() {
    }

    public User(Long id, String nombre, String apellido, String email, String password, Rol rol, Reserva reserva,
                List<Cancha> canchas) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.rol = rol;
        this.reserva = reserva;
        this.password = password;
        this.canchas = canchas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
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

