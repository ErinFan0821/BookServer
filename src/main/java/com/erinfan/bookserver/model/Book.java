package com.erinfan.bookserver.model;

import java.io.Serializable;

/**
 * Created by techops on 5/11/14.
 */
public class Book implements Serializable {
    private int isbn;
    private String name;
    private String author;
    private double price;

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
