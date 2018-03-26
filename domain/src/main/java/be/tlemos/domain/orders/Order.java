package be.tlemos.domain.orders;

import be.tlemos.domain.items.Item;
import be.tlemos.domain.items.ItemStock;
import be.tlemos.domain.users.User;
import be.tlemos.domain.users.UserRepository;

import javax.inject.Inject;
import java.util.ArrayList;
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

    @Inject
    public Order(ItemStock itemStock, UserRepository userRepository, User customer, int orderNumber, double totalPrice) {
        this.itemStock = itemStock;
        this.userRepository = userRepository;
        this.customer = customer;
        this.orderNumber = orderNumber;
        this.totalPrice = totalPrice;
        itemGroupList = new ArrayList<>();
    }

    private void generateInitialOrderGroupData(){
        itemGroup1 = new ItemGroup(1, itemStock.getItemById("Black Shoes"), 5);
        itemGroup2 = new ItemGroup(2, itemStock.getItemById("Flip-flops"), 7);
    }
}
