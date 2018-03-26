package be.tlemos.api.orders;

import be.tlemos.domain.orders.Order;

public class OrderMapper {

    public OrderDto mapOrderToDto(Order order){
        return new OrderDto(
                order.getOrderNumber(),
                order.showAllItemGroupsInOrder(),
                order.getCustomer(),
                order.getTotalPrice()
        );
    }
}
