package be.tlemos.api.orders;

import be.tlemos.domain.orders.ItemGroup;
import be.tlemos.domain.users.User;

import java.util.List;

public class OrderDto {

    private int orderNumber;
    private ItemGroup[] itemGroupList;
    private String customerId;
    private double totalPrice;

    public OrderDto(int orderNumber, ItemGroup[] itemGroupList, User customer, double totalPrice) {
        this.orderNumber = orderNumber;
        this.itemGroupList = itemGroupList;
        this.customerId = customer.getUserId();
        this.totalPrice = totalPrice;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public ItemGroup[] getItemGroupList() {
        return itemGroupList;
    }

    public String getCustomerId() {
        return customerId;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
