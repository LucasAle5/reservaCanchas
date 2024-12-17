package com.proyecto.reservaCanchas.mapper;

import com.proyecto.reservaCanchas.dto.request.UserRequestDTO;
import com.proyecto.reservaCanchas.dto.request.UserResponseDTO;
import com.proyecto.reservaCanchas.model.User;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface UserMapper {

    User requestToUser(UserRequestDTO userRequestDTO);

    UserResponseDTO userToUserResponse(User user);
}
