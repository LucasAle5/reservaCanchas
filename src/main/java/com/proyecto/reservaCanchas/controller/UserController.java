package com.proyecto.reservaCanchas.controller;

import com.proyecto.reservaCanchas.dto.request.UserRequestAdminDTO;
import com.proyecto.reservaCanchas.dto.request.UserRequestDTO;
import com.proyecto.reservaCanchas.dto.response.UserResponseAdminDTO;
import com.proyecto.reservaCanchas.dto.response.UserResponseDTO;
import com.proyecto.reservaCanchas.model.User;
import com.proyecto.reservaCanchas.rest.GenericResponse;
import com.proyecto.reservaCanchas.service.UserService;
import jakarta.validation.Valid;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/registerClient")
    public ResponseEntity<GenericResponse<UserResponseDTO>> createUserClient(@RequestBody @Valid UserRequestDTO userRequestDTO) {
        UserResponseDTO user = userService.createUserCliente(userRequestDTO);
        return GenericResponse.createdResponse(user);
    }


    @GetMapping("/findByEmail")
    public ResponseEntity<GenericResponse<User>> findByEmail(@RequestParam ("email") String email) throws Exception {
        User user = userService.findUserByEmail(email);
        return GenericResponse.okResponse(user);
    }

    @PostMapping("/registerAdmin")
    public ResponseEntity<GenericResponse<UserResponseAdminDTO>> createUserAdmin(@RequestBody UserRequestAdminDTO userRequestAdminDTO){
        UserResponseAdminDTO user = userService.createUserAdmin(userRequestAdminDTO);
        return GenericResponse.createdResponse(user);
    }
}
