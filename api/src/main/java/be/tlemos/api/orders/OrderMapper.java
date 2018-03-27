package be.tlemos.api.orders;

import be.tlemos.domain.orders.Order;

import javax.inject.Named;

@Named
public class OrderMapper {

    public static ItemGroupMapper itemGroupMapper = new ItemGroupMapper();

    public OrderDto mapOrderToDto(Order order){
        ItemGroupDto[] itemGroupDtos = itemGroupMapper.mapItemGroupToDto(order.getItemGroupList());
        return new OrderDto(
                order.getOrderNumber(),
                itemGroupDtos,
                order.getCustomerId(),
                order.getTotalPrice()
        );
    }

//    public Order mapDtoToOrder(OrderDto orderDto){
//        List<ItemGroup> itemGroupList = new ArrayList<>(Arrays.asList(orderDto.getItemGroupList()));
//        return new Order(itemGroupList, orderDto.getCustomerId());
//    }
}
