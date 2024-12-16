package com.proyecto.reservaCanchas.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDateTime tiempoDeUso;
    @OneToOne
    @JoinColumn(name = "status_reserva_id")
    private StatusReserva statusReserva;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne
    @JoinColumn(name = "pago_id")
    private Pago pago;
    @OneToOne
    @JoinColumn(name = "cancha_id")
    private Cancha cancha;

    public Reserva() {
    }

    public Reserva(int id, LocalDateTime tiempoDeUso, StatusReserva statusReserva, User user, Pago pago, Cancha cancha) {
        this.id = id;
        this.tiempoDeUso = tiempoDeUso;
        this.statusReserva = statusReserva;
        this.user = user;
        this.pago = pago;
        this.cancha = cancha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getTiempoDeUso() {
        return tiempoDeUso;
    }

    public void setTiempoDeUso(LocalDateTime tiempoDeUso) {
        this.tiempoDeUso = tiempoDeUso;
    }

    public StatusReserva getStatusReserva() {
        return statusReserva;
    }

    public void setStatusReserva(StatusReserva statusReserva) {
        this.statusReserva = statusReserva;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }

    public Cancha getCancha() {
        return cancha;
    }

    public void setCancha(Cancha cancha) {
        this.cancha = cancha;
    }
}
