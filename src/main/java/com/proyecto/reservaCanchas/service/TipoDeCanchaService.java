package com.proyecto.reservaCanchas.service;

import com.proyecto.reservaCanchas.dto.request.TipoCanchaRequestDTO;
import com.proyecto.reservaCanchas.dto.response.TipoCanchaResponseDTO;

public interface TipoDeCanchaService {

    TipoCanchaResponseDTO create(TipoCanchaRequestDTO tipoCanchaRequestDTO);
}
