package com.jra.clientmanagerapi.application.domain.exception;

public class InvalidEmailException extends RuntimeException{

    public InvalidEmailException(String message) {
        super(message);
    }
}
