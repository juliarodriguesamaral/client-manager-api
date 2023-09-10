package com.jra.clientmanagerapi.application.domain;

import com.jra.clientmanagerapi.application.domain.exception.InvalidAddressException;

public class Address {

    private String postalCode;
    private String country;
    private String state;
    private String city;
    private String neighborhood;
    private String street;
    private String number;
    private String complement;

    public Address(String postalCode, String country, String state, String city, String neighborhood, String street, String number, String complement) {

        validate(postalCode, country, state, city, neighborhood, street, number);


        this.postalCode = postalCode;
        this.country = country;
        this.state = state;
        this.city = city;
        this.neighborhood = neighborhood;
        this.street = street;
        this.number = number;
        this.complement = complement;

    }

    private void validate(String postalCode, String country, String state, String city, String neighborhood, String street, String number) {
        if (postalCode == null || postalCode.isEmpty() || postalCode.isBlank()) {
            throw new InvalidAddressException("Postal code cannot be null or empty.");
        }
        if (country == null || country.isEmpty() || country.isBlank()) {
            throw new InvalidAddressException("Country cannot be null or empty.");
        }
        if (state == null || state.isEmpty() || state.isBlank()) {
            throw new InvalidAddressException("State cannot be null or empty.");
        }
        if (city == null || city.isEmpty() || city.isBlank()) {
            throw new InvalidAddressException("City cannot be null or empty.");
        }
        if (neighborhood == null || neighborhood.isEmpty() || neighborhood.isBlank()) {
            throw new InvalidAddressException("Neighborhood cannot be null or empty.");
        }
        if (street == null || street.isEmpty() || street.isBlank()) {
            throw new InvalidAddressException("Street cannot be null or empty.");
        }
        if (number == null || number.isEmpty() || number.isBlank()) {
            throw new InvalidAddressException("Number cannot be null or empty.");
        }

    }

}
