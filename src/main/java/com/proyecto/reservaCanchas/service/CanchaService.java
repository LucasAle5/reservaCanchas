package com.proyecto.reservaCanchas.service;

import com.proyecto.reservaCanchas.dto.request.CanchaRequestDTO;
import com.proyecto.reservaCanchas.dto.response.CanchaResponseDTO;

public interface CanchaService {

    CanchaResponseDTO createCancha(CanchaRequestDTO canchaRequestDTO);

}
