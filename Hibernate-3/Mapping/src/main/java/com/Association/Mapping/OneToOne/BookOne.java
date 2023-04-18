package com.Association.Mapping.OneToOne;

import jakarta.persistence.*;

@Entity
public class BookOne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @OneToOne
    @JoinColumn(name="id")
    private AuthorOne author;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AuthorOne getAuthor() {
        return author;
    }

    public void setAuthor(AuthorOne author) {
        this.author = author;
    }
}
