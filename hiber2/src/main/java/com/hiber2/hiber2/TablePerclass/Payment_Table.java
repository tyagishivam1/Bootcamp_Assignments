package com.hiber2.hiber2.TablePerclass;

import jakarta.persistence.*;
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Payment_Table{
    @Id
    private int Id;
    private double amount;
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
