package com.proyecto.reservaCanchas.exception;

public class ResourceNotFoundException extends RuntimeException{
    private final String email;

    public ResourceNotFoundException(String email){
        super(String.format("Usuario no encontrado con el email: '%S'", email));
        this.email=email;
    }

    public String getEmail() {
        return email;
    }
}
