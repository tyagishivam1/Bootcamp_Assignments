package com.hiber2.hiber2.TablePerclass;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
public class Bank_Check extends Payment_Table{
    private String checkcard;

    public String getCheckcard() {
        return checkcard;
    }
    public void setCheckcard(String checkcard) {
        this.checkcard = checkcard;
    }
}

