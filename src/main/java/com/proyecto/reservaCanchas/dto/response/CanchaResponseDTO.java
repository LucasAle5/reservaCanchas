package com.proyecto.reservaCanchas.dto.response;

import com.proyecto.reservaCanchas.model.TipoCancha;
import com.proyecto.reservaCanchas.model.User;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class CanchaResponseDTO {
    private String ubicacion;
    private BigDecimal precio;
    private LocalDateTime horaApertura;
    private LocalDateTime horaCierre;
    private TipoCancha tipoCancha;
    private User admin;
    private Double latitud;
    private Double longitud;

    public CanchaResponseDTO() {
    }

    public CanchaResponseDTO(String ubicacion, BigDecimal precio, LocalDateTime horaApertura, LocalDateTime horaCierre, TipoCancha tipoCancha, User admin, Double latitud, Double longitud) {
        this.ubicacion = ubicacion;
        this.precio = precio;
        this.horaApertura = horaApertura;
        this.horaCierre = horaCierre;
        this.tipoCancha = tipoCancha;
        this.admin = admin;
        this.latitud = latitud;
        this.longitud = longitud;
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

    public User getAdmin() {
        return admin;
    }

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }
}
