package com.proyecto.reservaCanchas.mapper;

import com.proyecto.reservaCanchas.dto.request.CanchaRequestDTO;
import com.proyecto.reservaCanchas.dto.response.CanchaResponseDTO;
import com.proyecto.reservaCanchas.model.Cancha;
import com.proyecto.reservaCanchas.model.TipoCancha;
import com.proyecto.reservaCanchas.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface CanchaMapper {

    @Mapping(target = "id", ignore = true) // Se ignora el ID porque se genera automáticamente
    @Mapping(target = "admin", source = "adminId", qualifiedByName = "mapUser")
    @Mapping(target = "tipoCancha", source = "tipoCanchaId", qualifiedByName = "mapTipoCancha")
    Cancha reqToCancha(CanchaRequestDTO canchaRequestDTO);

    CanchaResponseDTO canchaToCanchaResponse(Cancha cancha);

    @Named("mapUser")
    default User mapUser(Long adminId) {
        if (adminId == null) {
            return null;
        }
        User user = new User();
        user.setId(adminId); // Solo establecemos el ID para la relación
        return user;
    }

    @Named("mapTipoCancha")
    default TipoCancha mapTipoCancha(Long tipoCanchaId) {
        if (tipoCanchaId == null) {
            return null;
        }
        TipoCancha tipoCancha = new TipoCancha();
        tipoCancha.setId(tipoCanchaId); // Solo establecemos el ID para la relación
        return tipoCancha;
    }
}
