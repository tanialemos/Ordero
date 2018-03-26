package be.tlemos.domain.orders;

import be.tlemos.domain.users.User;

import java.lang.reflect.Array;
import java.util.Collections;
import java.util.List;

public class Order {

    private int orderNumber;
    private List<ItemGroup> itemGroupList;
    private User customer;
    private double totalPrice;

    public Order(int OrderNumber, List<ItemGroup> itemGroupList, User customer) {
        this.customer = customer;
        this.orderNumber = orderNumber;
        this.itemGroupList = itemGroupList;
    }

    public ItemGroup[] showAllItemGroupsInOrder(){
        ItemGroup[] itemGroups = new ItemGroup[itemGroupList.size()];
        return itemGroupList.toArray(itemGroups);
    }

    public User getCustomer() {
        return customer;
    }

    public void setCustomer(User customer) {
        this.customer = customer;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

}
