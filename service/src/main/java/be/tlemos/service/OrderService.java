package be.tlemos.service;

import be.tlemos.domain.orders.Order;
import be.tlemos.domain.orders.OrderRepository;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named
public class OrderService {

    OrderRepository orderRepo;

    @Inject
    public OrderService(OrderRepository orderRepo) {
        this.orderRepo = orderRepo;
    }

    public List<Order> showAllExistingOrders(){
         return (orderRepo.showAllOrdersInRepository());
    }

}
