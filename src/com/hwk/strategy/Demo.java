package com.hwk.strategy;

import com.hwk.strategy.discount.*;
import com.hwk.strategy.product.Book;
import com.hwk.strategy.sales.IOrder;
import com.hwk.strategy.sales.Order;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Starting Strategy demo");

        Book statisticsBook = new Book("Stats for dummies","Matthew Smith",300.0f);
        Book horrorNovel = new Book("The Dunwich horror","H.P Lovecraft",200.0f);
        Book historyOfArt = new Book("history of modern Art","MOMA",500.0f);
        IOrder order = new Order();
        order.addProduct(statisticsBook);
        order.addProduct(horrorNovel);
        order.addProduct(historyOfArt);

        IContext context = new Context();
        IDiscount student = new StudentDiscount();
        IDiscount dulceViejita = new SeniorDiscount();
        IDiscount regular = new RegularDiscount();
        context.setPaymentStrategy(dulceViejita);
        float discount = context.pay(order);
        float total = order.calculateTotal()-discount;
        System.out.println("Total a pagar:"+ total);
        System.out.println("El descuentito:"+ discount);


        System.out.println("Ending Strategy demo");

    }
}
