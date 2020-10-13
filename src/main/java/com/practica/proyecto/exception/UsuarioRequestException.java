package com.practica.proyecto.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UsuarioRequestException extends RuntimeException {

    public UsuarioRequestException(String message){
        super(message);
    }

    public UsuarioRequestException(String message, Throwable cause){
        super(message, cause);
    }
}
