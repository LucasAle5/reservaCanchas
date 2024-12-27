package com.proyecto.reservaCanchas.controller;

import com.proyecto.reservaCanchas.dto.response.TipoCanchaResponseDTO;
import com.proyecto.reservaCanchas.model.TipoCancha;
import com.proyecto.reservaCanchas.repository.TipoCanchaRepository;
import com.proyecto.reservaCanchas.rest.GenericResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tipoCancha")
public class TipoCanchaController {

    private final TipoCanchaRepository tipoCanchaRepository;

    public TipoCanchaController(TipoCanchaRepository tipoCanchaRepository) {
        this.tipoCanchaRepository = tipoCanchaRepository;
    }

    @GetMapping("/allTipoCancha")
    public ResponseEntity<GenericResponse<List<TipoCancha>>> getAllTipoCancha(){
        List<TipoCancha> tipoCanchas = tipoCanchaRepository.findAll();
        return GenericResponse.okResponse(tipoCanchas);
    }

}