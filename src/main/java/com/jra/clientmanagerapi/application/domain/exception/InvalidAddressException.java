package com.jra.clientmanagerapi.application.domain.exception;

public class InvalidAddressException extends RuntimeException{

    public InvalidAddressException(String message) {
        super(message);
    }
}
