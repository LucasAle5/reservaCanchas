package com.proyecto.reservaCanchas.service;

import com.proyecto.reservaCanchas.dto.request.UserRequestDTO;
import com.proyecto.reservaCanchas.dto.request.UserResponseDTO;
import com.proyecto.reservaCanchas.model.User;

public interface UserService {

    UserResponseDTO createUser(UserRequestDTO userRequestDTO);


}
