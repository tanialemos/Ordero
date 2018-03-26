package be.tlemos.domain.orders;

import be.tlemos.domain.items.ItemStock;
import be.tlemos.domain.users.Customer;
import be.tlemos.domain.users.User;
import be.tlemos.domain.users.UserBuilder;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.*;

public class OrderRepository {

    private Map<Integer, Order> orderRepository;
    //GENERATING DATA
    Order order1;
    Order order2;
    ItemStock itemStock;

    @Inject
    public OrderRepository(ItemStock itemStock) {
        this.orderRepository = new HashMap<>();
        this.itemStock = itemStock;
        generateInitialOrderData();
    }

    private void generateInitialOrderData(){
        //GENERATING ITEMGROUP DATA
        ItemGroup itemGroup1 = new ItemGroup(1, itemStock.getItemById("Black Shoes"), 5);
        ItemGroup itemGroup2 = new ItemGroup(2, itemStock.getItemById("Black Shoes"), 3);
        ItemGroup itemGroup3 = new ItemGroup(3, itemStock.getItemById("Flip-flops"), 7);

        List<ItemGroup> listOfItemGroups1 = new ArrayList<>();
        listOfItemGroups1.add(itemGroup1);
        List<ItemGroup> listOfItemGroups2 = new ArrayList<>();
        listOfItemGroups2.add(itemGroup2);
        listOfItemGroups2.add(itemGroup3);

        User customer1 = new Customer(UserBuilder.buildUser().withFirstName("John").withLastName("Smith").withEMailAddress("john.smith@gmail.com").withPhoneNumber("0467895265"));
        User customer2 = new Customer(UserBuilder.buildUser().withFirstName("Peter").withLastName("Parker").withEMailAddress("peter.parker@gmail.com").withPhoneNumber("0489615789"));

        order1 = new Order(1, listOfItemGroups1, customer1);
        orderRepository.put(order1.getOrderNumber(), order1);
        order2 = new Order(2, listOfItemGroups2, customer2);
        orderRepository.put(order2.getOrderNumber(), order2);
    }

    public List<Order> showAllOrdersInRepository(){
        List<Order> itemList = new ArrayList<>();
        itemList.addAll(orderRepository.values());
        return itemList;
    }

    public void addOrderToRepository(Order order){
        orderRepository.put(order.getOrderNumber(), order);
    }
}
