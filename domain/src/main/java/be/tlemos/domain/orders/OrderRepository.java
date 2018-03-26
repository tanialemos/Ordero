package be.tlemos.domain.orders;

import be.tlemos.domain.items.ItemStock;
import be.tlemos.domain.users.Customer;
import be.tlemos.domain.users.UserBuilder;

import javax.inject.Named;
import java.time.LocalDate;
import java.util.*;

@Named
public class OrderRepository {

    private Map<Integer, Order> orderRepository;
    private int orderCounter;
    //FOR THE PURPOSE OF GENERATING INITIAL DATA
    Order order1;
    Order order2;
    ItemStock itemStock;

    public OrderRepository() {
        this.orderRepository = new HashMap<>();
        this.itemStock = new ItemStock();
        generateInitialOrderData();
        orderCounter = 1;
    }

    private void generateInitialOrderData(){
        //GENERATING ITEMGROUP DATA
        ItemGroup itemGroup1 = new ItemGroup(1, itemStock.getItemById("Black Shoes"), 5, LocalDate.of(2018, 04, 01), 253.8);
        ItemGroup itemGroup2 = new ItemGroup(2, itemStock.getItemById("Black Shoes"), 3, LocalDate.of(2018, 04, 01), 94.7);
        ItemGroup itemGroup3 = new ItemGroup(3, itemStock.getItemById("Flip-flops"), 7, LocalDate.of(2018, 04, 02), 151.29);

        List<ItemGroup> listOfItemGroups1 = new ArrayList<>();
        listOfItemGroups1.add(itemGroup1);
        List<ItemGroup> listOfItemGroups2 = new ArrayList<>();
        listOfItemGroups2.add(itemGroup2);
        listOfItemGroups2.add(itemGroup3);

        order1 = new Order(listOfItemGroups1, "peterparker");
        orderRepository.put(order1.getOrderNumber(), order1);
        order2 = new Order(listOfItemGroups2, "maryjane");
        orderRepository.put(order2.getOrderNumber(), order2);
    }

    public List<Order> showAllOrdersInRepository(){
        List<Order> itemList = new ArrayList<>();
        itemList.addAll(orderRepository.values());
        return itemList;
    }

    public void addOrderToRepository(Order order){
        orderRepository.put(orderCounter, order);
        orderCounter++;
    }

}
