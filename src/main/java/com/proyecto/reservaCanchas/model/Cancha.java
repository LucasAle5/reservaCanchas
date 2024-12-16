package com.proyecto.reservaCanchas.model;

import com.proyecto.reservaCanchas.Enum.TipoCancha;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Cancha {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ubicacion;
    private BigDecimal precio;
    private LocalDateTime horaInicio;
    private LocalDateTime hora_fin;
    @Enumerated(EnumType.STRING)
    private TipoCancha tipoCancha;

    public Cancha() {
    }

    public Cancha(Long id, String ubicacion, BigDecimal precio, LocalDateTime horaInicio, LocalDateTime hora_fin, TipoCancha tipoCancha) {
        this.id = id;
        this.ubicacion = ubicacion;
        this.precio = precio;
        this.horaInicio = horaInicio;
        this.hora_fin = hora_fin;
        this.tipoCancha = tipoCancha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public LocalDateTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalDateTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalDateTime getHora_fin() {
        return hora_fin;
    }

    public void setHora_fin(LocalDateTime hora_fin) {
        this.hora_fin = hora_fin;
    }

    public TipoCancha getTipoCancha() {
        return tipoCancha;
    }

    public void setTipoCancha(TipoCancha tipoCancha) {
        this.tipoCancha = tipoCancha;
    }
}
