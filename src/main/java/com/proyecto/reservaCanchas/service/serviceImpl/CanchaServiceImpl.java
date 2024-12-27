package com.proyecto.reservaCanchas.service.serviceImpl;

import com.proyecto.reservaCanchas.dto.request.CanchaRequestDTO;
import com.proyecto.reservaCanchas.dto.response.CanchaResponseDTO;
import com.proyecto.reservaCanchas.mapper.CanchaMapper;
import com.proyecto.reservaCanchas.model.Cancha;
import com.proyecto.reservaCanchas.model.TipoCancha;
import com.proyecto.reservaCanchas.model.User;
import com.proyecto.reservaCanchas.repository.CanchaRepository;
import com.proyecto.reservaCanchas.repository.TipoCanchaRepository;
import com.proyecto.reservaCanchas.repository.UserRepository;
import com.proyecto.reservaCanchas.service.CanchaService;
import org.springframework.stereotype.Service;

@Service
public class CanchaServiceImpl implements CanchaService {
    private final CanchaRepository canchaRepository;
    private final UserRepository userRepository;
    private final TipoCanchaRepository tipoCanchaRepository;
    private final CanchaMapper canchaMapper;

    public CanchaServiceImpl(CanchaRepository canchaRepository, UserRepository userRepository,
                             TipoCanchaRepository tipoCanchaRepository, CanchaMapper canchaMapper) {
        this.canchaRepository = canchaRepository;
        this.userRepository = userRepository;
        this.tipoCanchaRepository = tipoCanchaRepository;
        this.canchaMapper = canchaMapper;
    }

    @Override
    public CanchaResponseDTO createCancha(CanchaRequestDTO canchaRequestDTO) {
        // Buscar el administrador por ID y validar su existencia
        User admin = userRepository.findById(canchaRequestDTO.getAdminId())
                .orElseThrow(() -> new RuntimeException("Administrador no encontrado"));

        // Validar que el usuario tiene rol de "admin"
        if (!admin.getRol().getNombre().equals("admin")) {
            throw new RuntimeException("El usuario no tiene el rol de admin, no puede crear canchas");
        }

        // Buscar el tipo de cancha por ID y validar su existencia
        TipoCancha tipoCancha = tipoCanchaRepository.findById(canchaRequestDTO.getTipoCanchaId())
                .orElseThrow(() -> new RuntimeException("Tipo de cancha no encontrado"));

        // Mapear el DTO a la entidad Cancha
        Cancha cancha = canchaMapper.reqToCancha(canchaRequestDTO);

        // Asignar las relaciones cargadas desde la base de datos
        cancha.setAdmin(admin);
        cancha.setTipoCancha(tipoCancha);

        // Guardar la entidad en la base de datos
        canchaRepository.save(cancha);

        // Convertir la entidad guardada a un DTO de respuesta y retornarlo
        return canchaMapper.canchaToCanchaResponse(cancha);
    }
}
