package com.proyecto.reservaCanchas.service.serviceImpl;

import com.proyecto.reservaCanchas.dto.request.UserRequestAdminDTO;
import com.proyecto.reservaCanchas.dto.request.UserRequestDTO;
import com.proyecto.reservaCanchas.dto.response.UserResponseAdminDTO;
import com.proyecto.reservaCanchas.dto.response.UserResponseDTO;
import com.proyecto.reservaCanchas.exception.ResourceAlreadyExistsException;
import com.proyecto.reservaCanchas.exception.ResourceNotFoundException;
import com.proyecto.reservaCanchas.mapper.UserMapper;
import com.proyecto.reservaCanchas.model.Rol;
import com.proyecto.reservaCanchas.model.User;
import com.proyecto.reservaCanchas.repository.RolRepository;
import com.proyecto.reservaCanchas.repository.UserRepository;
import com.proyecto.reservaCanchas.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final RolRepository rolRepository;
    private final UserMapper userMapper;
    public UserServiceImpl(UserRepository userRepository, RolRepository rolRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.rolRepository = rolRepository;
        this.userMapper = userMapper;
    }

    @Override
    public UserResponseDTO createUserCliente(UserRequestDTO userRequestDTO) {

        if(userRepository.findByEmail(userRequestDTO.getEmail()).isPresent()){
            throw new ResourceAlreadyExistsException(
                    "El email " + userRequestDTO.getEmail() + " ya esta registrado a una cuenta",
                    HttpStatus.CONFLICT
            );
        }
        User user = new User();

        user.setNombre(userRequestDTO.getNombre());
        user.setApellido(userRequestDTO.getApellido());
        user.setEmail(userRequestDTO.getEmail());
        user.setPassword(userRequestDTO.getPassword());

        Rol rolCliente = rolRepository.findByNombre("cliente");
        user.setRol(rolCliente);

        userRepository.save(user);

        return userMapper.userToUserResponse(user);
    }

    @Override
    public User findUserByEmail(String email){
        return userRepository.findByEmail(email)
                .orElseThrow(() -> new ResourceNotFoundException(email));
    }

    @Override
    public UserResponseAdminDTO createUserAdmin(UserRequestAdminDTO userRequestAdminDTO) {

        if (userRepository.findByEmail(userRequestAdminDTO.getEmail()).isPresent()) {
            throw  new ResourceAlreadyExistsException("El email " + userRequestAdminDTO.getEmail() + "ya pertenece a una cuenta registrada",
                    HttpStatus.CONFLICT);
        }

        User admin = new User();

        admin.setNombre(userRequestAdminDTO.getNombre());
        admin.setApellido(userRequestAdminDTO.getApellido());
        admin.setEmail(userRequestAdminDTO.getEmail());
        admin.setCanchas(userRequestAdminDTO.getCanchas());
        admin.setPassword(userRequestAdminDTO.getPassword());

        Rol rolCliente = rolRepository.findByNombre("admin");
        admin.setRol(rolCliente);

        userRepository.save(admin);

        return userMapper.adminToResponseAdmin(admin);
    }


}
