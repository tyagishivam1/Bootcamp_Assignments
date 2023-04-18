package com.Association.Mapping;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;

@Embeddable
public class Address {
    private int streetNumber;
    private String location;
    private String state;

    public Address() {
    }

    public Address(int streetNumber, String location, String state) {
        this.streetNumber = streetNumber;
        this.location = location;
        this.state = state;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
