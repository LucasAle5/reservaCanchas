package com.proyecto.reservaCanchas.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Pago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal monto;
    private LocalDateTime tiempoEsperaDePago;
    @ManyToOne
    private MetodoPago metodoPago;
    @OneToOne
    private StatusPago statusPago;

    public Pago() {
    }

    public Pago(Long id, BigDecimal monto, LocalDateTime tiempoEsperaDePago, MetodoPago metodoPago, StatusPago statusPago) {
        this.id = id;
        this.monto = monto;
        this.tiempoEsperaDePago = tiempoEsperaDePago;
        this.metodoPago = metodoPago;
        this.statusPago = statusPago;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public LocalDateTime getTiempoEsperaDePago() {
        return tiempoEsperaDePago;
    }

    public void setTiempoEsperaDePago(LocalDateTime tiempoEsperaDePago) {
        this.tiempoEsperaDePago = tiempoEsperaDePago;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public StatusPago getStatusPago() {
        return statusPago;
    }

    public void setStatusPago(StatusPago statusPago) {
        this.statusPago = statusPago;
    }
}
