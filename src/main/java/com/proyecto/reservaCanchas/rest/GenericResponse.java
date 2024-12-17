package com.proyecto.reservaCanchas.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class GenericResponse<T> {

    private T data;
    private HttpStatus httpStatus;

    // Constructor
    public GenericResponse(T data, HttpStatus httpStatus) {
        this.data = data;
        this.httpStatus = httpStatus;
    }

    // Getters y setters
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    // Métodos estáticos para crear respuestas comunes
    public static <T> ResponseEntity<GenericResponse<T>> createdResponse(T data) {
        return ResponseEntity.status(HttpStatus.CREATED).body(new GenericResponse<>(data, HttpStatus.CREATED));
    }

    public static <T> ResponseEntity<GenericResponse<T>> acceptedResponse(T data) {
        return ResponseEntity.accepted().body(new GenericResponse<>(data, HttpStatus.ACCEPTED));
    }

    public static <T> ResponseEntity<GenericResponse<T>> okResponse(T data) {
        return ResponseEntity.ok(new GenericResponse<>(data, HttpStatus.OK));
    }

    public static <T> ResponseEntity<GenericResponse<T>> exceptionResponse(HttpStatus httpStatus) {
        return new ResponseEntity<>(new GenericResponse<>(null, httpStatus), httpStatus);
    }
}
