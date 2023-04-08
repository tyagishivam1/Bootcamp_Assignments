package com.hiber2.hiber2.TablePerclass;
import jakarta.persistence.Entity;

@Entity

public class Credit_card extends Payment_Table {
    private String creditcard;

    public String getCreditcard() {
        return creditcard;
    }

    public void setCreditcard(String creditcard) {
        this.creditcard = creditcard;
    }
}
