package com.hwk.strategy.sales;

import com.hwk.strategy.product.Book;

import java.util.ArrayList;
import java.util.List;

public class Order implements IOrder{

    private List<Book> books = new ArrayList<>();

    @Override
    public void addProduct(Book book) {
        books.add(book);
    }

    @Override
    public float calculateTotal() {
        int value = 0;
        for (Book book: books){
            value += book.getFullPrice();
        }

        return value;
    }
}
