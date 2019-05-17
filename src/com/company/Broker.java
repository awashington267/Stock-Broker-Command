package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is the Invoker: it executes the Commands.
 */
public class Broker {
    private String undoName;
    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }



    public void placeOrders() {

        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }

    public void undoOrder(Order order) {
        if(!orderList.isEmpty())
        {
            orderList.lastIndexOf(order);
        }

    }
}
