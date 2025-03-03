package com.proyecto.reservaCanchas.exception;

import org.springframework.http.HttpStatus;

public class UnauthorizedActionException extends RuntimeException {
    private final HttpStatus httpStatus;

    public UnauthorizedActionException(String message) {
        super(message);
        this.httpStatus = HttpStatus.FORBIDDEN;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
