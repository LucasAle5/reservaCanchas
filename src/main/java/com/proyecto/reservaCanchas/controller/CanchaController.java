package com.proyecto.reservaCanchas.controller;

import com.proyecto.reservaCanchas.dto.request.CanchaRequestDTO;
import com.proyecto.reservaCanchas.dto.response.CanchaResponseDTO;
import com.proyecto.reservaCanchas.rest.GenericResponse;
import com.proyecto.reservaCanchas.service.CanchaService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cancha")
public class CanchaController {

    private final CanchaService canchaService;

    public CanchaController(CanchaService canchaService) {
        this.canchaService = canchaService;
    }

    @PostMapping("/create")
    public ResponseEntity<GenericResponse<CanchaResponseDTO>> createCancha(@RequestBody @Valid CanchaRequestDTO canchaRequestDTO){
        CanchaResponseDTO cancha = canchaService.createCancha(canchaRequestDTO);
        return GenericResponse.createdResponse(cancha);
    }


}
