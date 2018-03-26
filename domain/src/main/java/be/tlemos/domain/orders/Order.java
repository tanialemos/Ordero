package be.tlemos.domain.orders;

import be.tlemos.domain.items.Item;
import be.tlemos.domain.items.ItemStock;
import be.tlemos.domain.users.User;
import be.tlemos.domain.users.UserRepository;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Order {

    private int orderNumber;
    private List<ItemGroup> itemGroupList;
    private User customer;
    private double totalPrice;
//    ItemGroup itemGroup1;
//    ItemGroup itemGroup2;
    private int itemGroupIdCounter;


    public Order(int OrderNumber, List<ItemGroup> itemGroupList, User customer) {
        this.customer = customer;
        this.orderNumber = orderNumber;
        this.itemGroupList = itemGroupList;
        itemGroupIdCounter = 1;
    }

//    private void generateInitialOrderGroupData(){
//        itemGroup1 = new ItemGroup(1, itemStock.getItemById("Black Shoes"), 5);
//        itemGroup2 = new ItemGroup(2, itemStock.getItemById("Flip-flops"), 7);
//        itemGroupList.add(itemGroup1);
//        itemGroupList.add(itemGroup2);
//    }

//    public void addItemGroupToOrder(Item item, int orderedAmount){
//        ItemGroup newItemGroup = new ItemGroup(itemGroupIdCounter, item, orderedAmount);
//        itemGroupList.add(newItemGroup);
//        itemGroupIdCounter++;
//    }

    public List<ItemGroup> showAllItemGroupsInOrder(){
        return Collections.unmodifiableList(itemGroupList);
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
