package com.proyecto.reservaCanchas.repository;

import com.proyecto.reservaCanchas.model.TipoCancha;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface TipoCanchaRepository extends JpaRepository<TipoCancha, Long> {
    Optional<TipoCancha> findByNombre(String nombre);
    Optional<TipoCancha> findById(Long tipoCanchaId);
    List<TipoCancha> findAll();
}
