package be.tlemos.domain.orders;

import be.tlemos.domain.users.User;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private User customer;
    private int orderNumber;
    private List<ItemGroup> itemGroupList;
    private double totalPrice;

    public Order(User customer, int orderNumber, double totalPrice) {
        this.customer = customer;
        this.orderNumber = orderNumber;
        this.totalPrice = totalPrice;
        itemGroupList = new ArrayList<>();
    }


}
