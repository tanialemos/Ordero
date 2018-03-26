package be.tlemos.domain.orders;

import be.tlemos.domain.items.Item;
import be.tlemos.domain.items.ItemStock;
import be.tlemos.domain.users.User;
import be.tlemos.domain.users.UserRepository;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Order {

    private ItemStock itemStock;
    private UserRepository userRepository;
    private User customer;
    private int orderNumber;
    private List<ItemGroup> itemGroupList;
    private double totalPrice;
    ItemGroup itemGroup1;
    ItemGroup itemGroup2;
    private int itemGroupIdCounter;

    @Inject
    public Order(ItemStock itemStock, UserRepository userRepository, User customer, int orderNumber, double totalPrice) {
        this.itemStock = itemStock;
        this.userRepository = userRepository;
        this.customer = customer;
        this.orderNumber = orderNumber;
        this.totalPrice = totalPrice;
        itemGroupList = new ArrayList<>();
        itemGroupIdCounter = 3;
    }

    private void generateInitialOrderGroupData(){
        itemGroup1 = new ItemGroup(1, itemStock.getItemById("Black Shoes"), 5);
        itemGroup2 = new ItemGroup(2, itemStock.getItemById("Flip-flops"), 7);
        itemGroupList.add(itemGroup1);
        itemGroupList.add(itemGroup2);
    }

    public void addItemGroupToOrder(Item item, int orderedAmount){
        ItemGroup newItemGroup = new ItemGroup(itemGroupIdCounter, item, orderedAmount);
        itemGroupList.add(newItemGroup);
        itemGroupIdCounter++;
    }

    public List<ItemGroup> getAllItemGroupsInOrder(){
        return Collections.unmodifiableList(itemGroupList);
    }

    public ItemStock getItemStock() {
        return itemStock;
    }

    public void setItemStock(ItemStock itemStock) {
        this.itemStock = itemStock;
    }

    public UserRepository getUserRepository() {
        return userRepository;
    }

    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
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

    public ItemGroup getItemGroup1() {
        return itemGroup1;
    }

    public void setItemGroup1(ItemGroup itemGroup1) {
        this.itemGroup1 = itemGroup1;
    }

    public ItemGroup getItemGroup2() {
        return itemGroup2;
    }

    public void setItemGroup2(ItemGroup itemGroup2) {
        this.itemGroup2 = itemGroup2;
    }
}
