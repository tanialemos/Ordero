package be.tlemos.api.orders;

import be.tlemos.domain.orders.ItemGroup;
import be.tlemos.domain.orders.Order;

import javax.inject.Named;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Named
public class OrderMapper {

    public OrderDto mapOrderToDto(Order order){
        return new OrderDto(
                order.getOrderNumber(),
                order.getItemGroupList(),
                order.getCustomerId(),
                order.getTotalPrice()
        );
    }

//    public Order mapDtoToOrder(OrderDto orderDto){
//        List<ItemGroup> itemGroupList = new ArrayList<>(Arrays.asList(orderDto.getItemGroupList()));
//        return new Order(itemGroupList, orderDto.getCustomerId());
//    }
}
