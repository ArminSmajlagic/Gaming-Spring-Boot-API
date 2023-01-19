package com.yellow.offer.Application.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class InternalServerErrorException extends ResponseStatusException {
    public InternalServerErrorException(String message){
        super(HttpStatus.INTERNAL_SERVER_ERROR, message);
    }
}