package com.hwk.strategy.product;

public class Book {
    private String title;
    private String author;
    private float fullPrice;

    public Book(String title, String author, float fullPrice) {
        this.title = title;
        this.author = author;
        this.fullPrice = fullPrice;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getFullPrice() {
        return fullPrice;
    }

    public void setFullPrice(float fullPrice) {
        this.fullPrice = fullPrice;
    }
}
