package com.proyecto.reservaCanchas.repository;

import com.proyecto.reservaCanchas.model.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaRespository extends JpaRepository<Reserva,Long> {
}
