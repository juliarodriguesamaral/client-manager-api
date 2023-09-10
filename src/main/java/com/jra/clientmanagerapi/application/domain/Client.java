package com.jra.clientmanagerapi.application.domain;

import com.jra.clientmanagerapi.application.domain.exception.InvalidClientException;
import lombok.Getter;

import java.util.UUID;

@Getter
public class Client {

    private UUID id;
    private String name;
    private String lastName;
    private Email email;
    private Address address;



    public Client(String name, String lastName, Email email, Address address) {

        validate(name, lastName, email, address);

        this.id = UUID.randomUUID();
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.address = address;

    }

    private void validate(String name, String lastName, Email email, Address address) {

        if(name == null || name.isEmpty() || name.isBlank()) {

            throw new InvalidClientException("Client cannot be created with a null or empty name.");

        }
        if(lastName == null || lastName.isEmpty() || lastName.isBlank()) {

            throw new InvalidClientException("Client cannot be created with a null or empty lastname.");

        }
        if(email == null) {

            throw new InvalidClientException("Client cannot be created with a null email.");

        }
        if(address == null) {

            throw new InvalidClientException("Client cannot be created with a null address.");

        }

    }
}
