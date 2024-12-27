package com.proyecto.reservaCanchas.service;

import com.proyecto.reservaCanchas.dto.request.UserRequestAdminDTO;
import com.proyecto.reservaCanchas.dto.request.UserRequestDTO;
import com.proyecto.reservaCanchas.dto.response.UserResponseAdminDTO;
import com.proyecto.reservaCanchas.dto.response.UserResponseDTO;
import com.proyecto.reservaCanchas.model.User;

public interface UserService {

    UserResponseDTO createUserCliente(UserRequestDTO userRequestDTO);
    User findUserByEmail(String email);
    UserResponseAdminDTO createUserAdmin(UserRequestAdminDTO userRequestAdminDTO);







}
