package com.proyecto.reservaCanchas.repository;

import com.proyecto.reservaCanchas.model.Cancha;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CanchaRepository extends JpaRepository<Cancha,Long> {


}
