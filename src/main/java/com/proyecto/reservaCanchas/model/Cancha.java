package com.proyecto.reservaCanchas.model;

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
    private LocalDateTime horaApertura;
    private LocalDateTime horaCierre;
    @ManyToOne
    private TipoCancha tipoCancha;

    public Cancha() {
    }

    public Cancha(Long id, String ubicacion, BigDecimal precio, LocalDateTime horaApertura, LocalDateTime horaCierre, TipoCancha tipoCancha) {
        this.id = id;
        this.ubicacion = ubicacion;
        this.precio = precio;
        this.horaApertura = horaApertura;
        this.horaCierre = horaCierre;
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

    public LocalDateTime getHoraApertura() {
        return horaApertura;
    }

    public void setHoraApertura(LocalDateTime horaApertura) {
        this.horaApertura = horaApertura;
    }

    public LocalDateTime getHoraCierre() {
        return horaCierre;
    }

    public void setHoraCierre(LocalDateTime horaCierre) {
        this.horaCierre = horaCierre;
    }

    public TipoCancha getTipoCancha() {
        return tipoCancha;
    }

    public void setTipoCancha(TipoCancha tipoCancha) {
        this.tipoCancha = tipoCancha;
    }
}
