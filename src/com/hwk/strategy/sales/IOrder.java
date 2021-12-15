package com.hwk.strategy.sales;

import com.hwk.strategy.product.Book;

public interface IOrder {
    void addProduct(Book book);

    float calculateTotal();
}
