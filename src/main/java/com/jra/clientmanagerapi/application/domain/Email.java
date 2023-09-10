package com.jra.clientmanagerapi.application.domain;

import com.jra.clientmanagerapi.application.domain.exception.InvalidClientException;
import com.jra.clientmanagerapi.application.domain.exception.InvalidEmailException;
import lombok.Getter;

import java.util.regex.Pattern;

@Getter
public class Email {

    private String address;

    public Email(String address) {

        validate(address);

        this.address = address;

    }

    private void validate(String address) {
        if (address == null || address.isBlank() || address.isEmpty()) {
            throw new InvalidEmailException("Email cannot be created with a null or empty address.");
        }
        if (!Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$").matcher(address).matches()) {
            throw new InvalidEmailException("The email address is not valid. For example, 'user@example.com' is a valid email address.");
        }
    }
}
