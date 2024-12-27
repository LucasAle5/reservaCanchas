package com.proyecto.reservaCanchas.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class CanchaRequestDTO {
    @NotBlank(message = "Debe proporciona la direccion de la cancha")
    private String ubicacion;
    @NotNull(message = "Debe indicar el precio por hora de la cancha")
    private BigDecimal precio;
    @NotNull(message = "Debe indicar el horario de apertura de la cancha")
    private LocalDateTime horaApertura;
    @NotNull(message = "Debe indicar el horario de cierre de la cancha")
    private LocalDateTime horaCierre;
    private Long tipoCanchaId;
    private Long adminId;
    private Double latitud;
    private Double longitud;

    public CanchaRequestDTO() {
    }

    public CanchaRequestDTO(String ubicacion, BigDecimal precio, LocalDateTime horaApertura, LocalDateTime horaCierre, Long tipoCanchaId, Long adminId,
                            Double latitud, Double longitud) {
        this.ubicacion = ubicacion;
        this.precio = precio;
        this.horaApertura = horaApertura;
        this.horaCierre = horaCierre;
        this.tipoCanchaId = tipoCanchaId;
        this.adminId = adminId;
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

    public Long getTipoCanchaId() {
        return tipoCanchaId;
    }

    public void setTipoCanchaId(Long tipoCanchaId) {
        this.tipoCanchaId = tipoCanchaId;
    }

    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long admin) {
        this.adminId = admin;
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
