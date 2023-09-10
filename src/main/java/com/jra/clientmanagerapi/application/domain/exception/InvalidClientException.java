package com.jra.clientmanagerapi.application.domain.exception;

public class InvalidClientException extends RuntimeException{

    public InvalidClientException(String message) {
        super(message);
    }
}
