package com.proyecto.reservaCanchas.repository;

import com.proyecto.reservaCanchas.model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol,Long> {

    Rol findByNombre(String nombre);
}
